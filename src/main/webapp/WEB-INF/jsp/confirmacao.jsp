<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Tela index</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<h1>Página do candidato</h1>

<div class="alert alert-success">
    <strong>${usuario.nome}</strong> Cadastrado com sucesso!
</div>

    <a href="/login">Efetuar login</a>
    <br>
    <a href="/">Voltar</a>

</body>
</html>