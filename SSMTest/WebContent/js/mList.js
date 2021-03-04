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
            $("#show").html(result);
            },
            error:function () {
                alert("总页数获取错误");
            }
	});
});
});