package com.student.credoprdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.credoprdemo.entities.Student;
import com.student.credoprdemo.repos.StudentRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	StudentRepository resository;
	
	@RequestMapping(value="/Students/", method=RequestMethod.GET)
	public List<Student> getStudents()
	{
		return resository.findAll();
	}
	
	@RequestMapping(value="/Students/{id}", method=RequestMethod.GET)
	public Student getStudents(@PathVariable int id)
	{
		return resository.findById(id).get();
	}
	
	@RequestMapping(value="/Students/", method=RequestMethod.POST)
	public Student createStudents(@RequestBody Student student)
	{
		return resository.save(student);
	}
	

	@RequestMapping(value="/Students/", method=RequestMethod.PUT)
	public Student updateStudents(@RequestBody Student student)
	{
		return resository.save(student);
	}
	
	@RequestMapping(value="/Students/{id}", method=RequestMethod.DELETE)
	public void deleteStudents(@PathVariable int id)
	{
		resository.deleteById(id);
	}

}
