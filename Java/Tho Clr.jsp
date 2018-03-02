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
          float solr= 1000;
          while(solr>100 ){ 
              solr/=2;}
          out.print(solr);
          
          
         
          
            
          
         %>   
    </body>
</html>
