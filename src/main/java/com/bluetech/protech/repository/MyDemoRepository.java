package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.MyDemo;

public interface MyDemoRepository extends JpaRepository<MyDemo, Integer> {

}
