# java笔记Day3



## 一.简单算法入门

### 1.冒泡排序

```java
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}
}
```

结果

```java
[1, 8, 5, 7, 6]
[1, 8, 5, 7, 6]
[1, 5, 8, 7, 6]
[1, 5, 6, 8, 7]
[1, 5, 6, 7, 8]
最后结果为
[1, 5, 6, 7, 8]
```





### 2.选择排序

```java
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		int flag = arr[0];
		for (int i = 0; i < arr.length - 1; i++) { 
			// 最小值在哪个位置上
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) { 
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}
}
```

结果

```java
[7, 6, 5, 3, 4]
[3, 6, 5, 7, 4]
[3, 4, 5, 7, 6]
[3, 4, 5, 7, 6]
[3, 4, 5, 6, 7]
最后结果为
[3, 4, 5, 6, 7]
```



### 3.插入排序

```java
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}
}
```

结果

```java
[2, 5, 9, 4, 6]
[2, 5, 9, 4, 6]
[2, 5, 9, 4, 6]
[2, 4, 5, 9, 6]
[2, 4, 5, 6, 9]
最后结果为
[2, 4, 5, 6, 9]
```



### 4.二分查找



