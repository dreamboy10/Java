package org.dreamboy.javatutorials.Method;

public class ReturnDemo4 {
	public static String[] getMembers() {
        String[] members = { "������", "������", "���湮" };
        return members;
    }

	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members);
	}

}
