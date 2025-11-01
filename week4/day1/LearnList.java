package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/**
		 * properties of List:
		 * 1)it is an ordered colle"ction
		 * 2)it allows the duplicate values
		 * syn:interface<generic type> listname=new imp.class<generictype>();
		 */
		//create a list
		List<String> Learners=new ArrayList<String>();
		List<String> Trainer=new ArrayList<String>();
		Trainer.add("saranya");
		System.out.println(Trainer);
		//List<Integer> numberOfLearners=new ArrayList<Integer>();
		//add learner name in the list
		Learners.add("vishnu");//INDEX STARTS FROM 0
		Learners.add("dhanalakshmi");
		Learners.add("sahana");
		System.out.println(Learners);
		Learners.add(1, "preethi");
		Learners.add("preethi");
		System.out.println(Learners);
		
		for (int i = 0; i < Learners.size(); i++) {
			System.out.println(Learners.get(i));
		}
		
		//find the size of the list
		int size = Learners.size();
		System.out.println(size);
		//retreive any particular value from a list
		String singleValue = Learners.get(2);
		System.out.println(singleValue);
		//remove 
		Learners.remove(2);
		System.out.println(Learners);
		Learners.remove("preethi");
		System.out.println(Learners);
		//clear the List
		/*
		 * Learners.clear(); System.out.println(Learners);
		 */
		Trainer.addAll(Learners);
		System.out.println(Trainer);

	}

}
