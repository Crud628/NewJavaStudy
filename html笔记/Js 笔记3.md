#  JS 笔记3



## 1  String



常用方法

```js
var demo = "  abc  ";
console.log(demo.length);//7
```

- indexOf   返回查找的首次位置		/-1
- match() 查找某一个元素  返回该元素  /null
- repacle 替换  replace（a,b）  原字符不变，返回替换后的字符
- chartAt()    获取位置上的字符
- concat()    连接
- split()      分割数组
- subString()    截取   左闭右开
- toUpperCase()/toLowerCase()  大小写转化
- toString()     转换字符串
- valueOf()    隐藏的显示



## 练习



练习1：定义数组，统计累加和

```js
var arr = [1,2,3,4,5,6,7,8];
function fun1(arr){
	var sum = 0;
	for(let i in arr){
		sum+=arr[i];
	}
	return sum;
}
```



练习2：定义数组存放数字，统计数组里所有奇数的和

```js
function fun2(arr){
	var sum = 0;
	for(let i in arr){
		if(arr[i]%2==1){
			sum+=arr[i];
		}
	}
	return sum;
}
```



练习3：定义数组存放数字，把第1个位置的元素和最后1个位置的元素交换，第2个位置的元素和倒数第2个位置的元素交换，依次类推。

```js
var fun3 = (arr)=>arr.reverse();
fun3(arr);
```

练习4：定义数组存放数字，统计某个元素出现的次数。注意封装成函数。

```js
function fun4(m,arr){
	let flag = 0;
	for(let i in arr){
		if (arr[i]==m) {
            flag++
        };
	}
    return flag;
}
```



练习5：定义数组存放数字，寻找数组里里面最大值和最小值

```js
fun5([2,23,233,412,32,56,33,7,24,44]);
function fun5(arr){
	let min = arr[0];
	let max = arr[0];
	for(let i = 0;i < arr.length;i++){
		if (arr[i+1] < min) {
			min = arr[i+1];
		}
		if (max<arr[i+1]) {
			max =arr[i+1];
		}
	}
	console.log("最大为："+max+"最小为："+min);
}


function fun5(arr){
    arr = arr.sort(function(a,b){
		return a-b;//升序
	});
    console.log("最大为："+arr[arr.legth-1]+"最小为："+arr[0]);
}
```



练习6：定义数组存放数字，位置为奇数的元素加10，位置为偶数的元素加20。

```js
function fun6(arr){
	for(let i = 0;i<arr.length-1;i+=2){
		arr[i]+=10;
		arr[i+1]+=20;
	}
}
```



1."那车水马龙的人世间,那样地来 那样地去,太匆忙"最后一次出现"那"的位置。

```js
var str = "那车水马龙的人世间,那样地来 那样地去,太匆忙";
var flag = "那"
var fun1 = (str,flag)=>str.lastIndexOf(flag);
console.log(fun1(str,flag));
```

2.有一身份证号,判断此为男还是女,基于此方法,写一个算法,判断一个身份证号为男还是女。

注意：可以根据身份证号码的第十七位判断性别,如果为奇数则为男性,偶数则为女性

```js
var fun2 = (id)=>id.substring(16,17)%2==0?"女":"男";
console.log(fun2("211111111111111121"));
```

3.定义字符串，统计某个字符/字符片段出现的次数

 “awklkcdfkahcdqrhhcdwkhrkcdcd2324k”

cd出现几次 

```js
var str = "awklkcdfkahcdqrhhcdwkhrkcdcd2324k"
var flag = "cd";
var fun3 = (str,flag)=>str.split().length-1;

console.log(fun3(str,flag));//5

//记录位置;
function fun3(str,flag){
	var index = str.indexOf(flag);
	var num = 0;
	while(index>=0){
		console.log(index + 1);
		num++;
		index = str.indexOf(flag,index + 1);
	}
	console.log(flag+"一共出现"+num+"次");
}
```





