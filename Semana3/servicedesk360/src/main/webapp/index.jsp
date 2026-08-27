<%-- 
    Document   : index
    Created on : 31 jul 2026, 6:35:41 p. m.
    Author     : Edgardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="acciones-formulario"> 
            <a href="${pageContext.request.contextPath}/registro"> 
                Crear cuenta temporal 
            </a> 
            <a href="${pageContext.request.contextPath}/acceso"> 
                Iniciar acceso 
            </a> 
        </div> 
    </body>
</html>
