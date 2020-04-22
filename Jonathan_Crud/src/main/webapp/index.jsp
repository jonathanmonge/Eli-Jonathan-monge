<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).ready(function () {

 var btn=$('#carga').val();
 $.post('ServeletControler',{

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
<td>${item.edad}</td>
<td>${item.direccion}</td>
<td>${item.dui}</td>
<td>${item.nit}</td>
<td>${item.grupoDeClaseProgramacion3Alquepertenece}</td>
<td>${item.ultimaNotaObtenidaEnProgramacion2}</td>
<td>
<a href="ServeletControler?btn=ELIMINAR&Id=${item.id}" class="btn btn-warning">ELIMINAR</a>
<a href="funciones.jsp?idBus=${item.id}&No=${item.nombre}&A=${item.apellido}&E=${item.edad}&Di=${item.direccion}&D=${item.dui}&N=${item.nit}&G=${item.grupoDeClaseProgramacion3Alquepertenece}&U=${item.ultimaNotaObtenidaEnProgramacion2}" class="btn btn-danger">Actualizar</a>
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
		<th>edad</th>
		<th>Direcion</th>
		<th>dui</th>
		<th>nit</th>
		<th>Grupo</th>
		<th>ultima_nota</th>
       <th>opciones</th>
	</thead>
	<tbody>
		
	</tbody>
</table>
		
			
</body>
</html>
