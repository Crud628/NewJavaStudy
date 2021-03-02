//当前页
var currentPage = 1;
var totalPage = 1;
$(document).ready(function(){
    getTotalPage();
    Pages(1);
});


//得到总页数
function getTotalPage() {
        $.ajax({
            url:"../getMemberTotal",
            type:"get",
            datatype:"text",
            success:function (data) {
                totalPage = data;
                $("#totalPage").text("/"+totalPage);
            },
            error:function () {
                alert("总页数获取错误");
            }
    })
}

//按钮跳页
function switchBtn(i) {
    switch (i) {
        //首页
        case 1:
            currentPage=1;
            Pages(1);
            $("#currentPage").text(currentPage);
            break;
            //上一页
        case 2:
            if (currentPage==1) {
                currentPage=totalPage;
                Pages(currentPage);
            }else{
                Pages(--currentPage);
            }
            $("#currentPage").text(currentPage);
            break;
        case 3:
            if(currentPage >= totalPage){
                currentPage=1;
                Pages(1);
            }else {
                Pages(++currentPage);
            }
            $("#currentPage").text(currentPage);
            break;
        default:
            var page = $("#iPage").val();
            if (page <1 ){
                alert("请输入1-"+totalPage+"页");
                break;
            }
            if(page > totalPage){
                alert("最大为"+totalPage+"页");
                break;
            }
            currentPage = page;
            Pages(currentPage);
            $("#currentPage").text(currentPage);
    }
}

function Pages(j) {
    $.ajax({
        url:"../memberPage",
        type:"get",
        data:{pageNum:j},
        datatype:"json",
        success:function (data) {
            data = $.parseJSON(data);
            var result="<table class='table table-striped table-hover '><thead><tr><th>员工id</th><th>员工姓名</th><th>员工性别</th><th>员工工资</th><th>员工部门</th><th>员工年龄</th></tr></thead>";
            $.each(data,function(i){
                result +="<tr><td>"+data[i].id
                    +"</td><td>"+data[i].name
                    +"</td><td>"+data[i].sex
                    +"</td><td>"+data[i].salary
                    +"</td><td>"+data[i].department
                    +"</td><td>"+data[i].age
                    +"</td></tr>";
            });
            result+="</table>";
            $("#show_list").html(result);
        },
        error:function () {
            alert("请求出错");
        }
    });
}

