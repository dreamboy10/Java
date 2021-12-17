package org.dreamboy.javatutorials.Polymorphism;

interface I{}
class C implements I{}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		I obj = new C();
		System.out.println(obj);
	}

}
