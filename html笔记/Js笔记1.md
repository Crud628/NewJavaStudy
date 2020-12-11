# Js笔记



## 1.  输出

```js
alert("aaa");
var isDemo = confirm("are you ok?");
if (isDemo) {
	var txt = prompt("how old are you");
	console.log("你"+txt+"岁了");
}
```



## 2.  对象

```js
var man{// 	name:"李四",
	sex:"男",
	age:22,
	likes:["game","play"]
}
```



## 3.  数组相关

```js
var arr =[1,3,2,4,9,6,7,8];
var arr2 =[99,99,999];
arr.shift();//删除并返回第一个元素
arr.unshift(999);		//数组开头添加一个新元素，返回新长度
arr.pop();//删除并返回最后一个元素
arr.push(999);			//像数组末尾添加一个或多个元素，返回新长度
arr.sort();//顺序(ASCII)
arr.reverse();//倒序
var a = arr.concat(arr2);			//连接多个数组  返回新数组
var a =arr.indexOf(2);   //下标
arr.slice(3);  //分割，并返回后面的数组
//Array.toString(arr_03).contains()  
//arr.replace();	//err
var a = arr.contains("3");  //err   是否包含某值

console.log(a);
console.log(arr);

```



## 4.  扩展（ASCII）



![image-20201116140001038](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201116140001038.png)



常用：

- 回车  15
- 0-9  64-73
- A-Z  65-90
- a-z  97-122

大小写之间差  26+6



## 5.  多维数组

[ [ ],[ ],[ ] ];



## 6.  Js流程控制



选择、判断、循环、遍历



### 6.1  If



```js
if(){}
```

扩展:==判断内容，===判断值和类型



双分支

```js
if(){
   
   }else{
    
}
```

多分支

```js
if(){
   
   }else if(){
            
            }else if(){
                     
                     }...else{
}
```



### 6.2  switch



格式：

```js
switch(){
       case :
       		...
       		break;
       ...
       default:
       		break;

}
```



　练习：

```js
var m =prompt("输入一个月份")
	switch(m){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			alert(m + "月是大月");
			break;
		default:
			alert(m + "月是小月");
	}
```



### 6.3  for

```js
for(;;){}
```

数组遍历



for in遍历

```js
for(var xxx in array){
    
}
```



### 6.4  while/do while

```js
while(){
      
      }
```



```js
do{
    
}while()
```



### 6.5  练习

 

【程序2】判断输入的数字是几位数，如果是一位，输出“该数字是1位数”，如果是两位，输出“该数字是2位数”，

如果是三位，输出“该数字是3位数”(只需要判断到三位即可)

​	-----例如：-------------------------------

​		请输入一个整数：165

​		结果：该数字是3位数

​	-------------------------------------------

 ```js
var flag = prompt("请输入一个三位以下的数字");
switch(flag.length){
	case 1:
		alert("该数字是1位数");
		break;
	case 2:
		alert("该数字是2位数");
		break;
	case 3:
		alert("该数字是3位数");
		break;
}
 ```



【程序3】从控制台接受输入一件商品的	和数量，

​	如果商品的数量小于5件，不打折，

​	如果商品的数量在5件（包含）到10件（不包含）之间，折扣率为1%，

​	如果商品的数量在10（包含）到20件（不包含）之间，折扣率为2%； 

​	如果商品的数量在20（包含）到30（不包含）之间，折扣率为4%；

​	如果商品的数量大于等于30折扣率为6%；

​	根据用户的输入求得该用户实际应付款多少？

注意：折扣的钱保留整数，向上取整

​	-----例如：-------------------------------

​		请输入商品的价格：100

​		请输入商品的数量：5

​		结果：折扣率为1%，折扣是5元，总价格为500元，实际应付495元

​	-------------------------------------------

 ```js
var price = prompt("请输入商品单价");
var num = prompt("请输入商品数量");
var sum = num*price;
//console.log(sum);
if (num<5){
	alert("不打折");
}else if(num<10){
	alert("折扣率为1%，折扣是"+sum*0.01+"元，总价格为"+sum+"元，实际应付"+sum*0.99+"元");
}else if(num<20){
	alert("折扣率为2%，折扣是"+sum*0.02+"元，总价格为"+sum+"元，实际应付"+sum*0.98+"元");
}else if(num<30){
	alert("折扣率为4%，折扣是"+sum*0.04+"元，总价格为"+sum+"元，实际应付"+sum*0.96+"元");
}else{
	alert("折扣率为6%，折扣是"+sum*0.06+"元，总价格为"+sum+"元，实际应付"+sum*0.94+"元");
}
 ```



【程序4】随意输入1个数，要求：输出该数中的各个数位的数字，并输出他们的和

​	-----例如：-------------------------------

​		请输入一个数：321

​		结果：百位：3，十位：2，个位：1，总和为6

​	-------------------------------------------

 ```js
var flag = prompt("请输入一个数");
console.log("");
 ```



switch

【程序5】从控制台接收一个整数，判断该整数除以3余数为多少，

​		如果余数为0，输出：该数字可以被3整除

​		如果余数为1，输出：该数字不可以被3整除，余数为1

​		如果余数为2，输出：该数字不可以被3整除，余数为2

​	-----例如：-------------------------------

​		请输入1个数字：5

​		结果：该数字不可以被3整除，余数为2

​	-------------------------------------------

 ```js
var flag = prompt("请输入一个数");
switch(flag%3){
	case 0:
		alert("该数字可以被3整除")；
		break；
	case 1:
		alert("该数字不可以被3整除，余数为1")；
		break；
	case 2:
		alert("该数字不可以被3整除，余数为2")；
		break；
}
 ```



【程序6】从控制台接收一个两位整数a，

​		如果a大于等于90并且a小于100，打印“优秀”

​		如果a大于等于80并且a小于90，打印“良好”

​		如果a大于等于70并且a小于80，打印“中等”

​		如果a大于等于60并且a小于70，打印“及格”

​		否则打印“不及格”

​	-----例如：-------------------------------

​		请输入成绩：89

​		结果：良好

-------------------------------------------

```js
var flag = prompt("请输入一个两位整数");
switch(Math.floor(flag/10)){
	case 9:
		alert("优秀");
		break;
	case 8:
		alert("良好");
		break;
	case 7:
		alert("中等");
		break;
	case 6:
		alert("及格");
		break;
	default:
		alert("不及格");
}
```





【程序1】利用循环打印1  2  3  4  5  6

 ```js
for(var i = i;i<=6;i++){
	console.log(i);
}
 ```

【程序2】利用循环打印2  4  6  8  10

 ```js
for(var i = 0;i<=10;i++){	
	if(i%2==0){
		console.log(i);
	}
}
 ```

【程序3】利用循环打印1  2  4  8  16  32

 ```js
var a =1;
for(var i = 0;i<=5;i++){
	console.log(Math.pow(2,i));
}

 ```

【程序4】利用循环打印1  2  4  7  11  16          `(n^2-n+2)/2`

 ```js
for(var i = 1;i<=6;i++){
	console.log((i*i-i+2)/2);
}
 ```



【程序5】 利用循环打印2，3，5，8，12，17(注意要加逗号)           `n(n-1)/2+2`

```js
for(var i = 0;i<=6;i++){
	document.write(i*(i-1)/2+2);
	if(i<6){
		document.write(",");
	}
}
```



【程序6】打印1+2+3+4+5的结果

 ```js
var sum = 0;
for(var i = 1;i<=5;i++){
	sum+=i;
}
console.log(sum);
 ```



【程序7】打印出1-100中能被2和3和7同时整除的数

 ```js
for(var i = 1;i<=100;i++){
	if(i%2==0&&i%3==0&&i%7==0){
		console.log(i);
	}
}
 ```



【程序8】从控制台接取两个整数a和b，打印从a到b中所有整数的和

 ```js
var a = parseInt(prompt("请输入一个数a"));
var b = parseInt(prompt("请输入一个数b"));
var sum = 0;
if (a>b) {
	for(var i = b+1;i<a;i++){
		sum+=i;
	}
	console.log(sum);
}else{
	for(var i = a+1;i<b;i++){
		sum+=i;
	}
	console.log(sum);
}
 ```



【程序9】求1-2+3-4...+99-100的结果，并打印出来

 ```js
var sum = 0
for(var i = 1;i<=100;i++){
	if(i%2==0){
		sum-=i;
	}else{
		sum+=i;
	}
}
console.log(sum);//-50
 ```



【程序10】打印1-100中十位数为5的所有数字

```js
for(var i = 1;i<=100;i++){
	if(Math.floor(i/10)==5){
		console.log(i);
	}
}
```





进阶

1.求和:100以内整数和

```js
var sum = 0
for(var i = 1;i<=100;i++){
	sum+=i;
}
console.log(sum);
```



2.求20以内的奇数的乘积

```js
var sum = 1;
for(var i = 1;i<=20;i++){
	if(i%2==1){
		sum*=i;
	}
}
console.log(sum);
```



3.用for循环求100以内能被3整除的数的和

```js
var sum = 0;
for(var i = 1;i<=100;i++){
	if(i%3==0){
		sum+=i;
	}
}
console.log(sum);
```



4.用while循环求100以内能被3或5整除的数的和

```js
var sum = 0;
for(var i = 1;i<=100;i++){
	if(i%3==0||i%5==0){
		sum+=i;
	}
}
console.log(sum);
```



5.使用do while 循环求1,3,5,7,9的乘积

```js
var i = 1;
var sum = 1;
do{
	sum*=i;
	i+=2;
}while(i<=9)
```



6.求100到200中所有质数和

```js
var sum = 0;
var temp = 0;
for(var i =100;i<=200;i++){
	for(var j = 1;j<i;j++){
		if(i%j==0){
			temp++;
			if(temp<=2){
				sum+=i;
				//console.log(i);
				//console.log(sum);
				temp = 0;
				break;
			}
		}
	}
}
console.log(sum);
```



7.有一工人甲，工资是三位数ABC元（一个字母代表0-9中一个数字），

组内其它五个工人的工资可以这样表示：ACB,BAC,BCA,CAB,CBA,且这五个工人的

工资总额为3194，请问工人甲的工资具体是多少

```js
for(var a = 1;a<=9;a++){
	for(var b =1;b<=9;b++){
		if(a==b)
			continue;
		for(var c = 1;c<=9;c++){
			if(a==c||b==c)
				continue;

			if(a*122+b*212+c*221==3194){
				console.log(a*100+b*10+c);
			}
		}
	}
}
```



8.输出100以内所有的完数

```js
for (var i = 1; i < 100; i++) {
	var temp = 0;
	for (var j = 1; j < i; j++) {
		if (i % j == 0) {
			temp += j;
		}
	}
	if (temp == i) {
		console.log(i);
	}
}
```



9.直角三角形 9*9

*

**

***

```js
var result = "";
for(var i =1;i<=9;i++){
	for(var j = 1;j<=i;j++){
		result +="*";
	}
	console.log(result);
	result = "";
}
```



10.99乘法口诀

```js
document.write("<table border='1'>");
for (var i = 1; i <= 9; i++) {
    document.write("<tr>");
    for (var j = 1; j <= i; j++) {
        document.write("<td>" + i + "×" + j + "=" + i * j + "</td>");
    };
    document.write("</tr>");
};
document.write("</table>");
```



11.100-999的水仙花.(水仙花数是指一个 3 位数，

 它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）)。

```js
for(var i = 100;i<=999;i++){
	var a = Math.floor(i/100);
	var b = Math.floor(i/10)%10;
	var c = i%10;
	//console.log(a+" "+b+" "+c+" "+i)
	if(a*a*a+b*b*b+c*c*c==i){
		console.log(i);
	}
}
```





12.123是不是质数（质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。）

```js
var temp = 0;
for(var i = 1;i<=123;i++){
	if(123%i==0){
		temp++;
	}
}
if(temp>2){
	console.log("123不是质数");
}else{
	console.log("123是质数");
}
```



13.100-200之间质数并求和

```js
var sum = 0;
var temp = 0;
for(var i =100;i<=200;i++){
	for(var j = 1;j<i;j++){
		if(i%j==0){
			temp++;
			if(temp<2){
				sum+=i;
				console.log(i);
				//console.log(sum);
				temp = 0;
				break;
			}
		}
	}
}
console.log(sum);
```



14.鸡兔同笼

有若干只鸡兔同在一个笼子里，从上面数，有35个头，从下面数，有94只脚。问笼中各有多少只鸡和兔？

```js
var j = 0;
for(var i = 1;i<35;i++){
	for(var j = 1;j<35;j++){
        if(j == 35-i){
            if (i*2+j*4==94) {
                console.log("共有"+i+"只鸡，"+j+"只兔");
            }
        }else{
            continue;
        }
    }
}
```



15.有一个两位数，如果在它的前面添一个3, 可得到一个三位数；把3添在它的后面，也可以得到一个三位数。这两个三位数相差468，求原来的两位数。//85

```js
for(var i = 1;i<=9;i++){
	for(var j = 0;j<=9;j++){
		if (Math.abs(300+i*10+j-3-i*100-j*10)==468) {
			console.log(i*10+j);
		}
	}
}
```



16.某数学竞赛中，参赛人数大约在380~450人之间。

比赛结果，全体考生的总平均分为76分，

男生的平均分为75分，女生的平均分为80.1分，

求男女生各有多少人？

```js
for(var i =380;i<=450;i++){
	for(var j = 1;j<i;j++){
		for(var k = 1;k<i;k++)
            if( k == i - j){  
                if(75*j+80.1*k==76*i){
                    console.log("共有"+j+"个男生，"+k+"个女生");
                }
            }else{
                continue;
            }
        }
	}
}
```



```js
328   80
```



