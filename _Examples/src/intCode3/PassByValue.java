package intCode3;

public class PassByValue {

	int x = 0;
	int y = 0;

	public static void tricky(PassByValue arg1, PassByValue arg2) {

		arg1.x = 100;
		arg1.y = 100;

		 PassByValue temp = arg1;

		 arg1 = arg2;
		 arg2 = temp;
		 
		 System.out.println("X1: " + arg1.x + " Y: " + arg1.y);
		 System.out.println("X1: " + arg2.x + " Y: " + arg2.y);
		 
	}
	public static void main(String[] args) {
		
		PassByValue ex1 = new PassByValue();
		PassByValue ex2 = new PassByValue();

		System.out.println("X2: " + ex1.x + " Y: " + ex1.y);
		System.out.println("X2: " + ex2.x + " Y: " + ex2.y);

		tricky(ex1, ex2);

		System.out.println("X3: " + ex1.x + " Y: " + ex1.y);
		System.out.println("X3: " + ex2.x + " Y: " + ex2.y);

	}
}
