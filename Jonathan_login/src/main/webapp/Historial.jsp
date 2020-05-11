<html>
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).ready(function () {
 var btn=$('#carga').val();
 $.post('ServeletHistory',{

 },function(respose){
 let datos= JSON.parse(respose);
// console.log(datos);
var tabladato=document.getElementById('tablaDatos');
for(let item of datos){
	tabladato.innerHTML += `
<tr>
<td>${item[0]}</td>
<td>${item[1]}</td>
<td>${item[3]}</td>
<td>${item[2]}</td>

</tr>
`
}});
});
</script>
<body>
	<h1 align="center" class="text-secondary">Gestion de historial</h1>
	<a href="Welcome.jsp" class="btn btn-info">Volver al inicio</a>
	<table class="table table-dark" id="tablaDatos">
		<thead>
			<th>idhistorial</th>
			<th>idUsuario</th>
			<th>Usuario</th>
			<th>fecha de ingreso</th>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
</html>
