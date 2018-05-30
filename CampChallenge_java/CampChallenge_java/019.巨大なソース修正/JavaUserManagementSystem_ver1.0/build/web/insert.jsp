<%@page import="jums.UserDataBeans"%>

<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%--課題5　フォーム未入力の場合戻った時に値を保持--%>
<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans) hs.getAttribute("UDBValue");
    
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
        if(udb.getName()!= null){
            name = (String)udb.getName();
            shin1 = true;
        }
        if(udb.getYear()!= null){
            year = (String)udb.getYear();
            shin2 = true;
        }
        if(udb.getMonth()!= null){
            month = (String)udb.getMonth();
            shin3 = true;
        }
        if(udb.getDay()!= null){
            day = (String)udb.getDay();
            shin4 = true;
        }
        if(udb.getType()!= null){
            type = (String)udb.getType();
            shin5 = true;
        }
        if(udb.getTell()!= null){
            tell = (String)udb.getTell();
            shin6 = true;
        }
        if(udb.getComment() != null){
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
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <input type="text" name="name" value="<%if(shin1){out.print(name);}%>"> <%-- <- nullではないが、何も入っていない--%>
        <br><br>

        生年月日:　
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>" <%if(year.equals(String.valueOf(i))){out.print("selected");}%>> <%=i%> </option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>" <%if(month.equals(String.valueOf(i))){out.print("selected");}%>><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>" <%if(day.equals(String.valueOf(i))){out.print("selected");}%>><%=i%></option>
            <% } %>
        </select>日
        <br><br>
        
        <% 
        int flg=0;
        String chk = "checked";
        if(udb != null){
            if(udb.getType().equals("1")){
                flg =1;
            }
            else if(udb.getType().equals("2")){
                flg=2;
            }
            else{
                flg=3;
            }
        }    
        %>
        種別:
        <br>
        <input type="radio" name="type" value="1" <%if(flg==1){out.print(chk);}%>>エンジニア<br>
        <input type="radio" name="type" value="2" <%if(flg==2){out.print(chk);}%>>営業<br>
        <input type="radio" name="type" value="3" <%if(flg==3){out.print(chk);}%>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%if(shin6){out.print(tell);}%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%if(shin7){out.print(comment);}%></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">　<%--課題2 直リンク禁止--%>
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%--開発タスク第一段階　1項目目--%>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
