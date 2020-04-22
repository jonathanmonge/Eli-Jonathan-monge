<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ServeletControler" >
<table align="center">
	<thead>
		
	</thead>
	<%
	String idBus= request.getParameter("idBus");
	String nombre= request.getParameter("No");
	String apellido= request.getParameter("A");
	String edad= request.getParameter("E");
	String Direcion= request.getParameter("Di");
	String dui= request.getParameter("D");
	String nit= request.getParameter("N");
	String Grupo= request.getParameter("G");
	String ultima_nota= request.getParameter("U");
	if(idBus==null){
		idBus="";
		nombre=" ";
		apellido=" ";
		edad=" ";
		Direcion=" ";
		dui=" ";
		nit =" ";
		Grupo=" ";
		ultima_nota=" ";
		
	}
	%>
	<tbody>
		<tr>
			<td>
				
<p>id</p><input type="text" name="Id" id="idcarga" value="<%=idBus%>">
<p>nombre</p><input type="text" name="Nombre"id="Nocarga" value="<%=nombre%>">
					<p>apellido</p><input type="text" name="Apellido"id="Acarga" value="<%=apellido%>">
					<p>edad</p><input type="text" name="Edad"id="Ecarga" value="<%=edad%>">
					<p>Direcion</p><input type="text" name="Direcion"id="Dcarga" value="<%=Direcion%>">
					<p>dui</p><input type="text" name="Dui"id="dcarga" value="<%=dui%>">
<p>nit</p><input type="text" name="Nit"id="Nicarga" value="<%=nit%>">
<p>Grupo</p><input type="text" name="grupoDeClaseProgramacion3Alquepertenece"id="Gcarga" value="<%=Grupo%>">
<p>ultima_nota</p><input type="text" name="ultimaNotaObtenidaEnProgramacion2"id="Ucarga" value="<%=ultima_nota%>">
				<br>
				<br>
			</td>
		</tr> 
	</tbody>
</table>

<input type ="submit" class="btn btn-info" value="Guardar" name="btn">	
<input type ="submit" class="btn btn-info" value="Actualizar"name="btn">	
</form>
</body>
</html>