package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//arithmetic operators
		System.out.println(3+4);
		System.out.println(4/2);//quotient-->2 rem--->0
		System.out.println(13%2);//remainder
		//assignment operators
		int a=5,b=7;
		a+=5;//a=a+5--->5+5=10
		System.out.println(a);
		b-=3;//b=b-3
		System.out.println(b);//4
		b*=5;
		System.out.println(b);//b=b*5--->4*5=20
		//comparison operators
		System.out.println(6==7);
		System.out.println(7>=6);
		
		//logical operators
		System.out.println((4==4)&&(7<6));//1*0--->0-->false
		System.out.println((4>3)||(5==5));//1+1---->1--->true
		System.out.println((5>=3)&&(4==5)||(6>7));//1*0+0--->0-->false
		System.out.println(5!=6);
		
		//unary operators
		//1)increment
		//2)decrement
		int x=2;
		System.out.println(++x);//x=3
		System.out.println(x++);//3
		System.out.println(x);//4
		System.out.println(x++);
		System.out.println(x);//5
		System.out.println(--x);//4
		System.out.println(x++);//4
		System.out.println(++x);
		
		
		
		

	}

}
