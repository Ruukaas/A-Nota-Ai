/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ANotaAi.controller;

import com.example.ANotaAi.model.Usuario;
import com.example.ANotaAi.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;
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

/**
 *
 * @author euluc
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepo;
    
    @PostMapping
    
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        usuarioRepo.save(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<Usuario>> readAll() {
        List<Usuario> allUsers = new ArrayList<>();
        usuarioRepo.findAll().forEach(allUsers::add);
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> read(@PathVariable("id") int id) {
        Usuario usr = usuarioRepo.findById(id).get();
        return new ResponseEntity<Usuario>(usr, HttpStatus.OK);
    }
    
    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Usuario usuario) {
        usuarioRepo.save(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        usuarioRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
