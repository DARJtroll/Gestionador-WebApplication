<%@ page import="java.util.List"%>
<%@ page import="gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="" var="linkServletEliminarEmpresa"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
            
        <h2>Usuario : ${LogUsuario.getLogin()}</h2>
        
         <ul>
                <c:forEach items="${empresas}" var="empresa">
                    <li> ${empresa.getNombre()} - <fmt:formatDate value="${empresa.getFechaAbetura()}" pattern="dd/mm/yyyy"/> 
                        <a href="/Generador/Entrada?accion=MostrarEmpresa&id=${empresa.ID}"> Modificar </a>
                        <a href="/Generador/Entrada?accion=EliminarEmpresa&id=${empresa.ID}"> Eliminar </a>
                    </li>
                </c:forEach>
            </ul>
        
        <a href="Entrada?accion=Logout"><button>Cerrar</button></a>
        
    </body>
</html>
