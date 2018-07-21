<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
<link rel="shortcut icon" href="">

</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.js" ></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<!-- <nav class="navbar navbar-dark bg-primary"> -->

<div class="upperBarTop fixed-top">
	<a ><img src="img/logo.png" id="logoservin"></a>
	<div class="buttonTogglerMenu" id="buttonTogglerMenu" onclick="toggleSideBar()"></div>
</div>

	<div id="wrapper">
        <div id="sidebar-wrapper" class="sidebarToggled">

            <div class="tarjetaUsuario">
            	<img src="img/user-icon.png">
            	<p id="userName">Luis<br/>Hidalgo</p>
            </div>

            <ul class="sidebar-nav">

            </ul>
        </div>


        <div id="page-content-wrapper" >
            <div class="container" id="cotainerPrincipal">

            </div>
        </div>

    </div>

</body>
<script>


    function getMenuItems(){
     	return ${menuItems}.menuItems;
    }
    //Funcion encargada de cargar encima del contenedor principal
	function loadPage(url,id,method='GET') {

    	//Comportamiento por defecto mediante metodo GET
        if (method.toUpperCase() == 'GET')
            $.get(url,(data)=>{
                $('#'+id).html(data);
            });
    	
    	//Consulta mediante metodo POST
        else if (method.toUpperCase() == 'POST')
            $.post(url,(data)=>{
               $('#'+id).html(data);
            });
	}

	//funcion de despliegue y repliegue del menu
	function toggleSideBar(cnfObj = {//configuracion por defecto del sidebar
					'sidebarId' : 'sidebar-wrapper',
					'butonCssSelector' : '.upperBarTop .buttonTogglerMenu',
					'toggledClass' : 'sidebarToggled',
					'notToggledClass' : 'sidebarNotToggled',
					'inflateImg' : 'img/menu.png',
					'deflateImg' : 'img/toggle-back.png'}){
		var toggleMapper = {
	 		    true : { cssClass : cnfObj['toggledClass'], img : cnfObj['inflateImg'] },
	 		    false : { cssClass : cnfObj['notToggledClass'], img : cnfObj['deflateImg'] }
	 	};
		//Memorizo el estado del disebar
 		var toogler = $('#'+cnfObj['sidebarId']).hasClass(cnfObj['toggledClass']);
 		
		//transición de estado de las propiedades css del sidebar dependiendo del estado actual
        $('#'+cnfObj['sidebarId']).removeClass(toggleMapper[toogler].cssClass);
        $('#'+cnfObj['sidebarId']).addClass(toggleMapper[!toogler].cssClass);
		$(cnfObj['butonCssSelector']).css('background-image','url("'+toggleMapper[toogler].img+'")');

	}

	//consulta dinamica del ancho de la resolucion en funcion de la resolucion el dispositivo
    function isMobile(maxWidth){
        return $( window ).width()<maxWidth;
    }

    //configuracion de la retencion del sidebar para diferenciar los distintos tipos de pantalla
	function responsiveSetUp(maxWidth){
		
	    responsiveMapper = {
	        true : 'fixed',
	        false : ''
	    };
	    
		//la consulta a la resolución no puede ser memorizada dado que es cargada a un evento luego la hago dinamica
        $("#sidebar-wrapper").css('position',responsiveMapper[isMobile(maxWidth)]);
        $( window ).resize(()=>{
            $("#sidebar-wrapper").css('position',responsiveMapper[isMobile(maxWidth)]);
        });
	}

    //funcion de parseo que me permite las reducciones
    function composeTemplate(template,attrs){

        $.each(attrs,(k,v)=>{
        	//Incorporo cada elemento en su posicion equivalente 
            template=template.replace('#'+(k+1),v);
        });
        return template;
    }

	//carga de los menus en el navbar lateral
	function loadSideBar(items,cssClass){
	    $.each(items,(k,item)=>{
                if(item.children == null)//caso base de enlace a vista
                    $('.'+cssClass).append(composeTemplate('<li><a class="menu-item" href="#1">#2</a></li>',[item.url,item.title]));
                else{ //caso general que aglutina los distintos hijos de cada elemento del menu
                	
                	//compongo class con la que seleccionar a posteriori la lista envebida que genero
                	localClass = cssClass+item.title.split(" ")[0];
					
                	//apendeo de nueva sublista
                    $('.'+cssClass).append(composeTemplate('<ul class="#3"><a class="menu-item" href="#1">#2</a><ul>',[item.url,item.title,localClass]));
                  	
                	//invocación recursiva para pintar el menú hijo
                    loadSideBar(item.children,localClass);
                }
        });
	}

    //Workflow principal de la vista
	$(document).ready(()=>{
	    //seteo la propiedad fixed del contenedor principal
	    responsiveSetUp(776);

        //cargo los item de menu de la aplicacion
	    loadSideBar(getMenuItems(),'sidebar-nav');

        //carga de la pagina principal de la aplicacion
	    loadPage("home","cotainerPrincipal");
        
        //Cambio del comportamiento por defecto de los link
        $('li>a.menu-item').click(function(event){
        	//Intercepto la navegacion del link
        	event.preventDefault();
        	
        	alert("li zone");
        	
        	//Cargo el contenido apuntado por el link en el contenedor principal
        	loadPage($(this).attr('href'),"cotainerPrincipal");
        });
        
        $('ul>a.menu-item').click(function(event){
        	//Intercepto la navegacion del link
        	event.preventDefault();
        	alert("ul zone");
			//TODO: esto hace cosas raras y necesito corregirlo
        	$.each($(this).children(),(item)=>{
        		alert(item);
        		if (item.hassClass('hidden-ittem')){
        			alert("me muestro");
        			item.show();
        			item.removeClass('hidden-ittem');
        		}else{
        			alert("NO me muestro");
        			item.hide();
        			item.addClass('hidden-ittem');	
        		}
			});
        });
        
	});

</script>


</html>