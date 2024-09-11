package com.example.springjava2.web.rest;

import com.example.springjava2.Auto;
import com.example.springjava2.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("concesionaria")
public class AutoResource {

    @Autowired
    AutoService autoService;

    @PostMapping("auto")
    public Auto crearAuto(@RequestBody Auto auto){
        Auto autoCreado = autoService.crearAuto(auto);
        return autoCreado;
    }
}
