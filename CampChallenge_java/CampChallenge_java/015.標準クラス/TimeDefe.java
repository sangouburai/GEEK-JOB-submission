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
public class TimeDefe extends HttpServlet {
    
    
    public static void AL(PrintWriter pw) {
        // カレンダーインスタンスの作成
        Calendar c = Calendar.getInstance();
        Calendar d = Calendar.getInstance();
        
        c.set(2015,0, 1, 0, 0, 0);
        d.set(2015,11, 31, 23, 59, 59);
        
        pw.print("cからdへの経過時間は"+"<br>");
        pw.print(d.get(Calendar.YEAR) - c.get(Calendar.YEAR) + "年");
        pw.print(d.get(Calendar.MONTH) - c.get(Calendar.MONTH) + "カ月");
        pw.print(d.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH) + "日");
        pw.print(d.get(Calendar.HOUR_OF_DAY) - c.get(Calendar.HOUR_OF_DAY) + "時");
        pw.print(d.get(Calendar.MINUTE) - c.get(Calendar.MINUTE) + "分");
        pw.print(d.get(Calendar.SECOND) - c.get(Calendar.SECOND) + "秒" +"<br>");

        
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
            out.println("<title>Servlet TimeDefe</title>");            
            out.println("</head>");
            out.println("<body>");
            AL(out);
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
