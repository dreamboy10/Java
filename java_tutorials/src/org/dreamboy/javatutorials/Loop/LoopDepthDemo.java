package org.dreamboy.javatutorials.Loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
            }
        }
	}

}