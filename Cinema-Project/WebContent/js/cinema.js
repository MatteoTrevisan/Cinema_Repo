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
	var valueId = $(event.currentTarget).data("id");
	var valuePrice = $(event.currentTarget).data("price");
	$("#inputId").val(valueId);
	$("#filmPrice").val(valuePrice);
	$("#subId").submit();
}

function summaryData(){
	var userName = document.getElementById("nome").value;
	var userSurname = document.getElementById("cognome").value;
	$("#userName").val(userName);
	$("#userSurname").val(userSurname);
	
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
