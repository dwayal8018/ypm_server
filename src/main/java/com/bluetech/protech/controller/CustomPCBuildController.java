package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.CustomPCBuildDTO;
import com.bluetech.protech.service.CustomPCBuildService;

@RestController
@RequestMapping("/api/custom-pc-builds")
public class CustomPCBuildController {

    @Autowired
    private CustomPCBuildService customPCBuildService;

    @PostMapping
    public ResponseEntity<List<CustomPCBuildDTO>> createCustomPCBuild(@RequestBody CustomPCBuildDTO customPCBuildList) {
        List<CustomPCBuildDTO> createdBuilds = customPCBuildService.createCustomPCBuild(Arrays.asList(customPCBuildList));
        return new ResponseEntity<>(createdBuilds, HttpStatus.CREATED);
    }
//    @PostMapping
//    public ResponseEntity<List<CustomPCBuildDTO>> createCustomPCBuilds(@RequestBody List<CustomPCBuildDTO> customPCBuildList) {
//    	List<CustomPCBuildDTO> createdBuilds = customPCBuildService.createCustomPCBuild(customPCBuildList);
//    	return new ResponseEntity<>(createdBuilds, HttpStatus.CREATED);
//    }

    @GetMapping
    public ResponseEntity<List<CustomPCBuildDTO>> getAllCustomPCBuilds(@RequestParam(name = "userRole") String userRole, @RequestParam(name = "userID") Integer userID) {
        List<CustomPCBuildDTO> builds = customPCBuildService.getAllCustomPCBuilds(userRole,userID);
        return new ResponseEntity<>(builds, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomPCBuildDTO> getCustomPCBuildById(@PathVariable Integer id) {
        Optional<CustomPCBuildDTO> build = customPCBuildService.getCustomPCBuildById(id);
        return build.map(customPCBuild -> new ResponseEntity<>(customPCBuild, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomPCBuild(@PathVariable Integer id) {
    customPCBuildService.deleteCustomPCBuild(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
