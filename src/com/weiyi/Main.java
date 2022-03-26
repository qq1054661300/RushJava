package com.weiyi;

import javax.xml.crypto.Data;

public class Main {
    static int j = 4;
    static class DataOnly{
        int i;//自动包装功能Character ch = new Character（）；自动转换为 char ch；Java SE5
        double d;
        boolean b;
        DataOnly(){
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        }

        void toSring(){
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        }

        void SetDataOnly(int i,double d,boolean b){
            this.i=i;
            this.d=d;
            this.b=b;
        }

        int storage(String s){
            return s.length()*2;
        }

        static void increment(){
            Main.j++;
        };
    }

    static int a;
    static char b;
    public static void main(String[] args) {
        String s="age";
        System.out.println(a);
        System.out.println(b);
        System.out.println("Hello,world");

        DataOnly dataonly = new DataOnly();

        dataonly.SetDataOnly(1,2,true);

        dataonly.toSring();

        System.out.println(dataonly.storage(s));

        dataonly.increment();

        System.out.println(j);
    }
}
