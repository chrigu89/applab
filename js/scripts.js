jQuery(document).ready(function() {
	if($('#website').attr("src") == "loading.html") {
		$('#website').attr("src", "http://applab.thenetworks.de/?notoken");	
	} 
	
	window.plugins.insomnia.keepAwake(function(data) { alert('success'); }, function(data) { alert('error'); });
});