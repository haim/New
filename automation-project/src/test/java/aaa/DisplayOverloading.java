package aaa;

public class DisplayOverloading {

	public void disp(char c) {
		System.out.println(c);
	}

	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

class Sample {
	public static void main(String args[]) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);
	}
}
///////////////////////// ****************/////////////////////////
class Human {
	// Overridden method
	public void eat() {
		System.out.println("Human is eating");
	}
}

class Boy extends Human {
	// Overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}

	public static void main(String args[]) {
		Boy obj = new Boy();
		// This will call the child class version of eat()
		obj.eat();
	}
}