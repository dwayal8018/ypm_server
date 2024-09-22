package com.bluetech.protech.service;

import java.util.List;

import com.bluetech.protech.dto.MyDemoDTO;
import com.bluetech.protech.pojo.MyDemo;

public interface MyDemoService {

	List<MyDemoDTO> getData();

	String saveDemo(List<MyDemoDTO> myDemo);

	MyDemo updateDemo(MyDemoDTO myDemo);

	String deleteDemoById(Integer id);

}
