package sec06.exam01_oop;

public class OopExample {

	public static void main(String[] args) {
		Car a1 = new Car();
		System.out.println(a1);
		System.out.println
		("a1 변수가 Car 객체를 참조합니다.");
		
		Car a2 = new Car();
		System.out.println(a2);
		System.out.println
		("a2 변수가 또 다른 "
		+ "Car 객체를 참조합니다.");
		
		System.out.println();
		
		Book b1 = new Book();
		System.out.println(b1);
		System.out.println
		("b1 변수가 Book 객체를 참조합니다.");
		
		Book b2 = new Book();
		System.out.println(b2);
		System.out.println
		("b2 변수가 또 다른 "
		+ "Book 객체를 참조합니다.");
		
		System.out.println();
		
		int result = Calculator.add(10, 20);
		System.out.println(result);
		

	}

}
