package com.example.DataBase.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;

@Entity


@SqlResultSetMapping(
		name="AppCount",
	    classes={
	        @ConstructorResult(
	        		targetClass=AppCount.class,
	            columns={
	              
	                @ColumnResult(name="Name", type = String.class),
	                @ColumnResult(name="count", type = String.class),
	              //  @ColumnResult(name="Sol", type = String.class)
	            }
	        )
	    }
	)

@NamedNativeQuery(name = "App.getAppsCount", 
		query = "select  d.name, count(d.NAME) as count "
		+ "from  App d group by d.NAME ", resultSetMapping = "AppCount")

public class App {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name, type;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "app")
    private List<DefectInstance> defects;

//-------------------------------------constructors--------------------------------------------------------------	
	public App() {
	}

	public App(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

//----------------------------------------getters and setters----------------------------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//----------------------------------------------------------@Override-----------------------------------------------------------------
	
//		@Override
//	  public boolean equals(Object object)
//	  {
//	      boolean sameSame = false;
//
//	      if (object != null && object instanceof App)
//	      {
//	          sameSame = (this.getName() == ((App) object).getName() && this.getType() == ((App) object).getType());
//	      }
//
//	      return sameSame;
//	  }

	}

