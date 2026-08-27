<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- URI clásica de JSTL para Java EE (javax) -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestión de Estudiantes - Java EE 8 MVC</title>
    <style>
        body { font-family: 'Segoe UI', Arial, sans-serif; margin: 30px; background-color: #f8f9fa; color: #333; }
        h1, h2 { color: #1B365D; }
        table { width: 100%; border-collapse: collapse; background: white; margin-bottom: 25px; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
        th, td { padding: 12px; text-align: left; border-bottom: 1px solid #ddd; }
        th { background-color: #1B365D; color: white; }
        tr:hover { background-color: #f1f1f1; }
        .form-container { background: white; padding: 20px; border-radius: 6px; box-shadow: 0 2px 5px rgba(0,0,0,0.1); max-width: 500px; }
        .form-group { margin-bottom: 12px; }
        label { display: block; font-weight: bold; margin-bottom: 5px; color: #008080; }
        input[type="text"], input[type="email"], input[type="number"] { width: 95%; padding: 8px; border: 1px solid #ccc; border-radius: 4px; }
        button { background-color: #008080; color: white; border: none; padding: 10px 18px; font-weight: bold; cursor: pointer; border-radius: 4px; }
        button:hover { background-color: #1B365D; }
    </style>
</head>
<body>
    <h1>🏛️ Control de Alumnos - Java EE 8 (javax)</h1>
    
    <h2>Listado de Estudiantes Registrados</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre Completo</th>
                <th>Correo Electrónico</th>
               <th>Promedio</th>
            </tr>
        </thead>
        <tbody>
            <!-- Renderizado dinámico de la lista enviada por el Servlet -->
            <c:forEach var="est" items="${listaEstudiantes}">
                <tr>
                   <td>${est.id}</td>
                   <td>${est.nombre}</td>
                   <td>${est.email}</td>
                   <td><strong>${est.promedio}</strong></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div class="form-container">
        <h2>Registrar Nuevo Estudiante</h2>
        <form action="${pageContext.request.contextPath}/estudiantes" method="POST">
            <div class="form-group">
                <label for="nombre">Nombre Completo:</label>
                <input type="text" id="nombre" name="nombre" required placeholder="Ej. Ana Martínez">
            </div>
            <div class="form-group">
                <label for="email">Correo Electrónico:</label>
                <input type="email" id="email" name="email" required placeholder="ejemplo@correo.com">
            </div>
            <div class="form-group">
                <label for="promedio">Promedio General:</label>
                <input type="number" step="0.1" id="promedio" name="promedio" min="0" max="10" required placeholder="Ej. 9.5">
            </div>
            <button type="submit">Guardar Estudiante</button>
        </form>
    </div>
</body>
</html>