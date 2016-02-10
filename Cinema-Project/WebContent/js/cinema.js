$(document).ready(function(){
	
	$(".container").hide();

	$("h2.trigger").toggle(function(){
		$(this).addClass("active"); 
		}, function () {
		$(this).removeClass("active");
	});
	
	$("h2.trigger").click(function(){
		$(this).next(".container").toggle();
	});

	$(function() {
	    $( "#datepicker" ).datepicker();
	  });
	
	});

function sendData(){
	var value = document.querySelectorAll(".valueID");
	
}
