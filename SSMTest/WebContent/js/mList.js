/**
 * 
 */
 $(document).ready(function(){
	$("#btn").click(function(){
		$.ajax({
            url:"../getMemberList.action",
            type:"get",
            datatype:"json",
            success:function (data) {
            	var result="<table class='table table-striped table-hover '><thead><tr><th></th><th>员工id</th><th>员工姓名</th><th>员工性别</th><th>员工工资</th><th>员工部门</th><th>员工年龄</th></tr></thead>";
            	$.each(data,function(i){
                	result +="<tr><td><input type='checkbox'>"
                		+"</td><td>"+data[i].id
	                    +"</td><td>"+data[i].name
	                    +"</td><td>"+data[i].sex
	                    +"</td><td>"+data[i].salary
	                    +"</td><td>"+data[i].department
	                    +"</td><td>"+data[i].age
	                    +"</td></tr>";
            	});
            result+="</table>";
            $("#show").html(result);
            },
            error:function () {
                alert("总页数获取错误");
            }
	});
});
});

function remove(){
	var m=[];
	$("input[type='checkBox']:checked").each(function(){
		m.push($(this).parent().next().html());
		$(this).parent().parent().remove();
	});
	removeId(m);
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