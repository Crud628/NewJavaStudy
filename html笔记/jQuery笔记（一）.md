# jQuery笔记（一）



jQuery   js的库  简称jq；



jq特性

html元素获取、设置

css操作

html事件、函数

*动作、动画

Ajax（向后端发送请求）

节点操作





引入：

！！！在引入自定义js之前   先引入jq库

html元素获取

```js
$（”选择器“）
```

text()   innerText

html()    innerHTML

val()     value



attr("属性名")   attrbuite





html元素设置

内容

text（“修改后的值”）  html（）   val（）同

属性

attr（“属性名”，新的属性值）    修改属性值为具体内容的属性

prop（“属性名”，新的属性值）  修改属性值为true、false的属性





节点操作

节点.remove()删除

节点.empty   	清空内部

动态创建节点：节点A.append(节点B)     将B元素添加至A元素中

$("body").append($("<div class = 'aaa'>jq创建的节点</div>"));



css操作

节点.addClass()  向被选节点添加class属性

removeClass

toggleClass

css（）





## show([speed,[easing],[fn]])

### 概述

显示隐藏的匹配元素。

这个就是 'show( speed, [callback] )' 无动画的版本。如果选择的元素是可见的，这个方法将不会改变任何东西。无论这个元素是通过hide()方法隐藏的还是在CSS里设置了display:none;，这个方法都将有效。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn:**在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

显示所有段落

##### HTML 代码:

```
<p style="display: none">Hello</p>
```

##### jQuery 代码:

```
$("p").show()
```

#### 描述:

用缓慢的动画将隐藏的段落显示出来，历时600毫秒。

##### HTML 代码:

```
<p style="display: none">Hello</p>
```

##### jQuery 代码:

```
$("p").show("slow");
```

#### 描述:

用迅速的动画将隐藏的段落显示出来，历时200毫秒。并在之后执行反馈！

##### HTML 代码:

```
<p style="display: none">Hello</p>
```

##### jQuery 代码:

```
$("p").show("fast",function(){
   $(this).text("Animation Done!");
 });
```

#### 描述:

将隐藏的段落用将近4秒的时间显示出来。。。并在之后执行一个反馈。。。

##### HTML 代码:

```
<p style="display: none">Hello</p>
```

##### jQuery 代码:

```
$("p").show(4000,function(){
   $(this).text("Animation Done...");
 });
```





## hide([speed,[easing],[fn]])

### 概述

隐藏显示的元素

这个就是 'hide( speed, [callback] )' 的无动画版。如果选择的元素是隐藏的，这个方法将不会改变任何东西。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn:**在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

隐藏所有段落

##### jQuery 代码:

```
$("p").hide()
```

#### 描述:

用600毫秒的时间将段落缓慢的隐藏

##### jQuery 代码:

```
$("p").hide("slow");
```

#### 描述:

用200毫秒将段落迅速隐藏，之后弹出一个对话框。

##### jQuery 代码:

```
$("p").hide("fast",function(){
   alert("Animation Done.");
 });
```





## toggle([speed],[easing],[fn])

### 概述

用于绑定两个或多个事件处理器函数，以响应被选元素的轮流的 click 事件。

如果元素是可见的，切换为隐藏的；如果元素是隐藏的，切换为可见的。

1.9版本 .toggle(function, function, … ) 方法删除,jQuery Migrate（迁移）插件可以恢复此功能。

### 参数

~~ **fn,fn2,[fn3,fn4,...]**Function,....*V1.0   Removed 1.9*       fn:第一数次点击时要执行的函数。      fn2:第二数次点击时要执行的函数。      fn3,fn4,...:更多次点击时要执行的函数。~~

#### **[speed] [,fn]**String,Function*V1.0*

speed: 隐藏/显示 效果的速度。默认是 "0"毫秒。可能的值：slow，normal，fast。"

fn:在动画完成时执行的函数，每个元素执行一次。

#### **[speed], [easing ], [fn ]** String,String,Function*V1.4.3*

speed: 隐藏/显示 效果的速度。默认是 "0"毫秒。可能的值：slow，normal，fast。"

easing:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

fn:在动画完成时执行的函数，每个元素执行一次。

#### ***switch\*** Boolean*V1.3*

用于确定显示/隐藏的开关。如：true - 显示元素，false - 隐藏元素

### 示例



#### 无参数描述:

对表格切换显示/隐藏

##### jQuery 代码:

```
$('td).toggle();
```

#### fn,fn2描述:  Removed 1.9 

~~      对表格的切换一个类      jQuery 代码:      `$("td").toggle(  function () {    $(this).addClass("selected");  },  function () {    $(this).removeClass("selected");  } );`~~

#### speed 描述:

用600毫秒的时间将段落缓慢的切换显示状态

##### jQuery 代码:

```
$("p").toggle("slow");
```

#### speed,fn 描述:

用200毫秒将段落迅速切换显示状态，之后弹出一个对话框。

##### jQuery 代码:

```
$("p").toggle("fast",function(){
   alert("Animation Done.");
 });
```

#### switch参数描述:

如果这个参数为true ，那么匹配的元素将显示;如果false ，元素是隐藏的

##### jQuery 代码:

```
$('#foo').toggle(showOrHide);

//相当于
if (showOrHide) {
  $('#foo').show();
} else {
  $('#foo').hide();
}      
```





## slideDown([speed],[easing],[fn])

### 概述

通过高度变化（向下增大）来动态地显示所有匹配的元素，在显示完成后可选地触发一个回调函数。

这个动画效果只调整元素的高度，可以使匹配的元素以“滑动”的方式显示出来。在jQuery 1.3中，上下的padding和margin也会有动画，效果更流畅。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

以滑动方式显示隐藏的 <p> 元素：

##### jQuery 代码:

```
$(".btn2").click(function(){
  $("p").slideDown();
});
```

#### 描述:

用600毫秒缓慢的将段落滑下

##### jQuery 代码:

```
$("p").slideDown("slow");
```

#### 描述:

用200毫秒快速将段落滑下，之后弹出一个对话框

##### jQuery 代码:

```
$("p").slideDown("fast",function(){
   alert("Animation Done.");
 });
```



## slideUp([speed,[easing],[fn]])

### 概述

通过高度变化（向上减小）来动态地隐藏所有匹配的元素，在隐藏完成后可选地触发一个回调函数。

这个动画效果只调整元素的高度，可以使匹配的元素以“滑动”的方式隐藏起来。在jQuery 1.3中，上下的padding和margin也会有动画，效果更流畅。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

用600毫秒缓慢的将段落滑上

##### jQuery 代码:

```
$("p").slideUp("slow");
```

#### 描述:

用200毫秒快速将段落滑上，之后弹出一个对话框

##### jQuery 代码:

```
$("p").slideUp("fast",function(){
   alert("Animation Done.");
 });
```





## slideToggle([speed],[easing],[fn])

### 概述

通过高度变化来切换所有匹配元素的可见性，并在切换完成后可选地触发一个回调函数。

这个动画效果只调整元素的高度，可以使匹配的元素以“滑动”的方式隐藏或显示。在jQuery 1.3中，上下的padding和margin也会有动画，效果更流畅。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

用600毫秒缓慢的将段落滑上或滑下

##### jQuery 代码:

```
$("p").slideToggle("slow");
```

#### 描述:

用200毫秒快速将段落滑上或滑下，之后弹出一个对话框

##### jQuery 代码:

```
$("p").slideToggle("fast",function(){
   alert("Animation Done.");
 });
```





## fadeIn([speed],[easing],[fn])

### 概述

通过不透明度的变化来实现所有匹配元素的淡入效果，并在动画完成后可选地触发一个回调函数。

这个动画只调整元素的不透明度，也就是说所有匹配的元素的高度和宽度不会发生变化。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

用600毫秒缓慢的将段落淡入

##### jQuery 代码:

```
$("p").fadeIn("slow");
```

#### 描述:

用200毫秒快速将段落淡入，之后弹出一个对话框

##### jQuery 代码:

```
("p").fadeIn("fast",function(){
   alert("Animation Done.");
 });
```





## fadeOut([speed],[easing],[fn])

### 概述

通过不透明度的变化来实现所有匹配元素的淡出效果，并在动画完成后可选地触发一个回调函数。

这个动画只调整元素的不透明度，也就是说所有匹配的元素的高度和宽度不会发生变化。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

用600毫秒缓慢的将段落淡出

##### jQuery 代码:

```
$("p").fadeOut("slow");
```

#### 描述:

用200毫秒快速将段落淡出，之后弹出一个对话框

##### jQuery 代码:

```
$("p").fadeOut("fast",function(){
   alert("Animation Done.");
 });
```





## fadeTo([[speed],opacity,[easing],[fn]])

### 概述

把所有匹配元素的不透明度以渐进方式调整到指定的不透明度，并在动画完成后可选地触发一个回调函数。

这个动画只调整元素的不透明度，也就是说所有匹配的元素的高度和宽度不会发生变化。

### 参数

#### **speed,opacity,[fn]**Number/String,Number,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**opacity**:一个0至1之间表示透明度的数字。

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],opacity,[easing],[fn]**Number/String,String,Function*V1.4.3*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**opacity**:一个0至1之间表示透明度的数字。

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

使用淡入效果来显示一个隐藏的 <p> 元素：

##### jQuery 代码:

```
$(".btn2").click(function(){
  $("p").fadeIn();
});
```

#### 描述:

用600毫秒缓慢的将段落的透明度调整到0.66，大约2/3的可见度

##### jQuery 代码:

```
$("p").fadeTo("slow", 0.66);
```

#### 描述:

用200毫秒快速将段落的透明度调整到0.25，大约1/4的可见度，之后弹出一个对话框

##### jQuery 代码:

```
$("p").fadeTo("fast", 0.25, function(){
   alert("Animation Done.");
 });
```



## fadeToggle([speed,[easing],[fn]])

### 概述

通过不透明度的变化来开关所有匹配元素的淡入和淡出效果，并在动画完成后可选地触发一个回调函数。

这个动画只调整元素的不透明度，也就是说所有匹配的元素的高度和宽度不会发生变化。

### 参数

#### **speed[,fn]**Number/String,Function*V1.0*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **[speed],[easing],[fn]**Number/String,String,Function*V1.4.4*

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:(Optional) 用来指定切换效果，默认是"swing"，可用参数"linear"

**fn**:在动画完成时执行的函数，每个元素执行一次。

### 示例



#### 描述:

用600毫秒缓慢的将段落淡入

##### jQuery 代码:

```
$("p").fadeToggle("slow","linear");
```

#### 描述:

用200毫秒快速将段落淡入，之后弹出一个对话框

##### jQuery 代码:

```
$("p").fadeToggle("fast",function(){
   alert("Animation Done.");
 });
```





## animate(params,[speed],[easing],[fn])

### 概述

用于创建自定义动画的函数。

这个函数的关键在于指定动画形式及结果样式属性对象。这个对象中每个属性都表示一个可以变化的样式属性（如“height”、“top”或“opacity”）。注意：所有指定的属性必须用骆驼形式，比如用marginLeft代替margin-left. 

而每个属性的值表示这个样式属性到多少时动画结束。如果是一个数值，样式属性就会从当前的值渐变到指定的值。如果使用的是“hide”、“show”或“toggle”这样的字符串值，则会为该属性调用默认的动画形式。

在 jQuery 1.2 中，你可以使用 em 和 % 单位。另外，在 jQuery 1.2 中，你可以通过在属性值前面指定 "<em>+=</em>" 或 "<em>-=</em>" 来让元素做相对运动。

jQuery 1.3中，如果duration设为0则直接完成动画。而在以前版本中则会执行默认动画。

jQuery 1.8中，当你使用CSS属性在[css()](https://www.lovean.com/doc/jquery1.12/css.html)或[animate()](https://www.lovean.com/doc/jquery1.12/animate.html)中，我们将根据浏览器自动加上前缀(在适当的时候)，比如("user-select", "none"); 在Chrome/Safari浏览器中我们将设置为"-webkit-user-select",  Firefox会使用"-moz-user-select", IE10将使用"-ms-user-select".

### 参数

#### **params,[speed],[easing],[fn]**Options,Number/String,String,Function*V1.0*

**params**:一组包含作为动画属性和终值的样式属性和及其值的集合

**speed**:三种预定速度之一的字符串("slow","normal", or "fast")或表示动画时长的毫秒数值(如：1000)

**easing**:要使用的擦除效果的名称(需要插件支持).默认jQuery提供"linear" 和 "swing".

**fn**:在动画完成时执行的函数，每个元素执行一次。

#### **params,options**String,String*V1.0*

**params**::一组包含作为动画属性和终值的样式属性和及其值的集合

**options**:动画的额外选项。如：speed - 设置动画的速度,easing -  规定要使用的 easing 函数,callback - 规定动画完成之后要执行的函数,step -  规定动画的每一步完成之后要执行的函数,queue - 布尔值。指示是否在效果队列中放置动画。如果为  false，则动画将立即开始,specialEasing - 来自 *styles* 参数的一个或多个 CSS 属性的映射，以及它们的对应 easing 函数

### 示例



#### 描述:

点击按钮后div元素的几个不同属性一同变化

##### HTML 代码:

```
<button id="go"> Run</button>
<div id="block">Hello!</div>
```

##### jQuery 代码:

```
// 在一个动画中同时应用三种类型的效果
$("#go").click(function(){
  $("#block").animate({ 
    width: "90%",
    height: "100%", 
    fontSize: "10em", 
    borderWidth: 10
  }, 1000 );
});
```

#### 描述:

让指定元素左右移动

##### HTML 代码:

```
<button id="left">«</button> <button id="right">»</button>
<div class="block"></div>
```

##### jQuery 代码:

```
$("#right").click(function(){
  $(".block").animate({left: '+50px'}, "slow");
});

$("#left").click(function(){
  $(".block").animate({left: '-50px'}, "slow");
});
```

#### 描述:

在600毫秒内切换段落的高度和透明度

##### jQuery 代码:

```
$("p").animate({
   height: 'toggle', opacity: 'toggle'
 }, "slow");
```

#### 描述:

用500毫秒将段落移到left为50的地方并且完全清晰显示出来（透明度为1）

##### jQuery 代码:

```
$("p").animate({
   left: 50, opacity: 'show'
 }, 500);
```

#### 描述:

一个使用“easein”函数提供不同动画样式的例子。只有使用了插件来提供这个“easein”函数，这个参数才起作用。

##### jQuery 代码:

```
$("p").animate({
   opacity: 'show'
 }, "slow", "easein");
```





## stop([clearQueue],[jumpToEnd])

### 概述

停止所有在指定元素上正在运行的动画。

如果队列中有等待执行的动画(并且clearQueue没有设为true)，他们将被马上执行

### 参数

#### **[clearQueue],[gotoEnd]** Boolean,Boolean*V1.2*

**clearQueue**:如果设置成true，则清空队列。可以立即结束动画。

**gotoEnd**:让当前正在执行的动画立即完成，并且重设show和hide的原始样式，调用回调函数等。

#### **[queue],[clearQueue],[jumpToEnd]**Boolean*V1.7*

**queue**:用来停止动画的队列名称

**clearQueue**:如果设置成true，则清空队列。可以立即结束动画。

**jumpToEnd**:如果设置成true，则完成队列。可以立即完成动画。

### 示例



#### 描述:

停止当前正在运行的动画：

##### HTML 代码:

```
$("#stop").click(function(){
  $("#box").stop();
});
```

#### 描述:

点击Go之后开始动画,点Stop之后会在当前位置停下来

##### HTML 代码:

```
<button id="go">Go</button> <button id="stop">STOP!</button>
<div class="block"></div><button id="go">Go</button> <button id="stop">STOP!</button>
<div class="block"></div>
```

##### jQuery 代码:

```
// 开始动画
$("#go").click(function(){
  $(".block").animate({left: '+200px'}, 5000);
});

// 当点击按钮后停止动画
$("#stop").click(function(){
  $(".block").stop();
});
```



## delay(duration,*[queueName]*)

### 概述

设置一个延时来推迟执行队列中之后的项目。

jQuery 1.4新增。用于将队列中的函数延时执行。他既可以推迟动画队列的执行，也可以用于自定义队列。

### 参数

#### **duration,[queueName]**Integer,String*V1.4*

**duration**:延时时间，单位：毫秒

**queueName**:队列名词，默认是Fx，动画队列。

### 示例



#### 描述:

在.slideUp() 和 .fadeIn()之间延时800毫秒。

##### HTML 代码:

```
<div id="foo /">
```

##### jQuery 代码:

```
$('#foo').slideUp(300).delay(800).fadeIn(400);
```