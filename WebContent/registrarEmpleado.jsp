<!DOCTYPE html>
<html>
<head>
	<title>Proyecto Nomina</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
  <link rel="stylesheet" type="text/css" href="css/estilo2.css">
	

</head>
<body>


  <div class="svg-container">
    <!-- I crated SVG with: https://codepen.io/anthonydugois/pen/mewdyZ -->
    <svg viewbox="0 0 800 400" class="svg">
      <path id="curve" fill="#50c6d8" d="M 800 300 Q 400 350 0 300 L 0 0 L 800 0 L 800 300 Z">
      </path>
    </svg>
  </div>

  <header>
    <h1>Actividad- Proyecto Nomina</h1>
    <h3>Martha Alejandra Chacin 1151401</h3>
  </header>

  <main>

  	<h1>Registrar Empleado</h1>
  	</br>
  	</br>
  	</br>

  <div id="container">


  <form action="EmpleadoC" method="post" id="contact_form">
   <input type="hidden"  name="opcion" value="registro"      >
      <label for="codigo"></label>
      <input type="text" placeholder="Codigo Empleado" name="codigo" id="codioEmpleado" required>

    
      <label for="cedula"></label>
      <input type="text" placeholder="cedula Empleado" name="cedula" id="cedulaEmpleado" required>
      
      <label for="nombre"></label>
      <input type="text" placeholder="Nombre Empleado" name="nombre" id="nombreEmpleado" required>
   

    
      Fecha nacimiento: <input type="date" name="cumpleanios" step="1" min="2013-01-01" max="2013-12-31" value="2013-01-01">
   
<br>
<br>
<br>
 
      Fecha de Ingreso: <input type="date" name="ingreso" step="1" min="2010-01-01" max="2013-12-31" value="2013-01-01">
<br>
<br>
<br>
  
      Fecha Retiro: <input type="date" name="retiro" step="1" min="2013-01-01" max="2013-12-31" value="2013-01-01">
  
<br>
<br>
<br>

  <table style="width:100%">
  <tr>
    <th> 
  <button class="boton_personalizado" type="submit" >Registrar</button>
    </th>
    <th>
    <a class="boton_personalizado" href="OpcionesEmpleado.jsp">Volver</a>
    </th>
   
  </tr>
  
</table>

    <br>
  </form><!-- // End form -->
</div><!-- // End #container -->

  </main>


  <footer>
    <p>Universidad Francisco de Paula Santandar </p>
    <p>Programacion Web</p>
    <small>GitHub<a href=""></a>.</small>
  </footer>
</body>
</body>
</html>