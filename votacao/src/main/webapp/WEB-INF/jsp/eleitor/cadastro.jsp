<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Eleitor</h2>
	  
	  <form action="/eleitor/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Código:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu código" name="codigo" value="13">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome" value="Elberth L C Moraes">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email" value="elberth.moraes@prof.infnet.edu.br">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu telefone" name="telefone" value="21996016255">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Token:</label>
	      <input type="password" class="form-control" placeholder="Entre com o seu token" name="token" value="123">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>