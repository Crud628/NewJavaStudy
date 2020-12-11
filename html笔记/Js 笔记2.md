# Js 笔记



## 1.Function




### 1.1  声明与使用

声明方法格式：

```js
 function  xxx(){
     
 }
```



调用

```js
xxx();
```



- 形参：  形式参数，参数名可以自定义，不用谢数据类型，
- 实参：  实体参数，具体的值

调用方法本质：形参给实参赋值



### 1.2  返回值



- 返回值：调用方法的代码本身  有值  值为方法体中  return关键字后跟的值

- return：~+value;   返回值

  ​				return;  离开该方法



## 1.3  函数的写法



```js
var xx = function(){
    
}
```

需要先声明



箭头函数

```js
()=>返回值;//只有一个参数可以省略（）
```

```js
()=>{ }
```



## 2  练习



1.编写一个函数，计算两个数字的大小，输出较大的值

```js
function fun1(a,b){
	return a>b?a:b;
}
console.log(fun1(1,2));
```

2.编写一个函数，计算三个数字的大小，按从小到大顺序输出

```js
function fun2(a,b,c){
	var arr=[a,b,c];
	arr = arr.sort(function(a,b){
		return a-b;//升序
	});
	for(var k in arr){
		console.log(arr[k]);
	}
}
fun2(13,4,1);
```



3.编写生成4位数字验证码的函数，并生成10次，同时将结果打印出来

```js
function fun3(){
	for(let i =0;i<=9; i++){
		console.log(Math.floor(Math.random()*10)+""+Math.floor(Math.random()*10)+Math.floor(Math.random()*10)+Math.floor(Math.random()*10));
	}
}
fun3();
```



4.编写一个函数，计算任意两个数字之间所能组成的奇数个数，数字必须是个位数
比如： 计算0-3之间能组成的奇数个是01、21、03、13、23、31

```js
function fun4(a,b){
	let temp = 1;
	if(a>b){
		for(let i = b;i < a;i++){
			if(i%2==1){
				temp+=1;
			}
		}
		return temp*(a-b);
	}else{
		for(let i = a;i < b;i++){
			if(i%2==1){
				temp+=1;
			}
		}
		return temp*(b-a);
	}
}
```





5.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换，请编写一个函数，传入原文，输出密文

```js
function fun5(a){
    
	let a1 = Math.floor(a/1000);
	let a2 = Math.floor(a/100)%10;
	let a3 = Math.floor(a/10)%10;
	let a4 = a%10;

	a1 = (a1+5)%10;
	a2 = (a2+5)%10;
	a3 = (a3+5)%10;
	a4 = (a4+5)%10;
	console.log(a4+""+a3+a2+a1);
}
fun5(2321);//6787
```





*6.求随机颜色，写成函数  （html/css 颜色格式 随机数Math.random()）

```js
function fun6(){
	let r = Math.floor(Math.random()*256);
	let g = Math.floor(Math.random()*256);
	let b = Math.floor(Math.random()*256);
	document.body.style.backgroundColor = "rgb("+r+","+g+","+b+")";
}
fun6();
```





7.通过函数创建表格,参数是行和列

```js
function fun7(){
    let x = prompt("请输入行");
    let y = prompt("请输入列");
	var str ="<table border=1>";
	for(let i = 1;i<x;i++){
		str+="<tr>";
            for(let j =1;j<x;j++){
                str+="<td>单元格</td>";
            }
		str+="</tr>"
	}
	str+="</table>"
	document.write(str);
}
```

