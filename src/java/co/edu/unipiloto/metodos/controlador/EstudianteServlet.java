/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.controlador;

import co.edu.unipiloto.metodos.estud.Estudiante;
import co.edu.unipiloto.metodos.estud.EstudianteDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tatiana
 */
@WebServlet(name = "EstudianteServlet", urlPatterns = {"/EstudianteServlet"})
public class EstudianteServlet extends HttpServlet {
     @EJB
     private EstudianteDaoLocal EstudianteDao;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
         String action = request.getParameter("action");
         String EstudianteIdSrt = request.getParameter("EstudianteId");
         int EstudianteId =0;
         if(EstudianteIdSrt!=null && !EstudianteIdSrt.equals(""))
         EstudianteId=Integer.parseInt(EstudianteIdSrt);
         //int EstudianteId = EstudianteIdSrt.equals("") ? 0 : Integer.parseInt(EstudianteIdSrt);
         String Nombre = request.getParameter("Nombre");
         String Apellido = request.getParameter("Apellido");
         String NivelAñoSrt = request.getParameter("NivelAño");
         int NivelAño = 0;
         if(NivelAñoSrt!=null && !NivelAñoSrt.equals(""))
             NivelAño=Integer.parseInt(NivelAñoSrt);
         
         
             
         Estudiante estudiante = new Estudiante(EstudianteId, Nombre, Apellido, NivelAño);
         if("add".equalsIgnoreCase(action)){
             EstudianteDao.addEstudiante(estudiante);
         }else if("Edit".equalsIgnoreCase(action)){
             EstudianteDao.editEstudiante(estudiante);             
         }else if("Delete".equalsIgnoreCase(action)){
             EstudianteDao.deleteEstudiante(EstudianteId);             
         }else if("Search".equalsIgnoreCase(action)){
             estudiante = EstudianteDao.getEstudiante(EstudianteId);
                          
         }
         request.setAttribute("Estudiante",estudiante);
         request.setAttribute("AllEstudiante",EstudianteDao.getAllEstudiantes());
         request.getRequestDispatcher("Index.html").forward(request, response);
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
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  

