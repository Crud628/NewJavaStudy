# HTML画布笔记(刮奖篇)



canvas元素用于在网页中绘制图形



------

## 什么是Canvas？

HTML5的canvas元素使用JavaScript在网页上绘制图形

画布是一个矩形区域，您可以控制其每一像素。

canvas拥有多种绘制路径、矩形、圆形、字符以及添加图像的方法。

-----

创建Canvas页面添加canvas元素。

```html
<canvas id="myCanvas" width="200" height="100"></canvas>
```



## 通过 JavaScript 来绘制

canvas 元素本身是没有绘图能力的。所有的绘制工作必须在 JavaScript 内部完成：

```js
<script type="text/javascript">
    //寻找canvas元素
    var c=document.getElementById("myCanvas");
	//创建context对象
    var cxt=c.getContext("2d");
	//getContext("2d") 对象是内建的 HTML5 对象，
	//拥有多种绘制路径、矩形、圆形、字符以及添加图像的方法。
	//下面的两行代码绘制一个红色的矩形：
    cxt.fillStyle="#FF0000";
    cxt.fillRect(0,0,150,75);
	//fillStyle 方法将其染成红色，fillRect 方法规定了形状、位置和尺寸。
</script>
```



绘制圆形

```js
	//红色圆球
cxt.fillStyle="#FF0000";
cxt.beginPath();
cxt.arc(70,18,15,0,Math.PI*2,true);
cxt.closePath();
cxt.fill();
```

实现代码

html

```html
    <div class="demo" id="demo">
        <canvas id ="myCanvas"></canvas>
    </div>
```



js

```js
//随机数   返回0-9
var result = Math.floor(Math.random() * 10);
window.onload = function(){
    if (result > 4) {
        document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
    }
}
document.addEventListener("keydown",keydown);
function keydown(e){
    //console.log(e.keyCode);
    //数字键  1：一半概率（一半）49  2：百分百概率 50  3：10%概率 51
    switch(e.keyCode){
        case 49:
            if (result > 4) {
                document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
            }
            break;
        case 50:
            document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
            break;
        case 51:
            if (result > 8) {
                document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
            }
            break;
    }
}	
```

​	

```js
var c = document.getElementById("myCanvas");
var cxt = c.getContext("2d");
cxt.fillStyle="gray";
cxt.fillRect(0,0,320,300);
cxt.globalCompositeOperation = 'destination-out';

//监听
c.addEventListener('mousedown', drawArcMouseHandle);
c.addEventListener('mouseup', function(event) {
	this.removeEventListener('mousemove', mousemoveHandle);
}); 

// 根据鼠标的move画圆
function drawArcMouseHandle(event) {
	//event.preventDefault();//取消事件的默认动作
	event.target.addEventListener("mousemove", mousemoveHandle);
}

// 为了能够移除movesemove的事件需要单独处理一下
function mousemoveHandle(event) {
	event.preventDefault();
	drawArcByPoint(event.pageX, event.pageY);
}

// //监听 touchmove   手机触摸
// c.addEventListener('touchmove', drawArcTouchHandle);

// // 根据触摸点画圆 
// function drawArcTouchHandle(event) {
// 	event.preventDefault();
// 	var touch = event.touches[0];
// 	drawArcByPoint(touch.pageX, touch.pageY);
// }

// 根据某个点在canvas上画圆
// x 坐标和 y 坐标 两个坐标是触摸点的坐标而不是画圆的圆心
// 圆心通过计算得出
function drawArcByPoint(x, y) {
	cxt.beginPath();
	cxt.arc(x - c.offsetLeft, y - c.offsetTop, 20, 0, Math.PI * 2);
	cxt.closePath();
	cxt.fillStyle = '#dddddd';
	cxt.fill();
	//checkComplete();    //完成度判断
}
```


​	

```js
// function checkComplete() {
// 	var imgData = cxt.getImageData(0, 0, 240, 65);
// 	var pxData = imgData.data; // 获取字节数据
// 	var len = pxData.length; // 获取字节长度
// 	var count = 0; // 记录透明点的个数
// 	// 主要的思想是 一个像素由四个数据组成，每个数据分别是 rgba() 所以第四个数据 a 表示alpha透明度
// 	for(var i = 0; i < len; i += 4) {
// 		var alpha = pxData[i + 3]; // 获取每个像素的透明度
// 		if(alpha < 10) {
// 			// 透明度小于10 
// 			count++;
// 		}
// 	}
// 	var percent = count / (len / 4); // 计算百分比
// 	// 如果百分比大于0.8 则表示成功
// 	if(percent >= 0.8) {
// 		showResult();
// 	}
// }

// 显示刮奖结果
// function showResult(msg) {
// 	msg = msg || "刮奖结束";
// 	var res = document.getElementById('result');
// 	res.innerHTML = msg;
// }
```


```js
//灰色填充
//cxt.fillStyle="gray";
//cxt.fillRect(0,0,320,160);
```


```js
//绘制折线
//cxt.moveTo(10,10);
//cxt.lineTo(150,50);
//cxt.lineTo(10,50);
//cxt.stroke();

//红色圆球
// cxt.fillStyle="#FF0000";
// cxt.beginPath();
// cxt.arc(70,18,15,0,Math.PI*2,true);
// cxt.closePath();
// cxt.fill();

//渐变
// var grd=cxt.createLinearGradient(0,0,175,50);
// grd.addColorStop(0,"#FF0000");
// grd.addColorStop(1,"#00FF00");
// cxt.fillStyle=grd;
// cxt.fillRect(0,0,175,50);
```


```js
//图像

// var img=new Image()
// img.src="images/p_0.jpg"
// cxt.drawImage(img,0,0);
```



最后效果（第一版）

```html
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>刮奖</title>
    <link rel="stylesheet" type="text/css" href="css/mr-style.css"/>
</head>
<body style="background-image: url(images/bg.png)">
<div id="main">
    <h2 class="top_title"><a href="#">JavaScript刮奖功能</a></h2>
    <div class="msg">请刮开灰色部分，<a href="javascript:void(0)" onClick="window.location.reload()">再来一次</a></div>
    <div class="demo" id="demo">
        <canvas id ="myCanvas"></canvas>
    </div>
</div>
<script type="text/javascript">
	//随机数   返回0-9
	var result = Math.floor(Math.random() * 10);
	window.onload = function(){
		if (result > 4) {
			document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
		}
	}
	document.addEventListener("keydown",keydown);
	function keydown(e){
		//console.log(e.keyCode);
		//数字键  1：一半概率（一半）49  2：百分百概率 50  3：10%概率 51
		switch(e.keyCode){
			case 49:
				if (result > 4) {
					document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
				}
				break;
			case 50:
				document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
				break;
			case 51:
				if (result > 8) {
					document.getElementById('demo').style.backgroundImage="url('images/p_1.jpg')";
				}
				break;
		}
	}		

	var c = document.getElementById("myCanvas");
	var cxt = c.getContext("2d");
	cxt.fillStyle="gray";
	cxt.fillRect(0,0,300,150);
	cxt.globalCompositeOperation = 'destination-out';
	var clc = null;
	//监听
	document.addEventListener('mousedown', drawArcMouseHandle);
	document.addEventListener('mouseup', function(event) {
		document.removeEventListener('mousemove', mousemoveHandle);
	}); 

	// 根据鼠标的move画圆   滑动
	function drawArcMouseHandle(event) {

		document.addEventListener("mousemove", mousemoveHandle);
	}

	// 为了能够移除movesemove的事件需要单独处理一下
	function mousemoveHandle(event) {
		event.preventDefault();//不写这个就停不下来
		
		drawArcByPoint(event.pageX, event.pageY);
	}
	// 根据某个点在canvas上画圆
	// x 坐标和 y 坐标 两个坐标是触摸点的坐标而不是画圆的圆心
	// 圆心通过计算得出
	function drawArcByPoint(x, y) {
		cxt.beginPath();
		cxt.arc(x - c.offsetLeft, y - c.offsetTop, 20, 0, Math.PI * 2);
		cxt.closePath();
		cxt.fillStyle = '#dddddd';
		cxt.fill();
	}
</script>
</body>
</html>
```



缺点：mousemove优化



