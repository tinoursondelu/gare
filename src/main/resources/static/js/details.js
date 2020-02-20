'use strict';

$(main);


function main(){

    var host = "http://localhost:8080/travel";

    var trainRefBox = $("#trainRef");
    var travelRefBox = $("#travelRef");

    var stepTravelList = $("#stepTravelList");

    trainRefBox.text("coucou");



$("#go").on("click", function(){

    var travel = {
        'id' : 1
    }

    $.ajax({
               method: "GET",
               dataType: "json",
               contentType: 'application/json',
               url: host + "/detail/?id=1",
//               data: JSON.stringify(travel),
               success: function(response) {
                    console.log(response);

               }
       });


});







}