package com.itheima.a01threadcase2;

public class MyRun implements Runnable {

    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            //Thread t = Thread.currentThread();
            System.out.println(Thread.currentThread().getName() + "HelloWorld");
        }
    }
}
