<html>
<head>
<title>Bienvenido Ingeniero</title>
</head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).click(function (event) {			
      var btn=$('#carga').val();
 $.post('ServeletHistory',{

 },function(respose){
 let datos= JSON.parse(respose);
// console.log(datos);
var tabladato=document.getElementById('tablaDatos');
for(let item of datos){
	tabladato.innerHTML += `
		<tr>
		<td>${item.idHistorial}</td>
		<td>${item.RUsuario}</td>
		<td>${item.fecha}</td>
		</tr>
		`	
		}
	});
		});

		</script>
<body>
<table align="center">
<thead></thead>
<tbody>
<tr>
<td>

<h1 align= "center">Registro de Ingresos</h1>
<input type="submit" name="btn" value="carga"id="carga">
<td>
</td>
</tbody>
</table>
<table class="table table-dark" id="tablaDatos">
	<thead>
		
		<th>IdHistorial</th>
		<th>Usuario</th>
		<th>fechas</th>
	</thead>
	<tbody>
		
	</tbody>
</table>
</html>