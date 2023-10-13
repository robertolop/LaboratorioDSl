<%-- 
    Document   : PanelAdministrador
    Created on : 13 oct 2023, 17:04:47
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div><<h1>Sistema Escolar</h1></div>
        <% String usuario = request.getParameter("tfUsuario");%>
        <div><h2><strong>Bienvenido, <%= ususario %></strong></h2></div>
        
        <%-- Directiva Include --%>
        <br>
        <div><h3>Menu de opciones</h3></div>
        <div>
            <%@include file="MenuAdministrador.jsp" %>
          </div>
          <div>
            <%@include file="Footer.jsp" %>
          </div>
        
    </body>
</html>
