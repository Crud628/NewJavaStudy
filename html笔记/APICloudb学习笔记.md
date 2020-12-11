# APICloudb学习笔记



## 平台介绍



APICloud扩展API调用方式，使用标准的JavaScript语法，与标准的JavaScript对象调用方式一致。

核心模块在windows.api对象详细下，不需要单独引用，可以接直接调用

```java
api.methodName(param,callback);
```



扩展模块需要require引入，遵守CommJS规范

```java
var module = api.require('moduleName');
module.methodName(param,callback);
```

 



```java
param:{}//参数，是一个JSON对象
```



```java
callback:function(ret,err){}//回调函数，是一个Function对象，方法的结果是通过此函数返回
```





