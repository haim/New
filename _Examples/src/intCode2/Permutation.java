package intCode2;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	
	//Write a program to print all permutations of a given string. 
	//("ABC")-> "ABC ACB BAC BCA CBA CAB"

	
//	
//	public static Set<String> permutationFinder(String str) {
//        Set<String> perm = new HashSet<String>();
//        //Handling error scenarios
//        if (str == null) {
//            return null;
//        } else if (str.length() == 0) {
//            perm.add("");
//            return perm;
//        }
//        char initial = str.charAt(0); // first character
//        String rem = str.substring(1); // Full string without first character
//        Set<String> words = permutationFinder(rem);
//        for (String strNew : words) {
//            for (int i = 0;i<=strNew.length();i++){
//                perm.add(charInsert(strNew, initial, i));
//            }
//        }
//        return perm;
//    }
//
//    public static String charInsert(String str, char c, int j) {
//        String begin = str.substring(0, j);
//        String end = str.substring(j);
//        return begin + c + end;
//    }
//
//    public static void main(String[] args) {
//        String s = "AAC";
//        String s1 = "ABC";
//        String s2 = "ABCD";
//        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
//        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
//        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
//    }
//
//}

	
	static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private static void StringPermutation(String permutation, String input)
    {    
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {    
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
     
    public static void main(String[] args) 
    {
        StringPermutation("JSP");
    }    
}