package com.example.DataBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.Repository.DefectRepository;
import com.example.DataBase.Repository.LogFileRepository;
import com.example.DataBase.Routing.LogFileRouting;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DataBaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(DataBaseApplication.class);

	  @Autowired 
  private AppRepository appRepository;

  @Autowired 
  private DefectRepository defectRepository;
  
  @Autowired 
  private LogFileRepository logFileRepository;
  
  @Autowired 
  private DefectInstanceRepository defectInstanceRepository;
	
	  
	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
		logger.info("Hello sping boot");

	}
	 @Bean
     CommandLineRunner runner(){
       return args -> {
    	   
    	   String searchStr = "Caused by";
  			File file = new File("C:\\Users\\Amr\\Desktop\\AmdocsLog-master\\TestLog.log");

   			LogFileRouting routingtotables = new LogFileRouting();
   			routingtotables.SearchDefects(file, searchStr,appRepository,defectRepository, logFileRepository,defectInstanceRepository);
   			
   		
       };
	 }
}

