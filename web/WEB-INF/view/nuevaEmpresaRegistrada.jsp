<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina JSP</title>
    </head>
    <body>
        <c:if test="${not empty emp.getNombre()}">
            <h1>Nueva empresa '${emp.getNombre()}'  - <fmt:formatDate value="${emp.getFechaAbetura()}" pattern="dd/mm/yyyy"/> </h1>
        </c:if>
        <c:if test="${empty emp.getNombre()}">
            <h1>Empresa no registrada </h1>
        </c:if>
            
        <c:forEach var="i" begin="1" end="10" step="2">
            ${i} <br />
        </c:forEach>
    </body>
</html>
