/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biblioteca.dao;

import com.example.biblioteca.model.Actor;
import java.util.List;

/**
 *
 * @author KAREN
 */
public interface actorDao {
    int create(Actor acr);
    int update(Actor acr);
    int delete(int id);
    Actor read(int id);
    List<Actor> readAll();
}
