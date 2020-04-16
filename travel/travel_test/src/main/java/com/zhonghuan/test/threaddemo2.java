package com.zhonghuan.test;

public class threaddemo2 {
    public static void main(String[] args) {
        demo demo=new demo();
        demo.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("2");
        }
    }
}
