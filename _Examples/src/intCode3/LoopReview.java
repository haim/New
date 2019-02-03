package intCode3;

public class LoopReview {

	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {
			//System.out.println("row:" + row);
			for (int col = 1; col <= 3; col++) {
				System.out.print(row);
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("*************************");

		for (int col = 1; col <= 3; col++) {
			// System.out.println("row:" + row);
			for (int row = 1; row <= 5; row++) {
				System.out.print(row);
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("*************************");

		for (int row = 1; row <= 5; row++) {

			if (row == 3)	break;
		
			for (int col = 1; col <= 3; col++) {

				if (col == 1 && row == 2) {
					//System.out.println("\t");
					continue;
				}
				System.out.print(row);
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col <= 3; col++) {
				if (col==2) continue;
				
				System.out.print(row);
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		System.out.println("*************************");
	}
}