/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author KAREN
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    private int idactor;
    private String nombre;
    private String apellido;
    private String correo;
}
