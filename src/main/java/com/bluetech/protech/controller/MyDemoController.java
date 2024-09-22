package com.bluetech.protech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.MyDemoDTO;
import com.bluetech.protech.pojo.MyDemo;
import com.bluetech.protech.service.MyDemoService;

@RestController
public class MyDemoController {

	@Autowired
	MyDemoService myDemoService;

	@GetMapping("/demo")
	public List<MyDemoDTO> getData() {
		return myDemoService.getData();
	}

	@PostMapping("/savedemo")
	public String saveDemo(@RequestBody List<MyDemoDTO> myDemo) {

		return myDemoService.saveDemo(myDemo);

	}
	
	@PutMapping("/updatedemo")
	public MyDemo updateDemo(MyDemoDTO myDemo) {
		return myDemoService.updateDemo(myDemo);
	}
	
	@DeleteMapping("/deletedemo/{id}")
	public String deleteDemoById(@PathVariable(name="id") int id) {
		return myDemoService.deleteDemoById(id);
	}
}
