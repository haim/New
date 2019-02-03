package intCode2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringBuildOutOfTheSameLetters {

	
	// Write a method that check if a String is build out of the same letters as another string
	// same("abc","cab");-> true
	//same("abc","abb");-.false
	
//	static String []words= {"abc", "cba", "cca", "bca", "qwa", "bbb"};
//	 static String[]letters= {"a","b","c"};
//	 
//	 public static void main(String[]args) {
//		 String copy[] =Arrays.copyOf(words, words.length);
//		 ArrayList updated =new ArrayList();
//		 for(int j =0; j<letters.length; j++) {
//			 for(int i=0; i<copy.length; i++) {
//				 if((copy[i]!=null)&&(copy[i].contains(letters[j]))){ 
//					 copy[i]=null;
//					 
//				 }
//			 }
//		 }
//		 for(int k=0; k<copy.length; k++) {
//			 if(copy[k]!=null)
//				 updated.add(copy[k]);
//				 
//		 }
//	 }
	
	
	public static void main(String[]args) {
	
	
	String actual="abc";
	String expected ="cab";
	
	Set actualSet= new TreeSet();
	Set expectedSet = new TreeSet();{
	for (int i=0; i<actual.length();i++) {
		actualSet.add(actual.charAt(i));
		
		expectedSet.add(expected.charAt(i));
	}
	System.out.println(actualSet);
	 if(actualSet.equals(expectedSet)) {
		 System.out.println("true");}
	 else {
		 System.out.println("false");
	 }
}}}