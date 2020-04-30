<html>
<link rel="stylesheet" type="text/css" href="estilo.css">
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
<td>${item.idUsuarios}</td>
<td>${item.nombre}</td>
<td>${item.apellido}</td>
<td>${item.numero_Dui}</td>
<td>

<a href="ServeletTabla?btn=ELIMINAR&Id=${item.idUsuarios}" class="btn btn-warning">ELIMINAR</a>
<a href="gestiionar.jsp?idBus=${item.idUsuarios}&Nom=${item.nombre}&Ape=${item.apellido}&E=${item.numero_Dui}" class="btn btn-danger">Actualizar</a>
</td>
</tr>
`
}



	});
});

</script>



<%
String idBus= request.getParameter("idBus");
String Nombre= request.getParameter("Nom");
String Apellido= request.getParameter("Ape");
String Dui= request.getParameter("E");

if(idBus==null){
	idBus="";
	Nombre="";
	Apellido="";
	Dui="";
		
}

%>
<body Style ="background:url('https://get.wallhere.com/photo/black-dark-abstract-red-symmetry-simple-pattern-texture-circle-light-color-shape-design-line-darkness-number-screenshot-computer-wallpaper-font-64452.png')">
<form action="ServeletTabla">
<h1>Gestionar Beneficiados</h1>
    <div class="wrapper">
        <div class="contact-form">
            <did class="input-fields">
               <input type="text" class="input" name="Id" id="Idcarga" value="<%=idBus%>" placeholder="Ingrese EL numero ID"><br>
               
                <input type="text" class="input" name="Nombre" id="Nom" value="<%=Nombre%>" placeholder="Ingrese Sus nombre"><br>

                <input type="text" class="input" name="Apellido" id="Ape" value="<%=Apellido%>" placeholder="Ingrese Sus apellidos"><br>

                <input type="text" class="input" name="Dui" id="Dui" value="<%=Dui%>"  placeholder="Ingrese Su DUI"><br>
                
            </did>
            <div class="msg">

                <div class="btn">
                    <input type="submit" value="GUARDAR" name="btn">
                </div> <br>
                <div class="btn">
                    <input type="submit" class="btn btn-primary" value="GUARDAR_ACTUALIZACION" name="btn">
                </div><br>
                <div class="btn">
              
                </div> <br>
              
                 <a href="index.jsp" class="btn btn-danger">Regresar Al inicio</a>
                </div> <br>
            </div>
        </div>
    </div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>


<h1 align="center"class="text-secondary">Gestion de Duis</h1>



		
<table class="table table-dark" id="tablaDatos">
	<thead>
		
		<th>idUsuarios</th>
		<th>nombre</th>
		<th>apellido</th>
	
		<th>numero_Dui</th>
		
       <th>opciones</th>
	</thead>
	<tbody>
		
	</tbody>
</table>
		
</form>				
</body>
</html>





