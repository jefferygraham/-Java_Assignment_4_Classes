package three;

public class TalkablePerson {
	
	String name;
	int age;
	
	TalkablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("Hello my name is: " + this.name);
	}

}
