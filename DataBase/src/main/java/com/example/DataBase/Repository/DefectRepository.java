package com.example.DataBase.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.DataBase.domain.App;
import com.example.DataBase.domain.Defect;
import com.example.DataBase.domain.ViewDefect;

public interface DefectRepository extends CrudRepository<Defect, Long>  {

		@Query(nativeQuery= true, value = "select * from defect d where d.error_code= ?1")
	List<Defect> checkDefectexist(String errorCode);
		@Query(nativeQuery = true)
		ArrayList<ViewDefect> getViewDefect();


}
