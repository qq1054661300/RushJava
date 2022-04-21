package com.weiyi.obj;

/**dog
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
import com.weiyi.type.Print;

import static com.weiyi.type.Print.print;

class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;

    void setAnIntegerRepresentingColors(int setint){
        this.anIntegerRepresentingColors = setint;
    }
    void changeTheHueOfTheColor(){
        switch (anIntegerRepresentingColors){
            case 1 : System.out.println("red");
                break;
            case 2 : System.out.println("orange");
                break;
            case 3 : System.out.println("yellow");
                break;
            case 4 : System.out.println("green");
                break;
            case 5 : System.out.println("blue");
                break;
            case 6 : System.out.println("indigo");
                break;
            case 7 : System.out.println("purple");
                break;
        }
    }
}

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
        int h=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Hello,world");

        DataOnly dataonly = new DataOnly();

        dataonly.SetDataOnly(1,2,true);

        dataonly.toSring();

        System.out.println(dataonly.storage(s));

        dataonly.increment();

        System.out.println(j);

        System.out.println(args[0] + args[1] + args[2]);

        AllTheColorsOfTheRainbow all = new AllTheColorsOfTheRainbow();

        all.setAnIntegerRepresentingColors(h);

        all.changeTheHueOfTheColor();

        if (true){
            print("1");
        }else {
            print("2");
        }

    }
}
