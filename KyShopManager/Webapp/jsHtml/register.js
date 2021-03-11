/**
 * 
 */
$(document).ready(function(){
  
  	$("#username").blur(function(){
 		$.ajax({
 			url:"../nameCheck.action",
        	type:"get",
        	data:{username:$("#username").val()},
        	datatype:"json",
        	success:function(data){
        		if(data==false){
        			$("#show").text("用户名存在");
        		}else{
        			$("#show").text("可以注册"); 
        		}
        	},
        	error:function(){
        		alert("请求出错");
        	}
 		});
 	});
 	
 	$("#submit").click(function(){
 		$.ajax({
 			url:"../registerUser.action",
 			type:"post",
 			data:{
 				user_name:$("#username").val(),
 				user_pass:$("#password").val()
 			},
 			datatype:"json",
 			success:function(data){
 				
 			},
 			error:function(){
 			}
 		});
 	});
 	
 });