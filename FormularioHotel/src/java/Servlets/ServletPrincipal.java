/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rober
 */
@WebServlet(name = "ServletPrincipal", urlPatterns = {"/ServletPrincipal"})
public class ServletPrincipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrincipal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            
            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String opinion = request.getParameter("opinion");
            String comentarios = request.getParameter("comentarios");
            String habitacion = request.getParameter("habitacion");
            String departamento = request.getParameter("departamento");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String email = request.getParameter("email");
            String FechaDeIngreso = request.getParameter("FechaDeIngreso");
            String FechaDeSalida = request.getParameter("FechaDeSalida");
            
        
            
            
            out.println("<h1>Registro Exitoso De Cliente</h1>");
            out.println("<strong>Nombres: </strong>" + nombres);
            out.println("<br><strong>Apellidos: </strong>" + apellidos);
            out.println("<br><strong>Habitacion: </strong>" + habitacion);
            out.println("<br><strong>Departamento: </strong>" + departamento);
             out.println("<br><strong>Direccion: </strong>" + direccion);
             out.println("<br><strong>Telefono: </strong>" + telefono);
             out.println("<br><strong>Email: </strong>" + email);
             out.println("<br><strong>FechaDeIngreso: </strong>" + FechaDeIngreso);
             out.println("<br><strong>FechaDeSalida: </strong>" + FechaDeSalida);
            out.println("<br><br><strong>Opinión: </strong>" + opinion);
            out.println("<br><strong>Comentarios: " + comentarios);
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
