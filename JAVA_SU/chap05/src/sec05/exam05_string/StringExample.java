package sec05.exam05_string;

public class StringExample {

	public static void main(String[] args) {
		String name;
		name = "드림보이";
		String hobby = "자바";
		
		System.out.println(name);
		System.out.println(hobby);
		
		String name1 = "드림보이";
		String name2 = "드림보이";
		
		System.out.println(name1);
		System.out.println(name2);
		
		String name3 = 
		new String("드림보이");
		String name4 =
		new String("드림보이");
		
		System.out.println(name3);
		System.out.println(name4);
		
		String name5 = "드림보이";
		String name6 = "드림보이";
		String name7 = 
		new String("드림보이");
		
		System.out.println(name5 == name6);
		System.out.println(name5 == name7);
		
		System.out.println
		(name5.equals(name7));
		
		

	}

}
