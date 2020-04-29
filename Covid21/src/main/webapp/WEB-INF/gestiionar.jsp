<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).ready(function () {

 var btn=$('#carga').val();
 $.post('ServeletTabla',{

 },function(respose){
 let datos= JSON.parse(respose);
// console.log(datos);
var tabladato=document.getElementById('tablaDatos');
for(let item of datos){
	tabladato.innerHTML += `
	
<tr>
<td>${item.id}</td>
<td>${item.nombre}</td>
<td>${item.apellido}</td>
<td>${item.numero_Dui}</td>
<td>
<a href="ServeletTabla?btn=ELIMINAR&Id=${item.id}" class="btn btn-warning">ELIMINAR</a>
<a href="funciones.jsp?idBus=${item.id}&No=${item.nombre}&A=${item.apellido}&E=${item.numero_Dui}" class="btn btn-danger">Actualizar</a>
</td>
</tr>
`
}



	});
});

</script>
<body>
<h1 align="center"class="text-secondary">Gestion de Clientes</h1>

			
				
				<a href="funciones.jsp" class="btn btn-info">Funciones</a>
				
<table class="table table-dark" id="tablaDatos">
	<thead>
		
		<th>id</th>
		<th>nombre</th>
		<th>apellido</th>
	
		<th>numero_Dui</th>
		
       <th>opciones</th>
	</thead>
	<tbody>
		
	</tbody>
</table>
		
			
</body>
</html>
