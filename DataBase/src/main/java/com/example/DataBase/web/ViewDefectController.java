package com.example.DataBase.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataBase.Repository.DefectInstanceRepository;
import com.example.DataBase.domain.AppCount;
import com.example.DataBase.domain.DefectInstanceCount;
import com.example.DataBase.domain.ViewDefects;

@RestController
public class ViewDefectController {
	@Autowired
	private DefectInstanceRepository repository;

	@RequestMapping("/ViewDefects")
	public ArrayList<ViewDefects> getViewDefects() {

		return repository.getViewDefects();
	}
	
	 @RequestMapping("/DefectInstanceCount")
     public ArrayList<DefectInstanceCount> getAppsCount() {
		 return repository.getDefectsCount();
     } 
}
