package org.dreamboy.javatutorials.Collection;

import java.util.HashSet;

public class ListSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(1);
		B.add(2);
		B.add(3);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));
		System.out.println(A.containsAll(C));
	}

}
