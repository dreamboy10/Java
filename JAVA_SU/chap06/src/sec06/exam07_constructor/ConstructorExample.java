package sec06.exam07_constructor;

public class ConstructorExample {

	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String ssn;

	public void Korean
	(String name, String ssn) {
		String name1 = "¾ß";
		this.name = name1;
		String ssn1 = "¹Ù´Ú";
		this.ssn = ssn1;
		
		System.out.println(name1);
		System.out.println(ssn1);
		
	}

}
