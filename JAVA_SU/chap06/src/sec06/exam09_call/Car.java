package sec06.exam09_call;

public class Car {
	// field
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
		
	// constructor
	Car() {
			
	}
		
	Car(String model) {
		this(model, "����", 250);
	}
		
	Car(String model, String color) {
		this(model, color, 250);
	}
		
	Car
	(String model, String color, 
	int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
