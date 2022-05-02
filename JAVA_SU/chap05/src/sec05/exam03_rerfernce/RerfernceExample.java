package sec05.exam03_rerfernce;

public class RerfernceExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 100;
		int v3 = 100;
		
		System.out.println(v1 == v2);
		System.out.println(v1 != v2);
		
		System.out.println(v2 == v3);
		System.out.println(v2 != v3);
		
		var refVar1 = 100;
		var refVar2 = 200;
		var refVar3 = 200;
		
		System.out.println(refVar1 == refVar2);
		System.out.println(refVar1 != refVar2);
		
		System.out.println(refVar2 == refVar3);
		System.out.println(refVar2 != refVar3);

	}

}
