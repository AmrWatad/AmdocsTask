package com.example.DataBase.web;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectRepository;
import com.example.DataBase.domain.Defect;
import com.example.DataBase.domain.ViewDefect;
import com.example.DataBase.domain.ViewDefects;

@RestController
public class DefectController {
	 @Autowired
     private DefectRepository repository;

	  @RequestMapping("/ViewDefect")
	  public ArrayList<ViewDefect> getViewDefect() {
	    return repository.getViewDefect();
	  }
}

