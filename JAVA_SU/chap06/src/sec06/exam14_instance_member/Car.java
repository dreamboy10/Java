package sec06.exam14_instance_member;

public class Car {
	// field
	String model;
	int speed;
	
	// constructor
	Car(String model) {
		this.model = model;
	}
	
	// method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println
			(this.model + "�� �޸��ϴ�."
					+ "(�ü� : " + 
					this.speed + "km/h)");
		}
	}
}
