package sec06.exam08_overloading;

public class BookExample {

	public static void main(String[] args) {
		Book Book1 = new Book();
		System.out.println
		("Book1.Company : " + 
		Book1.Company);
		System.out.println();
		
		Book Book2 = new Book(001);
		System.out.println
		("Book2.Company : " + 
		Book2.Company);
		System.out.println
		("Book2.number : " + 
		Book2.number);
		System.out.println();
		
		Book Book3 = 
		new Book(001, "ÆÄ¶û");
		System.out.println
		("Book3.Company : " + 
		Book3.Company);
		System.out.println
		("Book3.number : " + 
		Book3.number);
		System.out.println
		("Book3.color : " + 
		Book3.color);
		System.out.println();
		
		Book Book4 = 
		new Book(001, "³ì»ö", "¼­Çö¿ì");
		System.out.println
		("Book4.Company : " + 
		Book4.Company);
		System.out.println
		("Book4.number : " + 
		Book4.number);
		System.out.println
		("Book4.color : " + 
		Book4.color);
		System.out.println
		("Book4.author : " + 
		Book4.author);
		System.out.println();
		
		

	}

}
