<%-- 
    Document   : getter
    Created on : 2018/05/12, 12:41:41
    Author     : musag
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          request.setCharacterEncoding("UTF-8");  
          
          int total = Integer.parseInt(request.getParameter("kaikei"));
          int kosuu = Integer.parseInt(request.getParameter("kazu"));
          int type = Integer.parseInt(request.getParameter("shurui"));
          
          
          int tanka = (total/kosuu);
          out.print("単価は" + tanka +"円" +"<br>");
         
        if(type == 1){out.print("雑貨"+"<br>");}
        else if(type == 2){out.print("生鮮"+"<br>");}
        else if (type == 3){out.print("その他"+"<br>");}
        

        if(total<3000){out.print("ポイントは" + "0");}
         else if(total <5000){out.print("ポイントは" + total/100*4);} 
         else if(total >=5000){out.print("ポイントは" + total/100*5);}
       
          
          
          




            %>
    </body>
</html>
