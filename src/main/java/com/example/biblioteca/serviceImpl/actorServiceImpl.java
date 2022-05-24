/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.serviceImpl;

import com.example.biblioteca.dao.actorDao;
import com.example.biblioteca.model.Actor;
import com.example.biblioteca.service.actorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KAREN
 */
@Repository
public class actorServiceImpl implements actorService {
@Autowired
    private actorDao ActorDao;
    @Override
    public int create(Actor acr) {
    return ActorDao.create(acr);
    }

    @Override
    public int update(Actor acr) {
       return ActorDao.update(acr);
    }

    @Override
    public int delete(int id) {
       return ActorDao.delete(id);
    }

    @Override
    public Actor read(int id) {
     return ActorDao.read(id);
    }

    @Override
    public List<Actor> readAll() {
        return ActorDao.readAll();
    }
    
}
