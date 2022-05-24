/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author KAREN
 */
public class actorIndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
