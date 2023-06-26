<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url value="/NuevaEmpresa" var="linkServletNuevaEmpresa"/>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Registrar Empresa</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        
        <form action="${linkServletNuevaEmpresa}" method="post">
            
            Nombre Empresa: <input type="text" name="nombre"/>
            Fecha Abertura: <input type="text" name="fechaAbertura">
            
            <input type="submit" />
            
        </form>
        
        <p>Este es el jsp</p>
    </body>
</html>
