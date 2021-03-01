/*
$.ajax()
* 语法：$.ajax({键值对});
    //使用$.ajax()发送异步请求
    $.ajax({
        url:"ajaxServlet1111" , // 请求路径
        type:"POST" , //请求方式
        //data: "username=jack&age=23",//请求参数
        data:{"username":"jack","age":23},
        success:function (data) {
            alert(data);
        },//响应成功后的回调函数
        error:function () {
            alert("出错啦...")
        },//表示如果请求响应出现错误，会执行的回调函数

        dataType:"text"//设置接受到的响应数据的格式
    });
*/
$(document).ready(function(){
    $("#btn").click(function(){
        ajax_jquery();
    });
    $("#jump").click(function(){
       ajax_jqery2();
    });
});
var m;
function ajax_jquery(){
    $.ajax({
        url:"../aq",
        type:"post",
        data:{
            username:$("#username").val(),
            userpass:$("#userpass").val()
        },
        success:function (data) {
            if(data == null){
                alert("注册失败");
            }else{
                data = $.parseJSON(data);
                alert(data.username+"注册成功");
            }
        },
        error:function () {
            alert("请求出错")
        },
        datatype:"json"
    });
}



