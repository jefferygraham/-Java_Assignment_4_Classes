package two;

public class Main {

	public static void main(String[] args) {

		PrivatePerson two = new PrivatePerson();
		
		
		two.setName("Jeff");
		two.setAge(42);
		
		System.out.println(two.getName());
		System.out.println(two.getAge());
	}

}
