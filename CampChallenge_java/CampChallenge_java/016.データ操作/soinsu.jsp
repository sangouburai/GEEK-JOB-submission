<%-- 
    Document   : soinsu
    Created on : 2018/05/14, 1:27:40
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
            
            
            int numb = Integer.parseInt(request.getParameter("num"));
     
      int i = 2;
while(numb != 1) {
    if(numb % i == 0) {
        out.print(i + "*");
        numb /= i;
    }
    else {
        i++;
    }
}
        %>
    </body>
</html>
