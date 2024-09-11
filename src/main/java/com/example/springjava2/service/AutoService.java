package com.example.springjava2.service;

import com.example.springjava2.Auto;
import com.example.springjava2.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoService {

    @Autowired
    AutoRepository autoRepository;
    public Auto crearAuto(Auto auto){
        return autoRepository.save(auto);
    }
}
