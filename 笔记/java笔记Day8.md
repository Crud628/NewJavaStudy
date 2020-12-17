## java笔记Day8

### hashCode  equals  

​       判断 内存地址 是否相等  先判断hashCode  再判断equals

​      规约：  equals===> true   hashCode一定要为true



### 包装类/封装类

| 基本类  | 封装类    |
| ------- | --------- |
| byte    | Byte      |
| short   | Short     |
| int     | Integer   |
| long    | Long      |
| float   | Float     |
| double  | Double    |
| char    | Character |
| boolean | Boolean   |



#### **拆箱**

```java
Integer int_02 = new Integer(23);
int int_03 = int_02.intValue();//手动拆箱
int int_04 = int_02;//自动拆箱
```

#### **装箱**

```java
int int_05 = 20;
Integer int_06 = Integer.valueOf(int_05);//自动装箱
Integer int_07 = int_05;//自动装箱
```




#### 包装类常用方法

parseInt  转数字

//          String str="abc";

//          System.out.println(Integer.parseInt(str)+1);          

//         NumberFormatException 数字格式异常    其他数据类型 ===》 数字

​          

//          Integer.parseInt(s, radix)  指定几进制数字 ===》十进制

​          System.out.println(Integer.parseInt("1001010011", 10));

//          Integer.MAX_VALUE

//          Integer.MIN_VALUE

//          Integer.SIZE  位数  所占内存空间大小  

//          Integer.compare(x, y)   x>y 1 == 0   x<y  -1

//          Integer.max(a, b)   

//          Integer.min(a, b)

//          Integer.sum(a, b)

//          Integer.toString(i)

//          Integer.toBinaryString(i)

//          Integer.toHexString(i)

