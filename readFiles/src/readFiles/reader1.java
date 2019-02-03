package readFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class reader1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fl=new FileReader("/Users/kaan/Desktop/print/Employees.xlsx");
		Scanner sc=new Scanner(fl);
		String s="";
		while(sc.hasNext()) {
			s=s+sc.nextLine();
		}
		System.out.println("==Original:==\n"+s);
		s=s.replace(".", " ");
		s=s.replace("!", " ");
		s=s.replace("?", " ");
		s=s.replace("-", " ");
		String[] strarr=s.split(" ");
		List<String> list=new ArrayList<>();
		for(String each:strarr) {
			if(each.length()>=4) {
			list.add(each);
			}
		}
		System.out.println("\n==Without less than 4 char:==\n"+list);
		Set<String> set=new HashSet<>(list);
		int count=0;
		int max=0;
		String most="";
		for(String each:set) {
			count=Collections.frequency(list, each);
			if(count>max) {
				max=count;
				most=each;
			}
		}
		
		set.remove(most);
		
		int newMax=0;
		for(String each:set) {
			count=Collections.frequency(list, each);
			if(count>newMax) {
				newMax=count;
				most=each;
			}
		}
		System.out.println("\n2nd most word:"+most);
		System.out.println("\n2nd most word count:"+newMax);

		}
}