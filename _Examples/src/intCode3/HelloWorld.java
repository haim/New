package intCode3;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello");
		
		System.out.println(2<4 && 4<6);
		System.out.println(false & true);
		
		boolean a = 5 == 4 && true;
		System.out.println(a);
		
		String drink = "coffee";
		boolean hot = true;
		boolean free = true;
		boolean bool = drink.equals("coffee") & hot & free;
		System.out.println(bool); 
		//& && not big difference, almost same.
		//|| means "or"
		//&& means "and"
		
		bool = true;
		System.out.println(!true);// !(NOT) reverse it; if it true, show false.
		bool = !true; 
		System.out.println(!bool);//! + !true = true
			
		boolean apples =false, oranges =true;
		System.out.println(apples | oranges); //true
		System.out.println(oranges ^ apples); //true
		System.out.println(oranges ^ oranges); //false
		
		//precedence of logical operators
		//! evaluated first,
		//& second,
		//| third.
		// first ! so true				second and so false
		System.out.println(!(false) || true && false); //true
		
		//if statement
		if(10 > 5)  // if den sonra ; yok
		// eger 10<5 olsaydi yazi asagida cikmazdi
		System.out.println("sen bu isi biliyon!");
		
		int books = 7;
		if(books>5)
		books+=3;
		System.out.println(books);
		
		boolean cold = true;
		boolean hott  = false;
		if (hott)
		System.out.println("Please, bring the hot one!!!"); // calismadi
		
		double guess = 7.8;
		int answer = (int)guess;
	     
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
		
		


