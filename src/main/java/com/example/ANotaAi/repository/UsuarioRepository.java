/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ANotaAi.repository;

import com.example.ANotaAi.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author euluc
 */
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    
}
