package intCode3;

public class sayisaydirma {

	public static void main(String[] args) {

		// 100 den 1 e kadar tek sayilar;
		// 0 ile 100 hem 3 hem 7 bolunebilen;
		// 2,4,8,16,32 2 nin usleri;
		// 1 den 5 e kadar 5 e tam bolunebilen;

		// for (int i = 99; i >= 1; i = i - 2) {
		// System.out.println(i+"_");
		// }

		// for (int i=1; i<100; i++) {
		// if (i%3==0 && i%7==0) { //i%21==0
		// System.out.println(i);
		// }
		// }

		// for (int i = 1; i < 100; i = i * 2) {
		// System.out.println(i);
		// }

		for (int i = 1; i <= 100; i++) {
			if(i%5==0) {
			System.out.print(i + "_");
			}
		}
	}
}