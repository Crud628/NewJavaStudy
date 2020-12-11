
var time = document.getElementById("tim");
var ss = document.getElementById("s");
var clc = null;

function start(){
	clearInterval(clc);
	let time2=new Date().getTime();
	clc = setInterval(function(){ 
		let times = new Date().getTime() - time2;
		let minutes=Math.floor(times/60000);//毫秒转化为分钟
		let seconds=Math.floor((times-minutes*60000)/1000);
		let ms=Math.floor((times-minutes*60000-seconds*1000)/10);
		time.innerText = (minutes<10 ? "0" +minutes : minutes)+":"
 					+(seconds<10 ? "0"+seconds :seconds);
 		ss.innerText = ms<10?"0"+ms:ms;
	}, 10);
}

function stop(){
	clearInterval(clc);
}

function re(){
	time.innerText = "00:00";
	ss.innerText = "00";
}