<%-- 
    Document   : nobolb
    Created on : 2018/02/23, 16:22:24
    Author     : guest1Day
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
            int sango = 2;
            
            if(sango == 1){
                out.print("1です!");
            }
            else if(sango == 2){
                out.print("プログラミングキャンプ！");
            }
            else{ out.print("その他です！");}
    %>
    
    </body>
</html>
