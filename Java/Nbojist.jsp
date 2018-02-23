<%-- 
    Document   : Nbojide
    Created on : 2018/02/23, 13:39:39
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
          int burai = 36;
          final int hand = 9;
         
         out.print(burai + hand);
         
         out.print(burai - hand);
         
         out.print(burai * hand);
         
         out.print(burai / hand);
        
        %>
          
    </body>
</html>
