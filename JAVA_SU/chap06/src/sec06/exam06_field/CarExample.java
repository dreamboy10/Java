package sec06.exam06_field;

public class CarExample {

	public static void main(String[] args) {
		// object create
		Car myCar = new Car();
		
		// field read
		System.out.println
		("����ȸ�� : " + myCar.company);
		System.out.println
		("�𵨸� : " + myCar.model);
		System.out.println
		("���� : " + myCar.color);
		System.out.println
		("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println
		("����ӵ� : " + myCar.speed);
		
		// field modify
		myCar.speed = 60;
		System.out.println
		("������ �ӵ� : " + myCar.speed);
		

	}

}
