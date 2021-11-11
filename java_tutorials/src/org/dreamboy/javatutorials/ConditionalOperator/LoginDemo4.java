package org.dreamboy.javatutorials.ConditionalOperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if ((id.equals("dreamboy") || 
        		id.equals("obama") || 
        		id.equals("kudo"))
                && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}
