/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.daoImpl;

import com.example.biblioteca.dao.actorDao;
import com.example.biblioteca.model.Actor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KAREN
 */
@Repository
public class actorDaoImpl implements actorDao {
  @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Actor acr) {
        String SQL ="INSERT INTO actor(nombre, apellido, correo) VALUES(?,?,?)";
        return jdbcTemplate.update(SQL,new Object[]{acr.getNombre(),acr.getApellido(),acr.getCorreo()});
    }

    @Override
    public int update(Actor acr) {
      String SQL ="UPDATE actor SET nombre=?, apellido=?, correo=? WHERE idactor=?";  
      return jdbcTemplate.update(SQL,new Object[]{acr.getNombre(),acr.getApellido(),acr.getCorreo(),acr.getIdactor()});
    }

    @Override
    public int delete(int id) {
        String SQL ="DELETE FROM actor WHERE idactor=?"; 
        return jdbcTemplate.update(SQL,id);
    }

    @Override
    public Actor read(int id) {
        String SQL ="SELECT *FROM actor WHERE idactor=?";
        try {
            Actor actor = jdbcTemplate.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Actor.class),id);
            return actor;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Actor> readAll() {
        
       return jdbcTemplate.query("select idactor,nombre,apellido,correo from actor", BeanPropertyRowMapper.newInstance(Actor.class));
    }
    
}
