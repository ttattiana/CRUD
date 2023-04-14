<%-- 
    Document   : Estudi
    Created on : 13/04/2023, 08:39:03 PM
    Author     : Tatiana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Información del Estudiante</title>
    </head>
    <body>
        <h1>Información del Estudiante</h1>
        <form action="./EstudianteServlet" method="POST">

        </form>
        <table>
            <tr>
                <td>ID Estudiante</td>
                <td> <input type="text" name="EstudianteId" value="${estudiante.EstudianteId}"/></td>

            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="Nombre" value="${estudiante.Nombre}"/></td>
            </tr>          
            <tr>
                <td>Apellido</td>
                <td><input type="text" name="Apellido" value="${estudiante.Apellido}"/></td>
            </tr>
            <tr>
                <td>Año Nivel</td>
                <td><input type="text" name="AñoNivel" value="${estudiante.AñoNivel}"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="action" value="Add" />
                    <input type="submit" name="action" value="Edit"/>
                    <input type="submit" name="action" value="Delete"/>
                    <input type="submit" name="action" value="Search"/>
            </tr>
        </table>
        <br>
        <table border ="1">
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>NivelAño</th>
                <c:forEach items="${AllEstudiantes}"var="estu">
                <tr>
                    <td>${stud.EstudianteId}</td>
                    <td>${stud.Nombre}</td>
                    <td>${stud.Apellido}</td>
                    <td>${stud.AñoNivel}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>

