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
       
      <%@ page import="java.util.HashMap" %>
      <%@ page import="java.util.ArrayList" %> 
      
        <%
         HashMap <String, String> State =
                          new HashMap<String,String>();
         State.put("1","AAA");
         State.put("hello", "world");
         State.put("soeda","33");
         State.put("20","20");
         ArrayList<HashMap> chip = new ArrayList<HashMap>();
         
         chip.add(State);
         
        out.print(State);

 

  
    %>
    </body>
</html>
