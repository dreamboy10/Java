package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			System.out.println(var1);
			System.out.println(var2);
		}
		
		var1 = 10;
//		var2 = 20;
		
		System.out.println(var1);
		
		for(int i = 0; i < 1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
			
			System.out.println(var1);
			System.out.println(var3);
		}
		
		var1 = 10;
//		var3 = 30;

	}

}
