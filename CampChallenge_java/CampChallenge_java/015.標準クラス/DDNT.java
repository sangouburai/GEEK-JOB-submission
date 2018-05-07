/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dayprac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class DDNT extends HttpServlet {
    
    
      public static void TL(PrintWriter pw) {
        
        Calendar c = Calendar.getInstance();

        
        c.set(2016, 11, 4, 10, 0, 0);
        
        pw.print(c.get(Calendar.YEAR) + "年");
        pw.print(c.get(Calendar.MONTH) + "月");
        pw.print(c.get(Calendar.DAY_OF_MONTH) + "日");
        pw.print(c.get(Calendar.HOUR_OF_DAY) + "時");
        pw.print(c.get(Calendar.MINUTE) + "分");
        pw.print(c.get(Calendar.SECOND) + "秒" +"<br>");
        
           pw.print(c.get(Calendar.YEAR) + "-");
        pw.print(c.get(Calendar.MONTH) + "-");
        pw.print("0" + c.get(Calendar.DAY_OF_MONTH) + "   ");
        pw.print(c.get(Calendar.HOUR_OF_DAY) + ":");
        pw.print("0" + c.get(Calendar.MINUTE) + ":");
        pw.print("0" + c.get(Calendar.SECOND) + "");
        
    }

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DDNT</title>");            
            out.println("</head>");
            out.println("<body>");
            TL(out);
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
