package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/**
		 * Arrays:
		 * -collection of items of same datatype
		 * declarations:
		 * -Array Literal:(based on data)
		 * syn:datatype var.name[]={values};
		 * -Array Instantiation(based on size)
		 */
		
		//ArrayLiteral
		int marks[]= {89,54,76,78,32,90};//index starts from 0 and length starts from 1
		//length of an array
		int arrLength = marks.length;
		System.out.println(arrLength);
		//sort an array
		Arrays.sort(marks);//32,54,76,78,89,90
		System.out.println(marks[3]);
		//max value
		System.out.println(marks[arrLength-1]);
		
		//Array instantiation
		int marks1[]=new int[4];//1,2,3,4
		marks1[0]=46;//--->1
		marks1[1]=66;//--->2
		marks1[2]=76;//--->3
		System.out.println(marks1[3]);
		String learners[]=new String[4];
		learners[0]="loganathan";
		learners[1]="vishnu";
		learners[2]="vignesh";
		System.out.println(learners[3]);
		
	}

}
