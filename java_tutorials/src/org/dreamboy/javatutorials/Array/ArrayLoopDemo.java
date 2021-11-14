package org.dreamboy.javatutorials.Array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = 
		{ "이한정", "서정원", "곽경문" };
		for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println
            (member + "이 상담을 받았습니다");
        }
	}

}
