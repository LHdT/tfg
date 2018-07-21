package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.js\" ></script>\r\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- <nav class=\"navbar navbar-dark bg-primary\"> -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"upperBarTop fixed-top\">\r\n");
      out.write("\t<a ><img src=\"img/logo.png\" id=\"logoservin\"></a>\r\n");
      out.write("\t<div class=\"buttonTogglerMenu\" id=\"buttonTogglerMenu\" onclick=\"toggleSideBar()\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("        <div id=\"sidebar-wrapper\" class=\"sidebarToggled\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tarjetaUsuario\">\r\n");
      out.write("            \t<img src=\"img/user-icon.png\">\r\n");
      out.write("            \t<p id=\"userName\">Luis<br/>Hidalgo</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page-content-wrapper\" >\r\n");
      out.write("            <div class=\"container\" id=\"cotainerPrincipal\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("//plugin de jquery que permite clonar estilos de un sitio a otro\r\n");
      out.write("(function($){\r\n");
      out.write("    $.fn.getStyleObject = function(){\r\n");
      out.write("        var dom = this.get(0);\r\n");
      out.write("        var style;\r\n");
      out.write("        var returns = {};\r\n");
      out.write("        if(window.getComputedStyle){\r\n");
      out.write("            var camelize = function(a,b){\r\n");
      out.write("                return b.toUpperCase();\r\n");
      out.write("            }\r\n");
      out.write("            style = window.getComputedStyle(dom, null);\r\n");
      out.write("            for(var i=0;i<style.length;i++){\r\n");
      out.write("                var prop = style[i];\r\n");
      out.write("                var camel = prop.replace(/\\-([a-z])/g, camelize);\r\n");
      out.write("                var val = style.getPropertyValue(prop);\r\n");
      out.write("                returns[camel] = val;\r\n");
      out.write("            }\r\n");
      out.write("            return returns;\r\n");
      out.write("        }\r\n");
      out.write("        if(dom.currentStyle){\r\n");
      out.write("            style = dom.currentStyle;\r\n");
      out.write("            for(var prop in style){\r\n");
      out.write("                returns[prop] = style[prop];\r\n");
      out.write("            }\r\n");
      out.write("            return returns;\r\n");
      out.write("        }\r\n");
      out.write("        return this.css();\r\n");
      out.write("    }\r\n");
      out.write("})(jQuery);\r\n");
      out.write("    function getMenuItems(){\r\n");
      out.write("        return [{\r\n");
      out.write("                   title: 'Dashboard',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'Shortcuts',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'Overview',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'Events',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'About',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'Services',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: [\r\n");
      out.write("                       {\r\n");
      out.write("                          title: 'services child',\r\n");
      out.write("                          url: '',\r\n");
      out.write("                          children: null\r\n");
      out.write("                       }\r\n");
      out.write("                   ]\r\n");
      out.write("               },\r\n");
      out.write("               {\r\n");
      out.write("                   title: 'Contact',\r\n");
      out.write("                   url: '',\r\n");
      out.write("                   children: null\r\n");
      out.write("               }];\r\n");
      out.write("    }\r\n");
      out.write("    //Funcion encargada de cargar encima del contenedor principal\r\n");
      out.write("\tfunction loadPage(url,id,method='GET') {\r\n");
      out.write("\r\n");
      out.write("        if (method.toUpperCase() == 'GET')\r\n");
      out.write("            $.get(url,function(data){\r\n");
      out.write("                $('#'+id).html(data);\r\n");
      out.write("            });\r\n");
      out.write("        else if (!isGet || method.toUpperCase() == 'POST')\r\n");
      out.write("            $.post(url,function(data){\r\n");
      out.write("               $('#'+id).html(data);\r\n");
      out.write("            });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//funcion de despliegue del menu\r\n");
      out.write("\tfunction toggleSideBar(){\r\n");
      out.write(" \t\tvar toogler = $('#sidebar-wrapper').hasClass('sidebarToggled');\r\n");
      out.write(" \t\tvar toggleMapper = {\r\n");
      out.write(" \t\t    true : { cssClass : \"sidebarToggled\", img : \"img/menu.png\" },\r\n");
      out.write(" \t\t    false : { cssClass : \"sidebarNotToggled\", img : \"img/toggle-back.png\" }\r\n");
      out.write(" \t\t};\r\n");
      out.write("\r\n");
      out.write("        $('#sidebar-wrapper').removeClass(toggleMapper[toogler].cssClass);\r\n");
      out.write("        $('#sidebar-wrapper').addClass(toggleMapper[!toogler].cssClass);\r\n");
      out.write("\t\t$('.upperBarTop .buttonTogglerMenu').css('background-image','url(\"'+toggleMapper[toogler].img+'\")');\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//consulta dinamica del ancho de la resolucion en funcion de la resolucion el dispositivo\r\n");
      out.write("    function isMobile(maxWidth){\r\n");
      out.write("        return $( window ).width()<maxWidth;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //configuracion de la retencion del sidebar\r\n");
      out.write("\tfunction responsiveSetUp(maxWidth){\r\n");
      out.write("\r\n");
      out.write("\t    responsiveMapper = {\r\n");
      out.write("\t        true : 'fixed',\r\n");
      out.write("\t        false : ''\r\n");
      out.write("\t    };\r\n");
      out.write("\r\n");
      out.write("        $(\"#sidebar-wrapper\").css('position',responsiveMapper[isMobile(maxWidth)]);\r\n");
      out.write("        $( window ).resize(function(){\r\n");
      out.write("            $(\"#sidebar-wrapper\").css('position',responsiveMapper[isMobile(maxWidth)]);\r\n");
      out.write("        });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    //funcion compacta de parseo que me permite las reducciones\r\n");
      out.write("    function inflateTemplate(template,attrs){\r\n");
      out.write("\r\n");
      out.write("        $.each(attrs,(k,v)=>{\r\n");
      out.write("            template=template.replace('#'+(k+1),v);\r\n");
      out.write("        });\r\n");
      out.write("        return template;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\t//carga de los menus en el navbar lateral\r\n");
      out.write("\tfunction loadSideBar(items,cssClass){\r\n");
      out.write("\t    $.each(items,(k,item)=>{\r\n");
      out.write("                if(item.children == null)//caso base de enlace a vista\r\n");
      out.write("                    $('.'+cssClass+':first').append(inflateTemplate('<li><a href=\"#1\">#2</a></li>',[item.url,item.title]));\r\n");
      out.write("                //item.children != null &&\r\n");
      out.write("                else{ //caso general que aglutina los distintos\r\n");
      out.write("                    localClass = cssClass+item.title.split(\" \")[0];//compongo class con la que seleccionar a posteriori la lista envebida que genero\r\n");
      out.write("\r\n");
      out.write("                    $('.'+cssClass+':first').append(inflateTemplate('<ul class=\"#3\"><a href=\"#1\">#2</a><ul>',[item.url,item.title,localClass]));\r\n");
      out.write("                    $('.'+localClass).css($('.'+cssClass+\" li\").getStyleObject());\r\n");
      out.write("                    loadSideBar(item.children,localClass);\r\n");
      out.write("                }\r\n");
      out.write("        });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    //Workflow principal de la vista\r\n");
      out.write("\t$(document).ready(()=>{\r\n");
      out.write("\t    //seteo la propiedad fixed del contenedor principal\r\n");
      out.write("\t    responsiveSetUp(776);\r\n");
      out.write("\r\n");
      out.write("        //cargo los item de menu de la aplicacion\r\n");
      out.write("\t    loadSideBar(getMenuItems(),'sidebar-nav');\r\n");
      out.write("\r\n");
      out.write("        //carga de la pagina principal de la aplicacion\r\n");
      out.write("\t    loadPage(\"landing\",\"cotainerPrincipal\");\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
