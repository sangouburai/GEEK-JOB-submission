<%-- 
    Document   : buraiJSP
    Created on : 2018/02/26, 11:44:35
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
            
            int Buru=2;
        switch(Buru)    {
            case 1:
            out.print("one");
            break;
            
            case 2:
            out.print("two");
            break;
            
            default:
                out.print("想定外");
        }

   %>
    
    </body>
</html>
