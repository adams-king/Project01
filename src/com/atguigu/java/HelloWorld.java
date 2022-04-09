package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是一个单行注释
public class HelloWorld {



    private static final int INITIAL_SIZE = 10;
    private static int num;

    public static void main(String[] args) {
        //region Description
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        ArrayList list = new ArrayList();
        //endregion

        Date date = new Date();

        list.add(0,23);

        System.out.println(list);

//        method();

    }

    public static void method(){
        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
