/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

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
 * @author guest1Day
 */
public class act extends HttpServlet {
    
        ArrayList<Integer> myhands = new ArrayList<Integer>();
  ArrayList<Integer> mycards = new ArrayList<Integer>();
      ArrayList<Integer> cards = new ArrayList<Integer>();
      ArrayList<Integer> Usercards = new ArrayList<Integer>();
      ArrayList<Integer> Userhands = new ArrayList<Integer>();
      ArrayList<Integer> Dealercards = new ArrayList<Integer>();
      ArrayList<Integer> Dealerhands = new ArrayList<Integer>();
     int countr = 0;
      
      public int Uopen(){
         
         int sum = 0;
        for (int i=0; i<Usercards.size(); i++) {
            int num = Usercards.get(i);
            sum += num;}
         
         return sum;
                
        
    }
    
   public void UsetCard(ArrayList<Integer> cards){
         while(UcheckSum(Uopen())== true){
         Usercards.add(Uhit(cards));}
         
    }
    
   
   public boolean UcheckSum(int open){
        
        if ( open <=16 ){return true;} //
        else{
        Userhands.add(open);   
        return false;}
    }     

   public Integer Uhit(ArrayList<Integer> cards){
       
        
        return cards.get(countr++);}
    
   public void UDealer ()
        { for (int i = 1; i <= 13; i++){  
        for (int j = 0; j < 4; j++) // 1~52のカードを用意して13で割り、商（0，1，2，3）をそれぞれのスート（トランプのマーク）、
            //余りをカードの数値（0＝13）とすることで4種類分のスート管理も可能、、、？（＜追記.52の場合は？（商4、余り0）
        cards.add(i);}
        Collections.shuffle(cards); 
            }
    
    public void Udeal(ArrayList<Integer> cards){
    
    Usercards.add(cards.get(countr++));
    Usercards.add(cards.get(countr++));
    }
    
    public int Dopen(){
         
         int sum = 0;
        for (int i=0; i< Dealercards.size(); i++) {
            int num =  Dealercards.get(i);
            sum += num;}
         
         return sum;
                
        
    }
    
   public void DsetCard(ArrayList<Integer> cards){
         while(DcheckSum(Dopen())== true){
          Dealercards.add(Dhit(cards));}
         
    }
    
   
   public boolean DcheckSum(int open){
        
        if ( open <=16 ){return true;} //
        else{
         Dealerhands.add(open);   
        return false;}
    }     

   public Integer Dhit(ArrayList<Integer> cards){
       
        
        return cards.get(countr++);}
    
    
    
    
    
    public void DDealer ()
        { for (int i = 1; i <= 13; i++){  
        for (int j = 0; j < 4; j++) // 1~52のカードを用意して13で割り、商（0，1，2，3）をそれぞれのスート（トランプのマーク）、
            //余りをカードの数値（0＝13）とすることで4種類分のスート管理も可能、、、？（＜追記.52の場合は？（商4、余り0）
        cards.add(i);}
        Collections.shuffle(cards); 
            }
    
    public void Ddeal(ArrayList<Integer> cards){
    
     Dealercards.add(cards.get(countr++));
    Dealercards.add(cards.get(countr++));
      
    }
   
       
        void sethand (PrintWriter pw){
     DDealer();
   Ddeal(cards);
   DsetCard(cards);
       
       Udeal(cards);
   UsetCard(cards);
   
     int Dresult = Dealerhands.get(0);
     int Uresult = Userhands.get(0);
     
     
     if(Dresult>=22)
     {
         if(Uresult>=22){pw.print("Double BUST! Draw");}
        
         else if (Uresult<=22){pw.print("Dealer BUST! User Win");} 
     }
     
     
     else if(Dresult<=22){
     
         if(Uresult>=22){pw.print("User BUST! Dealer Win");}
    
         else if(Uresult<=22){
     
         if(Dresult>Uresult){pw.print("Dealer Win");}
     else if(Uresult>Dresult){pw.print("User Win");}
     else if (Dresult == Uresult){pw.print("Draw");}
         
         
     
     }
     }
     
     pw.print("<br>"+("山札")+(cards));
     pw.print("<br>"+"ディーラー手札"+Dealercards);
     pw.print("<br>"+"ディーラー合計値"+Dealerhands);
     pw.print("<br>"+"ユーザー手札"+Usercards);
     pw.print("<br>"+"ユーザー合計値"+Userhands);
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
            out.println("<title>Servlet act</title>");            
            out.println("</head>");
            out.println("<body>");
           sethand(out);
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

