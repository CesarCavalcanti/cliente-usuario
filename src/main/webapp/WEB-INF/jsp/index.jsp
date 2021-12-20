<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Tela index</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <c:if test="${not empty msg}">
        <div class="alert alert-danger">
            <strong>Alerta!</strong>${msg}
        </div>
    </c:if>

    <h1>Cadastro do venturaHR, bem-vindo!!!</h1>

    <a href="/cadastro">Cadastro de Usuários</a>
</div>
</body>
</html>