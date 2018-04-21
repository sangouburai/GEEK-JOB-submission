/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author musag
 */
public class methodtest extends HttpServlet {
    ArrayList<Integer> myhands = new ArrayList<Integer>();
  ArrayList<Integer> mycards = new ArrayList<Integer>();
      ArrayList<Integer> cards = new ArrayList<Integer>();
      ArrayList<Integer> counter = new ArrayList<Integer>();
  int countr = 2;
  
   
   
    
   
   
    
    
    int open(){
         
         int sum = 0;
        for (int i=0; i<mycards.size(); i++) {
            int num = mycards.get(i);
            sum += num;}
         
         return sum;
                
        
    }
    
    void setCard(ArrayList<Integer> cards){
         
          mycards.add(hit(cards).get(hit(cards).size()));
         }
    
    
   
    boolean checkSum(int open){
        
        if ( open <=16 ){return true;} //
        else{
        myhands.add(open);    return false;}
    }     
    
    
    
      
 

    
    
   
            
            
   void Dealer ()
        { for (int i = 1; i <= 13; i++){  
        for (int j = 0; j < 4; j++)
        cards.add(i);}
        Collections.shuffle(cards);
            }
    
     void deal(ArrayList<Integer> cards){
    
    mycards.add(cards.get(0));
    mycards.add(cards.get(1));
      
    }
   
     ArrayList<Integer> hit(ArrayList<Integer> cards){
       ArrayList<Integer> hitcards = new ArrayList<Integer>();
        hitcards.add(countr++);
        
        return hitcards; 
       }
       
        
    

    void Printer (PrintWriter pw){
     Dealer();
     deal(cards);
     setCard(cards);
     
    
    
     
    
     pw.print(cards);
     pw.print(mycards);
     pw.print(myhands);
     if(mycards.get(0) == mycards.get(1)) {pw.print("SPLIT(処理内容はこれから)");}
     if(myhands.get(0) > 22) {pw.print("BUST!!!");}
    
     
     
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
            out.println("<title>Servlet methodtest</title>");            
            out.println("</head>");
            out.println("<body>");
            Printer(out);
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
