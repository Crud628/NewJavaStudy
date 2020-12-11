$('#hide').click(function(){
	$('#span_1').hide();
});
$('#show').click(function(){
	$('#span_1').show();
});
$('#toggle').click(function(){
	$('#span_1').toggle();
});



$("fadeIn").click(function(){
	$('#span_2').fadeIn("slow");
});
$("fadeOut").click(function(){
	$('#span_2').fadeOut("slow");
});
$("fadeToggle").click(function(){
	$('#span_2').fadeToggle("slow");
});
$("fadeTo").click(function(){
	$('#span_2').fadeTo("slow");
});