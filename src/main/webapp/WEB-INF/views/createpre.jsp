<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Pre-Proyecto</title>
    </head>
    <body>
        <form action="registrarPre" method="get">
            <!-- Datos del cliente-->
            <table>
                <h2>Datos del Cliente</h2>
                <tr>
                    <td>Nombre del Cliente : </td>
                    <td><input type="text" name="nombreCliente" /></td>
                </tr>
                <tr>
                    <td>Nombre del representante : </td>
                    <td><input type="text" name="nombreRepresentante" /></td>
                </tr>
                <tr>
                    <td>Apellido Paterno del representante : </td>
                    <td><input type="text" name="paterno" /></td>
                </tr>
                <tr>
                    <td>Apellido Materno del representante :</td>
                    <td><input type="text" name="materno" /></td>
                </tr>
                <tr>
                    <td>Direccion del cliente : </td>
                    <td><input type="text" name="direccion" /></td>
                </tr>
                <tr>
                    <td>Telefono del cliente : </td>
                    <td><input type="text" name="telefono" /></td>
                </tr>
                <tr>
                    <td>Correo del cliente : </td>
                    <td><input type="email" name="correo" /></td>
                </tr>
            </table>
            <!-- Termino de formulario de clientes -->

            <!-- Datos del PreProyecto -->
            <table>
                <h2>Datos del PreProyecto</h2>

                <tr>
                    <td>Selecciona un cliente : </td>
                    <td>
                        <form:select path="clientes" items="${clientes}">
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Nombre del Pre-Proyecto : </td>
                    <td><input type="text" name="nombrePre" /></td>
                </tr>
                <tr>
                    <td>Fecha de Inicio : </td>
                    <td><input type="date" name="fechaInicio" /></td>
                </tr>
                <tr>
                    <td>Fecha de Cierre : </td>
                    <td><input type="date" name="fechaCierre" /></td>
                </tr>
                <tr>
                    <td>Costo :</td>
                    <td><input type="number" name="costo" /></td>
                </tr>
            </table>
            <!-- Termino de formulario de pre-proyecto -->
        </form>

    </body>
</html>
