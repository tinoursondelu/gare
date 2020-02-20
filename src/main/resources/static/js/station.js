var host ="http://localhost:8080/platform/" ;

var $j = jQuery.noConflict();

$j(document).ready(function () {
    $j.ajax({
        type : "GET",
        dataType: "json",
        contentType: "application/json",
        url: host,
        success : function (response) {
            response.forEach(function(item, index) {
                addLine(item);

            })

        }
    });

    function addLine(train) {
        $j("#tableBody")
            .append($j('<tr>')
                .append($j('<td>').text(train.reference))
            )

    }

});