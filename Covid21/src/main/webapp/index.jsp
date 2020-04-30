<!DOCTYPE html>
<html lang="us">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gobierno De El Salvador</title>
    <!--JQUERY-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <!-- Los iconos tipo Solid de Fontawesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

    <link rel="stylesheet" type="text/css" href="Style.css">
</head>

<body>
<form action="ServeletCovid"method ="post">
<div>

    <header id="header-wrapper">
        <div class="container-fluid">GOBIERNO DE EL SALVADOR</div>
        <a href="login.jsp" class="btn btn-info">Iniciar Secion Administrador</a>
    </header>
    <br>
    <br>
    <br>
    <div>
        <h1 id="h1">Consulta quien de tu familia es el beneficiario del apoyo <br>
            economico para alimentacion en la emergencia</h1>

        <h1 align="center">
            <label align="center">COVID-19</label>
            <br>
            <br>
            <div class="consulta">
                <form>
            <!--Aca pondremos la barra que consultara el DUI-->
            <input type="text" name="Dui" placeholder="Ingresa Tu Numero De DUI">
            <input  type="submit" value="Consultar">
       
            <!-- <button type="button" class="btn btn-success">Consultar</button> -->
            <br>
            <br>
            <br>
             
</div>


            <footer class="page-footer font-small" style="background-color:#f2f2f2;">
                <div class="styleFoot">
                    <p>El apoyo economico brindado por el Gobierno de El Salvador esta dirigido a personas afectadas por
                        la pandemia del COVID-19. Dicho beneficio <br> 
                        corresponde a $300 por vivienda.</p>
                </div>
            </footer>


           
                <footer class="page-footer font-small" style="background-color:rgb(178, 194,207);">
                    <div id="styleFoot1">
                        <span id="span1">© Copyright 2020. Presidencia de la Republica de El Salvador.</span>
                        <span id="span2">Contactanos Facebook Instagram twitter</span>
                    </div>
                </footer>
           
            </div>
      </form> 
</div>

</body>

</html>