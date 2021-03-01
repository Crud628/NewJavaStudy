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
        default:
            if(currentPage >= totalPage){
                currentPage=1;
                Pages(1);
            }else {
                Pages(++currentPage);
            }
            $("#currentPage").text(currentPage);
            break;

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
            var result="<table border='1' cellspacing='0'><thead><tr><th>员工id</th><th>员工姓名</th><th>员工性别</th><th>员工工资</th><th>员工部门</th><th>员工年龄</th></tr></thead>";
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

