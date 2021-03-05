/**
 * 
 */
var currentPage = 1;
var totalPage = 1;
 $(document).ready(function(){
 	Pages(1);
});

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


function remove(){
	var m=[];
	$("input[type='checkBox']:checked").each(function(){
		m.push($(this).parent().next().html());
		$(this).parent().parent().remove();
	});
	removeId(m);
}




function Pages(j) {
    $.ajax({
        url:"../getMemberPage.action",
        type:"get",
        data:{pageNum:j},
        datatype:"json",
        success:function (data) {
            totalPage=data.totalPage;
            $("#totalPage").text("/"+totalPage);
            var pages = data.list;
            var result="<table class='table table-striped table-hover '><thead><tr><th></th><th>员工id</th><th>员工姓名</th><th>员工性别</th><th>员工工资</th><th>员工部门</th><th>员工年龄</th></tr></thead>";
            	$.each(pages,function(i){
                	result +="<tr><td><input type='checkbox'>"
                		+"</td><td>"+pages[i].id
	                    +"</td><td>"+pages[i].name
	                    +"</td><td>"+pages[i].sex
	                    +"</td><td>"+pages[i].salary
	                    +"</td><td>"+pages[i].department
	                    +"</td><td>"+pages[i].age
	                    +"</td></tr>";
            	});
            result+="</table>";
            $("#show").html(result);
        },
        error:function () {
            alert("请求出错");
        }
    });
}

function removeId(m){
	$.ajax({
		 url:"../delMembers.action",
		 data:{"ids":m},
		 traditional:true,
         type:"get",
         datatype:"json",
         success:function(data){
         	if(data=="1"){
         		alert("刪除成功");
         	}else{
         		alert("刪除失敗")
         	}
         },
         error:function(){
         	alert("請求錯誤");
         }
	});
}