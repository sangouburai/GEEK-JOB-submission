package jums;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * insertresultと対応するサーブレット
 * フォームから入力された値をセッション経由で受け取り、データベースにinsertする
 * 直接アクセスした場合はerror.jspに振り分け
 * @author hayashi-s
 */
public class InsertResult extends HttpServlet {

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
        
        //セッションスタート
        //HttpSession session = request.getSession();
        
        try{
            //開発タスク第一段階・2項目目 直リンク防止用処理
            HttpSession session = request.getSession();
            request.setCharacterEncoding("UTF-8");
            String inpuchecker = request.getParameter("ac");
            if(inpuchecker ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(inpuchecker)){
                   throw new Exception("不正なアクセスです");
            }
            
           //ユーザー情報に対応したJavaBeansオブジェクトに格納していく
            UserDataDTO userdata = new UserDataDTO();
            UserDataBeans udb = (UserDataBeans) session.getAttribute("UDBValue");
            userdata.setName((String)udb.getName());
            Calendar birthday = Calendar.getInstance();
            birthday.set(Integer.parseInt(udb.getYear()),Integer.parseInt(udb.getMonth()),Integer.parseInt(udb.getDay()));
            userdata.setBirthday(birthday.getTime()); //課題6
            userdata.setType(Integer.parseInt((String)udb.getType()));
            userdata.setTell((String)udb.getTell());
            userdata.setComment((String)udb.getComment());
            
            //DBへデータの挿入
            UserDataDAO .getInstance().insert(userdata);
            
            request.getRequestDispatcher("/insertresult.jsp").forward(request, response);
        }catch(Exception e){
            //データ挿入に失敗したらエラーページにエラー文を渡して表示
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
