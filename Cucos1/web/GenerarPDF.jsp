<%-- 
    Document   : GenerarPDF
    Created on : 15-oct-2018, 23:46:25
    Author     : Maicol Pulido
--%>

<%@page import="Informacion.Generacion_Factura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            Generacion_Factura gf = new Generacion_Factura();
            gf.GenerarPDF();
        %>
        
        <p>PDF Generado Correctamente</p>
    </body>
</html>
