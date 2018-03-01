<%-- 
    Document   : newjsp
    Created on : 2018/03/01, 16:03:11
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
          
            int ans = 0;
            for(int cot = 1; cot<=100;cot++ ){
            ans = ans + cot;
                    }
            out.print(ans);
          
          
         %>   
    </body>
</html>
