package com.weiyi.lifecycle;

import static com.weiyi.type.Print.*;
import static java.time.chrono.JapaneseEra.values;

enum E {
	yi, wu, shi, wuShi, yiBai
}

public class Enum {
	public static void main(String[] args) {
		E e = E.wu;
		for (E a : E.values()){
			System.out.println(a + " or " + a.ordinal());
		}
		switch (e) {
			case yi : print("一元");
			break;
			case wu : print("五元");
			break;
			case shi : print("十元");
			break;
			case wuShi : print("五十元");
			break;
			case yiBai : print("一百元");
		}
	}
}
