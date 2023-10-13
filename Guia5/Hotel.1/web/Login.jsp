<%-- 
    Document   : Login
    Created on : 13 oct 2023, 17:03:17
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicar Sesion</title>
    </head>
    <body>
        <form method="POST" action="/SistemaWed/ServletPrincipal?accion=Login" id="formLogin"> 
            <div id="resultLogin"></div>
            <div><h1>Iniciar Sesion</h1></div>
            <%-- insercion de comentarios Java --%>
            <%-- Manera antigua y sin formato --%>
            <div><label>Fecha actual: <strong><%= new java.util.Date().toString()%></strong> 
                    <%-- Forma legible --%>
                    <%
                      java.util.Date fechaActual = new java.util.Date();
                      java.text.SimpleDateFormat sdf =new java.text.SimpleDateFormat("dd/MM/YYY");
                      String fechaActualLegible = sdf.format(fechaActual);
                      %>
                   <div> <label>Fecha actual: <strong><%= fechaActualLegible %></strong>
                    <div><label>Usuario:</label></div>
                    <div><input type="text" name="tfUsuario" id="idtfUsuario"></div><br>
                    <div><label>Contraseña:</label></div>
                    <div><input type="password" name="tfContraseña" id="idtfContraseña"></div><br>
                    <div><input type="submit" value="Iniciar Sesion"></div><br>

                    </form>

                    <button onclick="Regresar()">Regresar</button>
                    <script>
                        function Regresar() {
                            window.history.back();
                        }
                    </script>
                    </body>
                    </html>
