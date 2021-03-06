package exercise08_interface;

interface Soundable {
	String sound();
}

public class Exercise3 {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

///////////////////////// �� /////////////////////////

class Dog implements Soundable{
	@Override
	public String sound() {
		return "�۸�";
	}
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "�߿�";
	}
}
