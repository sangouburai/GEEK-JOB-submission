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
            
          char goo= 'A';
        
          switch(goo)    {
           
              case 'A':
              out.print("英語");
            break;
            
              case 'あ':
            out.print("日本語");
            break;
            
            default:
                out.print("想定外");
        }

   %>
    
    </body>
</html>
