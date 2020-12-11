
//输出

// alert("aaa");
// var isDemo = confirm("are you ok?");
// if (isDemo) {
// 	var txt = prompt("how old are you");
// 	console.log("你"+txt+"岁了");
// }

//对象

// var man{// 	name:"李四",
// 	sex:"男",
// 	age:22,
// 	likes:["game","play"]
// }

//数组相关
// var arr =[1,3,2,4,9,6,7,8];
// var arr2 =[99,99,999];
//arr.shift();//删除并返回第一个元素
//arr.unshift(999);		//数组开头添加一个新元素，返回新长度
//arr.pop();//删除并返回最后一个元素
//arr.push(999);			//像数组末尾添加一个或多个元素，返回新长度
//arr.sort();//顺序
//arr.reverse();//倒序
//var a = arr.concat(arr2);			//连接多个数组  返回新数组
//var a =arr.indexOf(2);   //下标
//arr.slice(3);  //分割，并返回后面的数组
//Array.toString(arr_03).contains
//arr.replace();	//err
//var a = arr.contains("3");  //err   是否包含某值

//console.log(a);
//console.log(arr);

// var m =prompt("输入一个月份")
// 	switch(m){
// 		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
// 			alert(m + "月是大月");
// 			break;
// 		default:
// 			alert(m + "月是小月");
// 	}


// 程序2
// var flag = prompt("请输入一个三位以下的数字");
// switch(flag.length){
// 	case 1:
// 		alert("该数字是1位数");
// 		break;
// 	case 2:
// 		alert("该数字是2位数");
// 		break;
// 	case 3:
// 		alert("该数字是3位数");
// 		break;
// }

// 程序3
// var price = prompt("请输入商品单价");
// var num = prompt("请输入商品数量");
// var sum = num*price;
// //console.log(sum);
// if (num<5){
// 	alert("不打折");
// }else if(num<10){
// 	alert("折扣率为1%，折扣是"+sum*0.01+"元，总价格为"+sum+"元，实际应付"+sum*0.99+"元");
// }else if(num<20){
// 	alert("折扣率为2%，折扣是"+sum*0.02+"元，总价格为"+sum+"元，实际应付"+sum*0.98+"元");
// }else if(num<30){
// 	alert("折扣率为4%，折扣是"+sum*0.04+"元，总价格为"+sum+"元，实际应付"+sum*0.96+"元");
// }else{
// 	alert("折扣率为6%，折扣是"+sum*0.06+"元，总价格为"+sum+"元，实际应付"+sum*0.94+"元");
// }

// 程序4
// var flag = prompt("请输入一个数");
// console.log("");

//程序5
// var flag = prompt("请输入一个数");
// switch(flag%3){
// 	case 0:
// 		alert("该数字可以被3整除")；
// 		break；
// 	case 1:
// 		alert("该数字不可以被3整除，余数为1")；
// 		break；
// 	case 2:
// 		alert("该数字不可以被3整除，余数为2")；
// 		break；
// }

// 程序6
// var flag = prompt("请输入一个两位整数");
// switch(Math.floor(flag/10)){
// 	case 9:
// 		alert("优秀");
// 		break;
// 	case 8:
// 		alert("良好");
// 		break;
// 	case 7:
// 		alert("中等");
// 		break;
// 	case 6:
// 		alert("及格");
// 		break;
// 	default:
// 		alert("不及格");
// }

// while

// 程序1
// for(var i = i;i<=6;i++){
// 	console.log(i);
// }

//程序2
// for(var i = 0;i<=10;i++){	
// 	if(i%2==0){
// 		console.log(i);
// 	}
// }

//程序3
// var a =1;
// for(var i = 0;i<=5;i++){
// 	console.log(Math.pow(2,i));
// }

// 程序4  (n^2-n+2)/2
// for(var i = 1;i<=6;i++){
// 	console.log((i*i-i+2)/2);
// }

// 程序5  n(n-1)/2+2
// for(var i = 0;i<=6;i++){
// 	document.write(i*(i-1)/2+2);
// 	if(i<6){
// 		document.write(",");
// 	}
// }

// 程序6
// var sum = 0;
// for(var i = 1;i<=5;i++){
// 	sum+=i;
// }
// console.log(sum);

// 程序7
// for(var i = 1;i<=100;i++){
// 	if(i%2==0&&i%3==0&&i%7==0){
// 		console.log(i);
// 	}
// }

// 程序8
// var a = parseInt(prompt("请输入一个数a"));
// var b = parseInt(prompt("请输入一个数b"));
// var sum = 0;
// if (a>b) {
// 	for(var i = b+1;i<a;i++){
// 		sum+=i;
// 	}
// 	console.log(sum);
// }else{
// 	for(var i = a+1;i<b;i++){
// 		sum+=i;
// 	}
// 	console.log(sum);
// }

//程序9
// var sum = 0
// for(var i = 1;i<=100;i++){
// 	if(i%2==0){
// 		sum-=i;
// 	}else{
// 		sum+=i;
// 	}
// }
// console.log(sum);

// 程序10
// for(var i = 1;i<=100;i++){
// 	if(Math.floor(i/10)==5){
// 		console.log(i);
// 	}
// }

// 进阶
// 1
// var sum = 0
// for(var i = 1;i<=100;i++){
// 	sum+=i;
// }
// console.log(sum);

//2
// var sum = 1;
// for(var i = 1;i<=20;i++){
// 	if(i%2==1){
// 		sum*=i;
// 	}
// }
// console.log(sum);

//3
// var sum = 0;
// for(var i = 1;i<=100;i++){
// 	if(i%3==0){
// 		sum+=i;
// 	}
// }
// console.log(sum);

//4
// var sum = 0;
// for(var i = 1;i<=100;i++){
// 	if(i%3==0||i%5==0){
// 		sum+=i;
// 	}
// }
// console.log(sum);

//5
// var i = 1;
// var sum = i;
// do{
// 	sum*=i;
// 	i+=2;
// }while(i<=9)
// console.log(sum);

//6
// var sum = 0;
// var temp = 0;
// for(var i =100;i<=200;i++){
// 	for(var j = 1;j<i;j++){
// 		if(i%j==0){
// 			temp++;
// 			if(temp<2){
// 				sum+=i;
// 				console.log(i);
// 				//console.log(sum);
// 				temp = 0;
// 				break;
// 			}
// 		}
// 	}
// }
// console.log(sum);

//7
// for(var a = 1;a<=9;a++){
// 	for(var b =1;b<=9;b++){
// 		if(a==b)
// 			continue;
// 		for(var c = 1;c<=9;c++){
// 			if(a==c||b==c)
// 				continue;

// 			if(a*122+b*212+c*221==3194){
// 				console.log(a*100+b*10+c);
// 			}
// 		}
// 	}
// }

//8
// for (var i = 1; i < 100; i++) {
// 	var temp = 0;
// 	for (var j = 1; j < i; j++) {
// 		if (i % j == 0) {
// 			temp += j;
// 		}
// 	}
// 	if (temp == i) {
// 		console.log(i);
// 	}
// }

//9
// var result = "";
// for(var i =1;i<=9;i++){
// 	for(var j = 1;j<=i;j++){
// 		result +="*";
// 	}
// 	console.log(result);
// 	result = "";
// }

//10
// var result = "";
// var line = "----"
// for(var i =1;i<=9;i++){
// 	for(var j = 1;j<=i;j++){
// 		result +=i+"*"+j+"="+i*j+"  ";
// 		line+="---"
// 	}
// 	result+="<br>"
// 	document.write(result);
// 	document.write(line+"<br>")
// 	result = "";
// }

document.write("<table border='1'>");
for (var i = 1; i <= 9; i++) {
    document.write("<tr>");
    for (var j = 1; j <= i; j++) {
        document.write("<td>" + i + "×" + j + "=" + i * j + "</td>");
    };
    document.write("</tr>");
};
document.write("</table>");

//11
// for(var i = 100;i<=999;i++){
// 	var a = Math.floor(i/100);
// 	var b = Math.floor(i/10)%10;
// 	var c = i%10;
// 	//console.log(a+" "+b+" "+c+" "+i)
// 	if(a*a*a+b*b*b+c*c*c==i){
// 		console.log(i);
// 	}
// }

//12
// var temp = 0;
// for(var i = 1;i<=123;i++){
// 	if(123%i==0){
// 		temp++;
// 	}
// }
// if(temp>2){
// 	console.log("123不是质数");
// }else{
// 	console.log("123是质数");
// }

//13
// var sum = 0;
// var temp = 0;
// for(var i =100;i<=200;i++){
// 	for(var j = 1;j<i;j++){
// 		if(i%j==0){
// 			temp++;
// 			if(temp<2){
// 				sum+=i;
// 				console.log(i);
// 				//console.log(sum);
// 				temp = 0;
// 				break;
// 			}
// 		}
// 	}
// }
// console.log(sum);


//14
// var j = 0;
// for(var i = 1;i<35;i++){
// 	j = 35-i;
// 	if (i*2+j*4==94) {
// 		console.log("共有"+i+"只鸡，"+j+"只兔");
// 	}
// }

//15
// for(var i = 1;i<=9;i++){
// 	for(var j = 0;j<=9;j++){
// 		if (Math.abs(300+i*10+j-3-i*100-j*10)==468) {
// 			console.log(i*10+j);
// 		}
// 	}
// }

// 16
// for(var i =380;i<=450;i++){
// 	for(var j = 1;j<i;j++){
// 		var k = i - j;
// 		if(75*j+80.1*k==76*i){
// 			console.log("共有"+j+"个男生，"+k+"个女生");
// 		}
// 	}
// }
