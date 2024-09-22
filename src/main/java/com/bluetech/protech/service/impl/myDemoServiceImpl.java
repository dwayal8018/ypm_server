package com.bluetech.protech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.MyDemoDTO;
import com.bluetech.protech.mapstruct.Mapstruct;
import com.bluetech.protech.pojo.MyDemo;
import com.bluetech.protech.repository.MyDemoRepository;
import com.bluetech.protech.service.MyDemoService;

@Service
public class myDemoServiceImpl implements MyDemoService {

	@Override
	public List<MyDemoDTO> getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveDemo(List<MyDemoDTO> myDemo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyDemo updateDemo(MyDemoDTO myDemo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDemoById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private MyDemoRepository myDemoRepository;
//
//	@Autowired
//	Mapstruct mapstruct;
//
//	@Override
//	public List<MyDemoDTO> getData() {
//
//		return mapstruct.mapMyDemoDTOList(myDemoRepository.findAll());
//	}
//
//	@Override
//	public String saveDemo(List<MyDemoDTO> myDemoDTOList) {
//
//		myDemoRepository.saveAll(mapstruct.mapMyDemoList(myDemoDTOList));
//		return "Saved successfully!";
//	}
//
//	@Override
//	public MyDemo updateDemo(MyDemoDTO myDemoDTO) {
//
//		
//		try {
//			return myDemoRepository.save(mapstruct.mapMyDemoList(myDemoDTO));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null ;
//		}
//	}
//
//	@Override
//	public String deleteDemoById(Integer id) {
//		myDemoRepository.deleteById(id);
//		
//		return "Deleted successfully!";
//	}

}
