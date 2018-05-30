<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>

<%--課題4フォーム未入力の場合に通過しないようにさせる処理--%>
<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("UDBValue"); //セッションに保存したUDBの呼び出し
    
    //初期値
    boolean shin1 = false;
    boolean shin2 = false;
    boolean shin3 = false;
    boolean shin4 = false;
    boolean shin5 = false;
    boolean shin6 = false;
    boolean shin7 = false;
    
    String name = "";
    String year = "";
    String month = "";
    String day = "";
    String type = "";
    String tell = "";
    String comment = "";
    
    //sessionの有無を判別
    try{
    
    if(!udb.getName().equals("")){
            name = (String)udb.getName();
            shin1 = true;
    }
    if(!udb.getYear().equals("")){
            year = (String)udb.getYear();
            shin2 = true;
    }
    if(!udb.getMonth().equals("")){
            month = (String)udb.getMonth();
            shin3 = true;
    }
    if(!udb.getDay().equals("")){
            day = (String)udb.getDay();
            shin4 = true;
    }
    if(!udb.getType().equals("")){
            type = (String)udb.getType();
            shin5 = true;
    }
    if(!udb.getTell().equals("")){
            tell = (String)udb.getTell();
            shin6 = true;
    }
    if(!udb.getComment().equals("")){
            comment = (String)udb.getComment();
            shin7 = true;
    }
    }catch(NullPointerException e){}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <% 
        if(shin1  && shin2 && shin3 && shin4 && shin5 && shin6 && shin7){ //正論理の場合登録画面に移行 
    %>
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>"> <%--課題2--%>
            <input type="submit" name="yes" value="はい">
        </form>
    <%       
    }else{ //負論理の場合未入力項目を検知
    if(shin1==false){
                out.println("名前が入力がされていません<br>");
            }
            if(shin2==false){
                out.println("年が選択されていません<br>");
            }
            if(shin3==false){
                out.println("月が選択されていません<br>");
            }
            if(shin4==false){
                out.println("日が選択されていません<br>");
            }
            if(shin5==false){
                out.println("職業が選択されていません<br>");
            }
            if(shin6==false){
                out.println("電話番号が入力がされていません<br>");
            }
            if(shin7==false){
                out.println("自己紹介文が入力がされていません<br>");
            }
    } 
    %>
            <form action="insert" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>"> <%--課題2 直リンク防止用処理--%>
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <%--開発タスク第一段階　1項目目--%>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
