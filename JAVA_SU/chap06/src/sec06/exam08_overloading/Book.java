package sec06.exam08_overloading;

public class Book {
	String Company = "ÇÑºû¹Ìµð¾î";
	int number;
	String color;
	String author;
	
	Book() {
		
	}
	
	Book(int number) {
		this.number = number;
	}
	
	Book(int number, String color) {
		this.number = number;
		this.color = color;
	}
	
	Book
	(int number, String color, String author) {
		this.number = number;
		this.color = color;
		this.author = author;
	}
}
