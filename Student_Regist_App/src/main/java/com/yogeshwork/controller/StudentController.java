package com.yogeshwork.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yogeshwork.binding.Student;
import com.yogeshwork.entity.StudentEntity;
import com.yogeshwork.repository.StudentRepository;

@Controller
public class StudentController 
{
	@Autowired
	public StudentRepository repo;
	
	//method to load student form
	@GetMapping("/")
	public String loadform(Model model) 
	{
		loadformdata(model);
		
		return "index";
	}
	private void loadformdata(Model model) 
	{
		List<String> coursesList = new ArrayList<>();
		coursesList.add("java");
		coursesList.add("devops");
		coursesList.add("Aws");
		coursesList.add("python");
		
		List<String> timingsList = new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");

		model.addAttribute("cources",coursesList);
		model.addAttribute("timings",timingsList);
		Student student = new Student();
		model.addAttribute("student",student);
	}
	//method to load student form data
	@PostMapping("/save")
	public String handleSubmit(Student s, Model model) 
	{
		System.out.println(s);
		
		//logic to save
		StudentEntity entity = new StudentEntity();
		
		//copy data from binding object to entity
		
		BeanUtils.copyProperties(s, entity);
		entity.setTimings(Arrays.toString(s.getTimings()));
		repo.save(entity);
		
		
		model.addAttribute("msg","Student saved");
		loadformdata(model);
		return "index";
		
	}
	
	//method to display saved student data
	@GetMapping("/viewStudents")
	public String getStudentsData(Model model) {
		
		//logic to fetch and send student data
		List<StudentEntity>  studentsList   =repo.findAll();
		model.addAttribute("students", studentsList);
		
		return "data";
		
	}

}
