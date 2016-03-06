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
	
	});

function sendData(event){
	var value = $(event.currentTarget).data("id");
	$("#inputId").val(value);
	$("#subId").submit();
}

function summaryData(){
	var userName = document.getElementById("nome").value;
	$("#userName").val(userName);
	("#subSummaryInfo").submit();
//	var userSurname = document.getElementById("cognome").value;
//	var userEmail = document.getElementById("email").value;
//	$("#filmInfo").val(userName);
//	$("#subSummaryInfo").submit();
}

//function prova(){
//	var userName = document.getElementById("nome").value;
//	$("#userName").val(userName);
//	("#subSummaryInfo").submit();
////	
//}
