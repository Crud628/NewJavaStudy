/**
 * 
 */
$(function(){
	//导航条的制御
	//页面加载时，导航条2隐藏
	$('#nav_02').hide();
	$('#upImg').hide();
	//导航条1里的【商家管理】得到鼠标（焦点）时，导航条2淡入
	$('#nav_01_child').mouseenter(function(){
		$('#nav_02').fadeIn(2000);
		$('#upImg').show();
		$('#downImg').hide();
	});
	
	//导航条1里的【商家管理】失去鼠标（焦点）时，导航条2隐藏
	$('#nav_01_child').mouseleave(function(){
		$('#nav_02').hide();
		$('#upImg').hide();
		$('#downImg').show();
	});
	
	//如果焦点一直停留在导航条2上，导航条2显示
	$('#nav_02').hover(function(){
		$('#nav_02').show();
		$('#upImg').show();
		$('#downImg').hide();
	})
	
	//如果导航条2失去焦点时，导航条2隐藏
	$('#nav_02').mouseleave(function(){
		$('#nav_02').hide();
		$('#upImg').hide();
		$('#downImg').show();
	});
});
function startTime(){
		var today=new Date();
		var year = today.getFullYear();
		var month = today.getMonth()+1;
		var date = today.getDate();
		var h=today.getHours();
		var m=today.getMinutes();
		var s=today.getSeconds();
		month=checkTime(month);
		date=checkTime(date);
		h=checkTime(h);
		m=checkTime(m);
		s=checkTime(s);
		document.getElementById('timesDiv').innerHTML=year+"-"+month+"-"+date+" "+h+":"+m+":"+s
		t=setTimeout('startTime()',1000)
	}
function checkTime(i)
{
	if (i<10) 
	{i="0" + i}
	return i
}