
$(document).ready(function(){
    $("#jump").click(function(){
        ajax_jquery();
    });
});

function ajax_jquery() {
    $.ajax({
        url:"../memberPage",
        type:"get",
        data:{pageNum:$("#input_01").val()},
        datatype:"json",
        success:function (data) {

        },
        error:function () {
            alert("请求出错");
        }
    });
}