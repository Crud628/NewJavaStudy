// var str = "  abc  ";
// console.log(str.length);

//数组
//1
var arr = [1,2,3,4,5,6,7,8];
// function fun1(arr){
// 	var sum = 0;
// 	for(let i in arr){
// 		sum+=arr[i];
// 	}
// 	return sum;
// }

//2
// function fun2(arr){
// 	var sum = 0;
// 	for(let i in arr){
// 		if(arr[i]%2==1){
// 			sum+=arr[i];
// 		}
// 	}
// 	return sum;
// }

//3

// var fun3 = (arr)=>arr.reverse();
// fun3(arr);

// function fun4(m,arr){
// 	let flag = 0;
// 	for(let i in arr){
// 		if (arr[i]==m) {flag++};
// 	}
// }
// fun5([2,23,233,412,32,56,33,7,24,44]);
// function fun5(arr){
// 	let min = arr[0];
// 	let max = arr[0];
// 	for(let i = 0;i < arr.length;i++){
// 		if (arr[i+1] < min) {
// 			min = arr[i+1];
// 		}
// 		if (max<arr[i+1]) {
// 			max =arr[i+1];
// 		}
// 	}
// 	console.log("最大为："+max+"最小为："+min);
// }


// function fun6(arr){
// 	for(let i = 0;i<arr.length-1;i+=2){
// 		arr[i]+=10;
// 		arr[i+1]+=20;
// 	}
// }

// var str = "那车水马龙的人世间,那样地来 那样地去,太匆忙";
// var flag = "那"
// var fun1 = (str,flag)=>str.lastIndexOf(flag);
// console.log(fun1(str,flag));

// var fun2 = (id)=>id.substring(16,17)%2==0?"女":"男";
// console.log(fun2("211111111111111121"));


// var str = "awklkcdfkahcdqrhhcdwkhrkcdcd2324k"
// var flag = "cd";
// // var fun3 = (str,flag)=>str.split(flag).length-1;

// fun3(str,flag);

// function fun3(str,flag){
// 	var index = str.indexOf(flag);
// 	var num = 0;
// 	while(index>=0){
// 		console.log(index + 1);
// 		num++;
// 		index = str.indexOf(flag,index + 1);
// 	}
// 	console.log(flag+"一共出现"+num+"次");
// }

