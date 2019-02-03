package intCode3;

	public class reverseint {
		  
		public static int reverseInt(int i) {
		      if (i/10>=1) {
		        return Integer.parseInt(""+i%10+reverseInt(i/10));
		      }
		      return i%10;
		    }
		  
		public static void main(String[] args) {
		      int g = 12345678;
		      String d = ""+g;
		      StringBuilder sb = new StringBuilder(d);
		      System.out.println(sb.reverse());
		      g = Integer.parseInt(d);
		      System.out.println(g);
		      
		      System.out.println("************************");
		      
		      System.out.println(reverseInt(98765432));  
		  }
		  {
		    char[] hjk = {'a', 'b', 'c', 'd'};
		    int[] i1 = {1,2,3,4,88, 5,6,7,8,9};
		    String[] s1 = {"Bir", "Iki", "Uc", "Dort"};
		    String s2 = "Cybe rtek";
		    String a9 = "";
		    
		    for (int i = hjk.length-1; i >=0; i--) {
		      System.out.print( hjk[i]+" ");}
		    System.out.println();
		    for (int i = i1.length-1; i >=0 ; i--) {
		      System.out.print(i1[i]+" ");}
		    System.out.println();
		    for (int i = s1.length-1; i >=0; i--) {
		      System.out.print(s1[i]+" ");}
		    System.out.println();
		    for (int i = s2.length()-1; i >=0; i--) {
		      a9=a9+s2.charAt(i);}
		    System.out.print(a9+" ");
		    String f = i1.toString();
		    System.out.println(f.toString());
}
}