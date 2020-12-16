# BigDecimal



![image-20201215193743615](BigDecimal.assets\image-20201215193743615.png)



## 一   创建对象及使用



```java
BigDecimal b = new BigDecimal();
```



**！！必须赋初值**

![image-20201215193932252](BigDecimal.assets\image-20201215193932252.png)

**输出测试**：

![image-20201215194623503](E:\Users\asus\Desktop\BigDecimal.assets\image-20201215194623503.png)

## 二  常用方法



加`add（）`      减 `subtract`    乘`multiply()`       除`divide()`

| Operation | parameter                                                    |
| --------- | ------------------------------------------------------------ |
| Add       | ![image-20201215195535436](BigDecimal.assets\image-20201215195535436.png) |
| Subtract  | ![image-20201215195618836](BigDecimal.assets\image-20201215195618836.png) |
| Multiply  | ![image-20201215195644367](BigDecimal.assets\image-20201215195644367.png) |
| Divide    | ![image-20201215195713900](BigDecimal.assets\image-20201215195713900.png) |



>  在加、减、乘、除中有一个参数的方法都是直接与另一个BigDecimal对象进行计算
>
> 另外两个参数MathContext    RoundingMode 则是另一种计算规则、模式



## 三  额外的参数

### RoundingMode

>  舍入行为/ 近似模式      （枚举类型）



**下面是官方案例说明**

![image-20201215201426796](BigDecimal.assets\image-20201215201426796.png)



#### 详细参数解释

##### UP与DOWN

| **UP**   | 远离零方向舍入 |
| -------- | -------------- |
| **DOWN** | 向零方向舍入   |

![image-20201215201807351](BigDecimal.assets\image-20201215201807351.png)

##### CEILING与FLOOR

| **CEILING** | 向正无限大方向舍入 |
| ----------- | ------------------ |
| **FLOOR**   | 向负无限大方向舍入 |

![image-20201215201836628](BigDecimal.assets\image-20201215201836628.png)

##### 其他

| **HALF_UP**   | 向最接近数字方向舍入 如果与两个相邻数字的距离相等，则向上舍入 |
| ------------- | ------------------------------------------------------------ |
| **HALF_DOWN** | 向最接近数字方向舍入 如果与两个相邻数字的距离相等，则向下舍入 |
| **HALF_EVEN** | 向最接近数字方向舍入如果与两个相邻数字的距离相等，则向相邻的偶数舍入 |
| **UNNECESSARY** | 用于断言的舍入模式 请求的操作具有精确的结果，不需要进行舍入 |

**HALF_UP/ HALF_DOWN / HALF_DOWN 都是最接近数字舍入**

**不过如果两个相邻的数字距离相等，将会采取不同的模式**

**HALF_UP就是平时的四舍五入**

> **拥有静态的valueOf方法，对BigDecimal中的常量，进行映射转换**
>
> **返回RoundingMode对象**

```java
 /**
     * Returns the {@code RoundingMode} object corresponding to a
     * legacy integer rounding mode constant in {@link BigDecimal}.
     *
     * @param  rm legacy integer rounding mode to convert
     * @return {@code RoundingMode} corresponding to the given integer.
     * @throws IllegalArgumentException integer is out of range
     */
    public static RoundingMode valueOf(int rm) {
        switch(rm) {

        case BigDecimal.ROUND_UP:
            return UP;

        case BigDecimal.ROUND_DOWN:
            return DOWN;

        case BigDecimal.ROUND_CEILING:
            return CEILING;

        case BigDecimal.ROUND_FLOOR:
            return FLOOR;

        case BigDecimal.ROUND_HALF_UP:
            return HALF_UP;

        case BigDecimal.ROUND_HALF_DOWN:
            return HALF_DOWN;

        case BigDecimal.ROUND_HALF_EVEN:
            return HALF_EVEN;

        case BigDecimal.ROUND_UNNECESSARY:
            return UNNECESSARY;

        default:
            throw new IllegalArgumentException("argument out of range");
        }
```

### **MathContext**  


> **MathContext**     数学上下文         计算上下文/数学规则



**RoundingMode 是舍入模式的抽象描述，仅仅描述了舍入的规则**

但是运算中还有一些其他的规则，比如

保留几位有效数字?

**MathContext则是针对于计算的更进一步抽象**

**是封装上下文设置的不可变对象，它描述数字运算符的某些规则**



#### 三个构造方法(略过)

```java
    public MathContext(int setPrecision) {
        this(setPrecision, DEFAULT_ROUNDINGMODE);
        return;
    }
```



```java
 public MathContext(int setPrecision,
                       RoundingMode setRoundingMode) {
        if (setPrecision < MIN_DIGITS)
            throw new IllegalArgumentException("Digits < 0");
        if (setRoundingMode == null)
            throw new NullPointerException("null RoundingMode");

        precision = setPrecision;
        roundingMode = setRoundingMode;
        return;
    }
```



```java
public MathContext(String val) {
        boolean bad = false;
        int setPrecision;
        if (val == null)
            throw new NullPointerException("null String");
        try { // any error here is a string format problem
            if (!val.startsWith("precision=")) throw new RuntimeException();
            int fence = val.indexOf(' ');    // could be -1
            int off = 10;                     // where value starts
            setPrecision = Integer.parseInt(val.substring(10, fence));

            if (!val.startsWith("roundingMode=", fence+1))
                throw new RuntimeException();
            off = fence + 1 + 13;
            String str = val.substring(off, val.length());
            roundingMode = RoundingMode.valueOf(str);
        } catch (RuntimeException re) {
            throw new IllegalArgumentException("bad string format");
        }

        if (setPrecision < MIN_DIGITS)
            throw new IllegalArgumentException("Digits < 0");
        // the other parameters cannot be invalid if we got here
        precision = setPrecision;
    }
```



## 四  应用

### 加 

```java
public static String add(String v1, String v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
    	//MathContext mc = new MathContext(scale);
        //return b1.add(b2,mc).toString();   效果是小数点前后整体有效数字为scale
   		//MathContext mc = new MathContext(scale, rm);  不如setScale方便
    	//BigDecimal.ROUND_HALF_UP=4  表示四舍五入  其他的可以参考RoundingMode参数
        return b1.add(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
    }
```



```java
BigDecimal.setScale(保留几位：int，取舍模式：int);
```





### 减 

```java
public static String sub(String v1, String v2, int scale) {
    if (scale < 0) {
        throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
    }
    BigDecimal b1 = new BigDecimal(v1);
    BigDecimal b2 = new BigDecimal(v2);
    return b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
}
```


### 乘

```java
b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)
```



	### 除

```java
b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)
```



## 五  扩展

> 余数    remainder

