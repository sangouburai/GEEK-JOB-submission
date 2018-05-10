<%-- 
    Document   : EXb
    Created on : 2018/05/10, 16:32:52
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
            request.setCharacterEncoding("UTF-8");
            
        out.print(request.getParameter("name") + "<br>");
        
        out.print(request.getParameter("male")+ "<br>");
        
        out.print(request.getParameter("female")+ "<br>");
        out.print(request.getParameter("hobby")+ "<br>");
    %>  
    </body>
</html>
