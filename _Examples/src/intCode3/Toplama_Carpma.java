package intCode3;

public class Toplama_Carpma {

	public static void main(String[] args) {

		double[] prices = { 1, 2, 3 }; // = new double []{ 1, 2, 3 };
		
		for (int i = 0; i < prices.length; i++) {
			prices[i] = prices[i] * 2;
			System.out.println(prices[i]);
		}
		
		double sum=0;
		for (int i = 0; i < prices.length; i++) {
		sum=sum+prices[i];
		}
		System.out.println(sum);
		
		
		
		
	}

}
