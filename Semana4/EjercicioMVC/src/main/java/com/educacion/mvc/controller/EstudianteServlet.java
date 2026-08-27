/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.educacion.mvc.controller;

import com.educacion.mvc.model.Estudiante;
import com.educacion.mvc.service.EstudianteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author edgardo
 */

@WebServlet(name= "EstudianteServlet",urlPatterns ={"/estudiantes"} )
public class EstudianteServlet extends HttpServlet  {
    private final EstudianteService estudianteService = new EstudianteService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse  response)
             throws ServletException, IOException{
        // obtener la lista de estudiantes del servicio del modelo
        List<Estudiante> estudiantes = estudianteService.ObtenerTodos();
        // colocar los datos en el alcance de la peticion HTTP
        request.setAttribute("listaEstudiante", estudiantes);
        // despachar el contro a la vista 
        request.getRequestDispatcher("/listar-estudiante.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Garantizar la lectura de acentos y caracteres UTF-8
        request.setCharacterEncoding("UTF-8");
        // 1. Leer parámetros del formulario HTML
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        double promedio = Double.parseDouble(request.getParameter("promedio"));
 
        // 2. Instanciar el modelo con los datos ingresados
        Estudiante nuevoEstudiante = new Estudiante(0, nombre, email, promedio);
 
        // 3. Almacenar el registro mediante el servicio
        estudianteService.agregarEstudiantes(nuevoEstudiante);
 
        // 4. Redirección PRG (Post-Redirect-Get) para evitar reenvíos de formulario
        response.sendRedirect(request.getContextPath() + "/estudiantes");
    }
 
}
    
    
   
