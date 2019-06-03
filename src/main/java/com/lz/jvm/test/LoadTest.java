package com.lz.jvm.test;

/**
 * @Auther: zhuhuakun
 * @Date: 2019/6/3 14:43
 * @Description:
 */
public class LoadTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = LoadTest.class.getClassLoader();
        System.out.println(loader);
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("com.lz.jvm.test.Test2");
        //使用Class.forName()来加载类，默认会执行初始化块
        Class.forName("com.lz.jvm.test.Test2");
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
//        Class.forName("com.lz.jvm.test.Test2", false, loader);
    }
}
