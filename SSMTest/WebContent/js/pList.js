/**
 * 
 */

var pagee;
 $(document).ready(function(){
 	Pages(1);
});

function switchBtn(i) {
    switch (i) {
        case 1://???
            Pages(1);
            //$("#currentPage").text(1);
            break;
        case 2://????
			Pages(pagee.prePage)
            //$("#currentPage").text(pagee.prePage);
            break;
        case 3://????
			Pages(pagee.nextPage)
            //$("#currentPage").text(pagee.nextPage);
            break;
		case 4:
			Pages(pagee.nextPage)
            //$("#currentPage").text(pagee.nextPage);
            break;
        default://???
            var page = $("#pageNum").val();
			Pages(page)
            //$("#currentPage").text(page);
    }
}
function Pages(j){
	    $.ajax({
        url:"../getMemberPage3.action",
        type:"get",
        data:{
        	uname:$("#name_like").val(),
        	salary1:$("#id_min").val(),
        	salary2:$("#id_max").val(),
			dep:$("#department").val(),
			pageNum:j
        	},
        datatype:"json",
        success:function (data) {
        	pagee=data
            totalPage=data.totalPage;
            //$("#totalPage").text("/"+pagee.pages);
            var pages = data.list;
            var result="<table class='table table-striped table-hover '><thead><tr><th></th><th>员工id</th><th>员工姓名</th><th>员工性别</th><th>薪资</th><th>部门</th><th>年龄</th></tr></thead>";
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