<%-- 
    Document   : MenuAdministrador
    Created on : 13 oct 2023, 17:07:55
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Principal</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <div><h1>Bienvenido al Sistema del Hotel 1.0</h1></div>
        
        <nav>
            <ul>
                <li><a  href="/Hotel">Inicio Sistema Del Hotel</a></li>
                 <li><a  href="/Hotel?accion=Login">Login</a></li>
                  <li><a  href="/Hotel?accion=RegistroEmpleado">Registro De Empleado</a></li>
                  <li><a  href="/Hotel?accion=RegistroReservacion">Registro De Reservacion</a></li>
                  <li><a  href="/Hotel?accion=RegistroHabitacion">Registro De Habitacion</a></li>
                  <li><a  href="/Hotel?accion=RegistroClientes">Registro De Clientes</a></li>
            </ul>
            
        </nav>
        
    </body>
</html>
