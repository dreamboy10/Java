package sec06.exam01_oop;

public class OopExample {

	public static void main(String[] args) {
		Car a1 = new Car();
		System.out.println(a1);
		System.out.println
		("a1 ������ Car ��ü�� �����մϴ�.");
		
		Car a2 = new Car();
		System.out.println(a2);
		System.out.println
		("a2 ������ �� �ٸ� "
		+ "Car ��ü�� �����մϴ�.");
		
		System.out.println();
		
		Book b1 = new Book();
		System.out.println(b1);
		System.out.println
		("b1 ������ Book ��ü�� �����մϴ�.");
		
		Book b2 = new Book();
		System.out.println(b2);
		System.out.println
		("b2 ������ �� �ٸ� "
		+ "Book ��ü�� �����մϴ�.");
		
		System.out.println();
		
		int result = Calculator.add(10, 20);
		System.out.println(result);
		

	}

}
