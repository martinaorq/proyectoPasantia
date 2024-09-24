package com.example.springjava2.web.rest;

import com.example.springjava2.Auto;
import com.example.springjava2.repository.AutoDao;
import com.example.springjava2.repository.AutoRepository;
import com.example.springjava2.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("concesionaria")
public class AutoResource {
    private final AutoRepository repository;

    private final AutoDao dao;

    @Autowired
    AutoService autoService;

    public AutoResource(AutoRepository repository, AutoDao dao) {
        this.repository = repository;
        this.dao = dao;
    }


    @PostMapping("auto")
    public Auto crearAuto(@RequestBody Auto auto){
        Auto autoCreado = autoService.crearAuto(auto);
        return autoCreado;
    }

    @GetMapping("autos/{color}")
    public List<Auto> obtenerAutosPorColor(@PathVariable("color") String color){
        return autoService.obtenerAutosPorColor(color);
    }

    @GetMapping("autosConPantallita")
    public List<Auto> obtenerAutosConPantallita(){
        return repository.findByPantallitaTrue();
    }

    @GetMapping("autosPantallita/{color}/{page}/{pageSize}")
    public Page<Auto> obtenerAutosPorColorConPantallita(@PathVariable("color") String color,
                                                        @PathVariable("page")int page,
                                                        @PathVariable("pageSize")int pageSize){
        return dao.findAutosByColorAndPantallita(color,page,pageSize);
    }
}
