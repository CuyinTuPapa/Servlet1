/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luisc
 */
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String par1 = null;
            String par2 = null;
            String par3 = null;
            String edad1 = null;
            String edad2 = null;
            String edad3 = null;
            par1 = request.getParameter("para1");
            par2 = request.getParameter("para2");
            par3 = request.getParameter("para3");
            edad1 = request.getParameter("año1");
            edad2 = request.getParameter("año2");
            edad3 = request.getParameter("año3");
            int años1 = Integer.parseInt(edad1);
            int años2 = Integer.parseInt(edad2);
            int años3 = Integer.parseInt(edad3);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Orden de mayor a menor:" + "</h1>");
            if (años1 > años2) {
                if(años1 > años3) {
                    out.println("<ul>");
                    out.println("<li><h2>Mi mamá se llama " + par1+ " y su edad es " + edad1 + "</h2></li>");
                    out.println("<li><h2>Mi hermano se llama " + par2 + " y su edad es " + edad2 + "</h2></li>");
                    out.println("<li><h2>Mi nombre es " + par3 + " y mi edad es " + edad3 + "</h2></li>");
                    out.println("</ul>");
                }
            }
            out.println("<h1> De menor a mayor:" + "</h1>");
                if(años3 < años2) {
                    if(años3 < años1) {
                        out.println("<ul>");
                        out.println("<li><h2>Mi nombre es " + par3 + " y mi edad es " + edad3 + "</h2></li>");
                        out.println("<li><h2>Mi hermano se llama " + par2+ " y su edad es " + edad2 + "</h2></li>");
                        out.println("<li><h2>Mi mamá se llama " + par1+ " y su edad es " + edad1 + "</h2></li>");
                        out.println("</ul>");
                    }
                }
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
            
    