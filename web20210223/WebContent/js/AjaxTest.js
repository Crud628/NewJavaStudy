document.getElementById("btn_01").onclick=ajax_test;

var xx1 = document.getElementById("username");
var xx2 = document.getElementById("userpass");
var getXHR; //声明全局变量
function ajax_test() {
    //alert("test ok");
    if (window.XMLHttpRequest){
        getXHR = new XMLHttpRequest();
    }else{
        getXHR = new ActiveXObject("Microsoft.XMLHttp");
    }

    var url = "../ajax?xx1="+xx1.value+"&xx2="+xx2.value;

    getXHR.onreadystatechange=getCallback;

    getXHR.open("get",url,true);

    getXHR.send(null);
}
function getCallback() {
    //console.log("1");
    // console.log(getXHR.responseText);
    if(getXHR.status==200&&getXHR.readyState==4){
        console.log(getXHR.responseText);
    }
}

document.getElementById("input_03").onblur=ajax_test_post;

var postXHR;
function ajax_tesy_post(){
    //alert("ok");
    if (window.XMLHttpRequest){
        getXHR = new XMLHttpRequest();
    }else{
        getXHR = new ActiveXObject("Microsoft.XMLHttp");
    }

    var url = "../ajax";
    var params = "test_val="+document.getElementById("input_03").value;

    postXHR.onreadystatechange = postCallback;
	

	postXHR.open("post",url,true);

    postXHR.setRequestHeader("Content-type","application/x-www-form-urlencoded");

    postXHR.send(params);
}

function postCallback(){
	if(postXHR.status == 200 && postXHR.readyState == 4){
		document.getElementById("show").innerHTML=postXHR.responseText;
	}
}
