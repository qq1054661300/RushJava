package com.weiyi.lifecycle;

import java.lang.reflect.Type;

import static com.weiyi.type.Print.*;

class S {
	void S(String s) {
		print(s);
	}

	void S(String[] s) {
		for (String v : s) {
			print(v);
		}
	}

}

public class Array {
	public static void main(String[] args) {
		String[] a = {"a", "b", "c"};
		S s = new S();
		for (String v : a) {
			print(v);
			s.S(v);
		}
		s.S(a);
		s.S("c" + "b" + "a");
	}
}
