package com.weiyi.controller;
import com.weiyi.obj.Main;

import java.util.Random;

import static com.weiyi.type.Print.print;

public class controller {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            print(i);
        }

        Random r = new Random(System.currentTimeMillis());
        int[] j = new int[25];
        for (int i = 0; i < j.length; i++) {
            j[i] = r.nextInt(100);
            if (i > 0 && i < 25) {
                if (j[i - 1] > j[i]) {
                    print("新值大于旧值");
                } else if (j[i - 1] == j[i]) {
                    print("新值等于旧值");
                } else {
                    print("新值小于旧值");
                }
            }
        }

        int a = 1;
        int[] f = new int[100000000];
        while (a<2){
            print(r.nextInt(100));
            break;
        }

        boolean b;
        for (int i = 2 ; i < 100 ; i++){
            b = false;
            for (int g = 2 ; g < i ; g++){
                if (i%g == 0 ){
                    b = true;
                }
            }
            if (b == false){
                print(i);
            }
        }

        for (int i = 0 ; i < 10 ; i++){
            switch (i){
                case 1: print("one");
                break;
                case 2: print("tow");
                break;
                case 3: print(3);
                break;
            }
        }

        int c=1,d=1,e=2;
        print(c);
        print(d);
        for(int i = 0 ; i < 100 ; i++){
            print(e);
            c = d ;
            d = e ;
            e = c+d;
        }
    }
}
