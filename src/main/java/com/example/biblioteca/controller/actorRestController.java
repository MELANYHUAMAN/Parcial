/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controller;

import com.example.biblioteca.model.Actor;
import com.example.biblioteca.service.actorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KAREN
 */
@RestController
@RequestMapping("/actor")
public class actorRestController {
    @Autowired
    private actorService ActorService;

    @GetMapping("/all")
    public List<Actor> getActor() {
        return ActorService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable int id) {
        Actor actor= ActorService.read(id);
        return ResponseEntity.ok(actor);
    }

    @DeleteMapping("/{id}")
    public int deleteActor(@PathVariable int id) {        
        return ActorService.delete(id);
    }
    @PostMapping("/add")
    public int addActor(@RequestBody Actor actor) {  
        System.out.println(actor.getNombre());
        System.out.println(actor.getApellido());
        System.out.println(actor.getCorreo());
        return ActorService.create(actor);
    }
    @PutMapping("/edit")
    public int editActor(@RequestBody Actor actor) {  
        Actor bib = new Actor(actor.getIdactor(), actor.getNombre(),actor.getApellido(), actor.getCorreo());
        System.out.println(actor.getIdactor()+" , "+actor.getNombre()+","+actor.getApellido()+","+actor.getCorreo());
        return ActorService.update(bib);
    }
}
