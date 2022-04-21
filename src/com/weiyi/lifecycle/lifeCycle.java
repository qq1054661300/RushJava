package com.weiyi.lifecycle;

import static com.weiyi.type.Print.print;

class New{
	New(){
		String a = new String();
		print("a" + a +"a");
	}

	New(int i){
		print("new New" + i);
	}
}

class Dog{
	void Dog(){
		print("This is a Dog");
	}

	void Dog(int i, String s){
		print("barking");
	}

	void Dog(String i, int s){
		print("howling");
	}
}

class Cat{
}

class Eat{
	public void eat(Apple apple){
		print("mua");
	}
}

class Give{
	static Apple peel(Apple apple){
		return apple;
	}
}

class Apple{
	Apple(){
		print("This is a Apple");
	}

	Apple getPeeled(){
		return Give.peel(this);
	}
}

class fina{
	protected void finalize(){
		print("ssss");
	}
}

public class lifeCycle {
	public static void main(String[] args){
		new New();
		new New(1);
		Dog dog = new Dog();
		dog.Dog();
		dog.Dog(1,"s");
		dog.Dog("s",1);
		Cat cat = new Cat();
		new Eat().eat(new Apple());
		new fina();
	}
}
// 定义时初始化的string域和构造器初始化的string域的区别在于，定义时初始化的string域在整个生命周期结束时清除
// 构造器定义的string域在构造器调用结束后清除,构造器中的东西没法在构造器之外使用