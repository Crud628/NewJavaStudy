document.getElementById("username").onblur=ajax_get;


var getXHR;
var username = document.getElementById("username");
function ajax_get() {

    if (window.XMLHttpRequest){
        getXHR = new XMLHttpRequest();
    }else{
        getXHR = new ActiveXObject("Microsoft.XMLHttp");
    }

    var url = "../regist?username="+username.value;

    getXHR.onreadystatechange=getCallback;

    getXHR.open("get",url,true);

    getXHR.send(null);
}

function getCallback() {
    var flag = getXHR.responseText;
    if(getXHR.status == 200 && getXHR.readyState == 4){
        document.getElementById("show").innerHTML=flag;
    }
    if(flag.indexOf("占用")){
        document.getElementById("registBtn").setAttribute("disabled",true);
    }else{
        document.getElementById("registBtn").removeAttribute("disabled")
    }
}



