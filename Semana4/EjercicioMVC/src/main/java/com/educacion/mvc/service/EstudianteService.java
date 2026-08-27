/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.educacion.mvc.service;

import com.educacion.mvc.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Logica del negocio
 * @author edgardo
 */
public class EstudianteService {
    
    private static final List<Estudiante> listaEstudiantes = new ArrayList();
    private static int contadorId = 1;
    
    //Datos de prueba inicial
    static{
        listaEstudiantes.add(new Estudiante(contadorId++, "Edgardo Mendez","Mendez@gmail.com",9));
        listaEstudiantes.add(new Estudiante(contadorId++, "Licea","Itzel@gmail.com",9.5));
    
    }
    
    public List<Estudiante> ObtenerTodos(){
        return listaEstudiantes;
    }
    
    public void agregarEstudiantes(Estudiante estudiante){
        estudiante.setId(contadorId++);
        listaEstudiantes.add(estudiante);
    }    
}
