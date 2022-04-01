package com.weiyi.type;
import static com.weiyi.type.Print.*;

class Tink{
    float level;
}

class Letter{
    float a;
}


public class type {

    static void f(Letter y){
        y.a = 1;
    }

    static class Dog{
        String name,says;

        void setdog(String name,String says){
            this.name = name;
            this.says = says;
        }

    }
    public static void main(String[] args){
        Tink t1 = new Tink();
        Tink t2 = new Tink();
        t1.level = 1;
        t2.level = 2;
        String x = "Hello,world";
        System.out.println("Hello,world");
        print("Hello,world");
        print("t1 = " + t1.level );
        print("t2 = " + t2.level );
        t1 = t2;
        print("t1 = " + t1.level );
        print("t2 = " + t2.level );
        t1.level = 3;
        print("t1 = " + t1.level );
        print("t2 = " + t2.level );

        Letter b = new Letter();
        b.a = 2;
        print("1:b.a: " + b.a);
        f(b);
        print("2:b.a: " + b.a);

        int c=100, e=10;
        print("v="+c/e + "m/s");

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.setdog("spot","Ruff");
        d2.setdog("scruffy","Wurf");
        print("name: " + d1.name + " says: " + d1.says);
        print("name: " + d2.name + " says: " + d2.says);

        if(d1 == d2){
            print("true");
        } else {
            print("false");
        }
        System.out.println(d1.equals(d2));

        long f1 = 0xFF14,f2 = 075;
        System.out.println(Long.toBinaryString(f1));
        System.out.println(Long.toBinaryString(f2));
        f1 += 16;
        f2 += 4;
        System.out.println(Long.toBinaryString(f1));
        System.out.println(Long.toBinaryString(f2));

        String h = "123",j = "1".concat("23");
        System.out.println(h == j);
        System.out.println(h.equals(j));
    }
}
