/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.educacion.mvc.model;

/**
 *
 * clase modelo la informacion del alumno
 * @author edgardo
 */
public class Estudiante {
    //atrubutos
    private int id;
    private String nombre;
    private String email;
    private double promedio;
    
    //Constructor sin argumentos
    
    public Estudiante(){
    
    }
    
    public Estudiante (int id, String nombre, String email, double promedio){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.promedio = promedio;
    }
    
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
        
    }
    
    
    
    
}
