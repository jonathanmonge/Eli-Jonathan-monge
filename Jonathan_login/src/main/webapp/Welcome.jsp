<html>
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<head>
<title>Bienvenido Ingeniero< William</title>
</head>

<%
HttpSession seccion= (HttpSession) request.getSession();
String usuariovariabledeseccion=(String)seccion.getAttribute("usuario");
if(usuariovariabledeseccion==null){
	response.sendRedirect("index.jsp");
	
	
}
%>
<body background="https://s1.eestatic.com/2018/04/06/actualidad/Actualidad_297735561_130169526_1706x960.jpg">


<form action="Servelet_Usuarios" method="post">
<h1 align ="center">Felicidades te has logeado correctamente eres un crack </h1>
<input type="submit" value="cerrar" class="btn btn-success"name ="btn">
<a href="Historial.jsp" class="btn btn-dark">ver Historial</a>
</form>
</body>
</html>