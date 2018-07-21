package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class landing_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      google.charts.load('current', {'packages':['corechart']});\r\n");
      out.write("      google.charts.setOnLoadCallback(drawProgress);\r\n");
      out.write("      function drawChart() {\r\n");
      out.write("             var dataTable = new google.visualization.DataTable();\r\n");
      out.write("             dataTable.addColumn({ type: 'date', id: 'Date' });\r\n");
      out.write("             dataTable.addColumn({ type: 'number', id: 'Won/Loss' });\r\n");
      out.write("             dataTable.addRows([\r\n");
      out.write("                [ new Date(2012, 3, 13), 37032 ],\r\n");
      out.write("                [ new Date(2012, 3, 14), 38024 ],\r\n");
      out.write("                [ new Date(2012, 3, 15), 38024 ],\r\n");
      out.write("                [ new Date(2012, 3, 16), 38108 ],\r\n");
      out.write("                [ new Date(2012, 3, 17), 38229 ],\r\n");
      out.write("                // Many rows omitted for brevity.\r\n");
      out.write("                [ new Date(2013, 9, 4), 38177 ],\r\n");
      out.write("                [ new Date(2013, 9, 5), 38705 ],\r\n");
      out.write("                [ new Date(2013, 9, 12), 38210 ],\r\n");
      out.write("                [ new Date(2013, 9, 13), 38029 ],\r\n");
      out.write("                [ new Date(2013, 9, 19), 38823 ],\r\n");
      out.write("                [ new Date(2013, 9, 23), 38345 ],\r\n");
      out.write("                [ new Date(2013, 9, 24), 38436 ],\r\n");
      out.write("                [ new Date(2013, 9, 30), 38447 ]\r\n");
      out.write("              ]);\r\n");
      out.write("\r\n");
      out.write("             var chart = new google.visualization.Calendar(document.getElementById('calendar_basic'));\r\n");
      out.write("\r\n");
      out.write("             var options = {\r\n");
      out.write("               title: \"Red Sox Attendance\",\r\n");
      out.write("               height: 350,\r\n");
      out.write("             };\r\n");
      out.write("\r\n");
      out.write("             chart.draw(dataTable, options);\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("      function drawProgress() {\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("          ['Year', 'Sales', 'Expenses'],\r\n");
      out.write("          ['2004',  1000,      400],\r\n");
      out.write("          ['2005',  1170,      460],\r\n");
      out.write("          ['2006',  660,       1120],\r\n");
      out.write("          ['2007',  1030,      540]\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          title: 'Company Performance',\r\n");
      out.write("          curveType: 'function',\r\n");
      out.write("          legend: { position: 'bottom' }\r\n");
      out.write("        };\r\n");
      out.write("            $( document ).ready(()=>{\r\n");
      out.write("                var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n");
      out.write("                 google.charts.load(\"current\", {packages:[\"calendar\"]});\r\n");
      out.write("                 google.charts.setOnLoadCallback(drawChart);\r\n");
      out.write("                chart.draw(data, options);\r\n");
      out.write("            }); \r\n");
      out.write("\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"curve_chart\" ></div>\r\n");
      out.write("        <div id=\"calendar_basic\"></div>\r\n");
      out.write("    </body>");
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
