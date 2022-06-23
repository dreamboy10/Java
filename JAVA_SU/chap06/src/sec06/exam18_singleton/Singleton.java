package sec06.exam18_singleton;

public class Singleton {
	private static Singleton singleton = 
	new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
