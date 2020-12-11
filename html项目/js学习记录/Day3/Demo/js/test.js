// console.log(fun(10));
// var a = 4;
// function fun(a) {
// 	return Math.pow(a,2);
// }

// var m = function(a){
// 	return a*a;
// }

// //9
// var n = a=>{
// 	return a*a;
// }
// console.log(n(3));

// //16
// var c = s=>s*s;
// console.log(c(a));


// //1000000
// var x = ()=>{
// 	a = 1000;
// }
// x();
// console.log(c(a));

// var fun1=(num)=>num*num;

// console.log(fun1(3));


// function fun1(a,b){
// 	return a>b?a:b;
// }
// console.log(fun1(1,2));


// function fun2(a,b,c){
// 	var arr=[a,b,c];
// 	arr = arr.sort(function(a,b){
// 		return a-b;//升序
// 	});
// 	for(var k in arr){
// 		console.log(arr[k]);
// 	}
// }
// fun2(13,4,1);



// function fun3(){
// 	for(let i =0;i<=9; i++){
// 		console.log(Math.floor(Math.random()*8999)+1000);
// 	}
// }
// fun3();

// function fun4(a,b){
// 	let temp = 1;
// 	if(a>b){
// 		for(let i = b;i < a;i++){
// 			if(i%2==1){
// 				temp+=1;
// 			}
// 		}
// 		return temp*(a-b);
// 	}else{
// 		for(let i = a;i < b;i++){
// 			if(i%2==1){
// 				temp+=1;
// 			}
// 		}
// 		return temp*(b-a);
// 	}
// }
// console.log(fun4(0,3));

// function fun5(a){
// 	let a1 = Math.floor(a/1000);
// 	let a2 = Math.floor(a/100)%10;
// 	let a3 = Math.floor(a/10)%10;
// 	let a4 = a%10;
// 	//console.log(a)
// 	//console.log(a1+" "+a2+" "+a3+" "+a4)
// 	a1 = (a1+5)%10;
// 	a2 = (a2+5)%10;
// 	a3 = (a3+5)%10;
// 	a4 = (a4+5)%10;

// 	let temp = 0;
// 	temp = a1;
// 	a1 = a4;
// 	a4 = temp;

// 	temp = a2;
// 	a2 = a3;
// 	a3 = temp;
// 	console.log(a1+""+a2+a3+a4);
// }
// fun5(2321);


// function fun6(){
// 	let r = Math.floor(Math.random()*255);
// 	let g = Math.floor(Math.random()*255);
// 	let b = Math.floor(Math.random()*255);
// 	document.body.style.backgroundColor = "rgb("+r+","+g+","+b+")";
// }
// fun6();

// function fun7(x,y){
// 	var str ="<table border=1>";
// 	for(let i = 1;i<x;i++){
// 		str+="<tr>";
// 		for(let j =1;j<x;j++){
// 			str+="<td>单元格</td>";
// 		}
// 		str+="</tr>"
// 	}
// 	str+="</table>"
// 	document.write(str);
// }
// fun7(10,20);