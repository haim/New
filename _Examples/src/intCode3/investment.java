package intCode3;

public class investment {

	public static void main(String[] args) {

		double startValue = 10000;
		double rate = 0.11;
		int length = 20; //years
		double currentValue;
		//final value=start * (1 + rate)^ years
		for(int i=1; i<=length; i++) {
			currentValue = startValue*Math.pow((1+rate), i);
			System.out.println(i + ":" + currentValue);
			
		}
	}

}
