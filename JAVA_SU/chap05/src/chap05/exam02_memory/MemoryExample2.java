package chap05.exam02_memory;

public class MemoryExample2 {

	public static void main(String[] args) {
		int sum = 50;
		
		if(sum == 0) {
			int v2 = 10;
			int v3 = 20;
			sum = add(v2, v3);
		}
		System.out.println(sum);
		
		String name1 = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		
		System.out.println(name1);
		System.out.println(name2);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
