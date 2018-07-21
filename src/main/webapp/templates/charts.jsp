    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawProgress);
      function drawChart() {
             var dataTable = new google.visualization.DataTable();
             dataTable.addColumn({ type: 'date', id: 'Date' });
             dataTable.addColumn({ type: 'number', id: 'Won/Loss' });
             dataTable.addRows([
                [ new Date(2012, 3, 13), 37032 ],
                [ new Date(2012, 3, 14), 38024 ],
                [ new Date(2012, 3, 15), 38024 ],
                [ new Date(2012, 3, 16), 38108 ],
                [ new Date(2012, 3, 17), 38229 ],
                // Many rows omitted for brevity.
                [ new Date(2013, 9, 4), 38177 ],
                [ new Date(2013, 9, 5), 38705 ],
                [ new Date(2013, 9, 12), 38210 ],
                [ new Date(2013, 9, 13), 38029 ],
                [ new Date(2013, 9, 19), 38823 ],
                [ new Date(2013, 9, 23), 38345 ],
                [ new Date(2013, 9, 24), 38436 ],
                [ new Date(2013, 9, 30), 38447 ]
              ]);

             var chart = new google.visualization.Calendar(document.getElementById('calendar_basic'));

             var options = {
               title: "Red Sox Attendance",
               height: 350,
             };

             chart.draw(dataTable, options);
         }

      function drawProgress() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses'],
          ['2004',  1000,      400],
          ['2005',  1170,      460],
          ['2006',  660,       1120],
          ['2007',  1030,      540]
        ]);

        var options = {
          title: 'Company Performance',
          curveType: 'function',
          legend: { position: 'bottom' }
        };
            $( document ).ready(()=>{
                var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));
                 google.charts.load("current", {packages:["calendar"]});
                 google.charts.setOnLoadCallback(drawChart);
                chart.draw(data, options);
            }); 

      }
    </script>

    <body>
        <div id="curve_chart" ></div>
        <div id="calendar_basic"></div>
    </body>