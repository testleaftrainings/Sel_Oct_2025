package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * Strings:
		 * -collection of characters
		 * -immutable class
		 * -non primitive datatype(size is not predefined)
		 * declaration:
		 * -string literal
		 * syn:datatype v.name="values";
		 * -string instantiation
		 */
		
		//string literal
		String name="Testleaf";//id=23
		String name1="TestLeaf";
		//String instantiation
		String str=new String("Testleaf");//id=29
		String Str1=new String("Testleaf");
		//count the characters
		int length = name1.length();
		System.out.println(length);
		
		//compare the strings(equals)--->content of the string,case sensitive
		boolean equals = name1.equals(Str1);
		System.out.println(equals);
		
		if (name1.equals(Str1)) {
			System.out.println("text same");
		} else {
			System.out.println("text not same");
		}
		
		//== method--->memory address
		if (name==str) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		//ignorecase sensitive
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		//contains---compares the content ,case sensitive
		if (name.contains("Test")) {
			System.out.println("matched");
		} else {
			System.out.println("not matched");
		}
		
		//to CharArray
		char[] charArray = name.toCharArray();//ctrl+2,L
		System.out.println(charArray);
		//CharAt--->retreive any value
		char charAt = str.charAt(4);
		System.out.println(charAt);
		
		//replace
		String s="Testleaf@123";
		String replace = s.replace("l", "").replace("@", "0");
		System.out.println(replace);
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		//retreive any values 
		String replaceAll = s.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = s.replaceAll("[^A-z]", "");
		System.out.println(replaceAll2);
		
		//String to integer
		String st="123";
		System.out.println(st+10);
		int stringToInt = Integer.parseInt(st);
		System.out.println(stringToInt+10);
		
		//integer to string
		int i=123;
		System.out.println(i+10);
		String intToString = Integer.toString(i);
		System.out.println(intToString+10);
		
		//split-->string is spitted into multiple strings
		
		String st1="Testleaf and Qeagle";
		String[] split = st1.split(" ");//index0--->testleaf,1-->and,2-->Qeagle
		System.out.println(split[2]);
		String[] split2 = st1.split("le");
		//test--->0 
		//af and Qeag-->1
		System.out.println(split2[1]);//Array index out of bound exception(index-->2)
		
		String[] split3 = st1.split("");
		System.out.println(split3[5]);
		
		//substring-->crop the given string
		String st2="october";
		String substring = st2.substring(2);
		System.out.println(substring);
		String substring2 = st2.substring(1, 6);//end index-->n+1
		System.out.println(substring2);
		
		
	}

}
