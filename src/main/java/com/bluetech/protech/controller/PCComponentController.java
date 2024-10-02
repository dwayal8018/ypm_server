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
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.PCComponentDTO;
import com.bluetech.protech.service.PCComponentService;

@RestController
@RequestMapping("/api/pc-components")
public class PCComponentController {


    @Autowired
    private PCComponentService pcComponentService;

    @PostMapping
    public ResponseEntity<List<PCComponentDTO>> createPCComponents(@RequestBody PCComponentDTO pcComponent) {
        List<PCComponentDTO> createdComponents = pcComponentService.createPCComponent(Arrays.asList(pcComponent));
        return new ResponseEntity<>(createdComponents, HttpStatus.CREATED);
    }

    // Uncomment the method below if you want to allow creating multiple components at once
    /*
    @PostMapping
    public ResponseEntity<List<PCComponentDTO>> createPCComponents(@RequestBody List<PCComponentDTO> pcComponentList) {
        List<PCComponentDTO> createdComponents = pcComponentService.createPCComponent(pcComponentList);
        return new ResponseEntity<>(createdComponents, HttpStatus.CREATED);
    }
    */

    @GetMapping
    public ResponseEntity<List<PCComponentDTO>> getAllPCComponents() {
        List<PCComponentDTO> components = pcComponentService.getAllPCComponents();
        return new ResponseEntity<>(components, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PCComponentDTO> getPCComponentById(@PathVariable Integer id) {
        Optional<PCComponentDTO> component = pcComponentService.getPCComponentById(id);
        return component.map(pcComponent -> new ResponseEntity<>(pcComponent, HttpStatus.OK))
                        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePCComponent(@PathVariable Integer id) {
        pcComponentService.deletePCComponent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
