package com.weiyi.lifecycle;

import static com.weiyi.type.Print.print;

class Cup {
	Cup(int marker){
		print("Cup(" + marker + ")");
	}
	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		print("Cups()");
	}
}

class C {
	static String a = "daDaDa";
	static String b;
	static {
		b = "xiaXiaXia";
	}

	static void D() {
		print(a);
		print(b);
	}
}

class F {
	F() {
		String a = "dad";
		print(a);
	}
}



public class CupsTest {
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.f(99);
		c.D();
		F f = new F();
	}
	static Cups cups1 = new Cups();
//	static Cups cups2 = new Cups();
	static C c = new C();

}
