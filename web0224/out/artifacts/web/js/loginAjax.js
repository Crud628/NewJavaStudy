var btn = document.getElementById("btn");


var postXHR;
function ajax_test() {
    //alert("test ok");
    if (window.XMLHttpRequest){
        postXHR = new XMLHttpRequest();
    }else{
        postXHR = new ActiveXObject("Microsoft.XMLHttp");
    }

    var url = "../aaaaaa";
    var params = "username="+document.getElementById("username")+"&userpass"+document.getElementById("userpass");

    postXHR.onreadystatechange=postCallback;

    postXHR.open("post",url,true);

    postXHR.send(params);
}
function postCallback() {
    //console.log("1");
    // console.log(getXHR.responseText);
    if(getXHR.status==200&&getXHR.readyState==4){
        // console.log(getXHR.responseText);
        if(postXHR.responseText=="1"){
            location.href("../jsp/selectMember.jsp")
        }else{
            alert("账号或密码错误");
        }
    }
}
