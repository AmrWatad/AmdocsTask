package com.example.DataBase.web;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.AppRepository;
import com.example.DataBase.domain.App;
import com.example.DataBase.domain.AppCount;
import com.example.DataBase.domain.ViewDefect;

@RestController
public class LogController {
	 @Autowired
     private AppRepository repository;

	 
	 @RequestMapping("/app")
     public Iterable<App> getApp() {
		 return repository.findAll();
     } 

	 @RequestMapping("/AppCount")
     public ArrayList<AppCount> getAppsCount() {
		 return repository.getAppsCount();
     } 
	 
}
