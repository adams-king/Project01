package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author adam.king
 * @create 2022-04-09 10:25
 *
 * IDEA中代码模板所处的位置：settings - Editor - live Templates / Postfix Completion
 * 常用的模板
 * 重点关注 live Templates:  iterations、other、output、plain
 * 重点关注Postfix completion：java
 *
 */
public class TemplatesTest {

    //模板六：prsf：可生成private static final 单例模式下可以使用此定义
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;

    //变形：psfs
public static final String  STRING1 = "Hello";



//模板一：psvm
public static void main(String[] args) {
    //模板二：
    System.out.println("Hello!");
    //变形：soutp / soutm / soutv / xxx.sout
    System.out.println("args = " + Arrays.deepToString(args));//soutp
    System.out.println("TemplatesTest.main");//soutm
    int num1 = 10;
    System.out.println("num1 = " + num1);//soutv
    int num2 = 20;
    System.out.println("num2 = " + num2);//soutv
    System.out.println(num1);//num1.sout

    //模板三：fori
    String[] arr = new String[]{"Tom", "Jerry", "John", "LiLei"};
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

    //变形：iter
    for (String s : arr) {
        System.out.println("s = " + s);
    }
    
    //变形：itar
    for (int i = 0; i < arr.length; i++) {
        String s = arr[i];
        System.out.println("s = " + s);
    }

    //模板四：list.for
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(123);
    list.add(123);

    for (Object o : list) {
        System.out.println(o);
    }

    //变形：list.fori
    for (int i = 0; i < list.size(); i++) {
        //list[i]
    }

    //变形：list.forr
    for (int i = list.size() - 1; i >= 0; i--) {

    }




}
public void method(){
    System.out.println("TemplatesTest.method");

    ArrayList list = new ArrayList();
    list.add(123);
    list.add(456);
    list.add(789);

    //Postfix Completion
    //模板五：ifn
    if (list == null) {

    }
    //变形：inn
    if (list != null) {

    }

    //live Templates
    //变形：xxx.null
    if (list == null) {

    }

    //变形：xxx.nn
    if (list != null) {

    }
}
}
