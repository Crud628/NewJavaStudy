/**
 * 
 */
 $(document).ready(function(){
 	$("#submit").click(function(){
 		$.ajax({
 			url:"../loginUser.action",
 			type:"post",
 			data:{
 				user_name:$("#username").val(),
 				user_pass:$("#password").val()
 			},
 			datatype:"json",
 			success:function(data){
 				if(data.username != null){
 					//登陆成功
 				}else{
 					//登陆失败
 				}
 			},
 			error:function(){
 			
 			}
 		});
 	});
});