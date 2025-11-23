package week7.day2;

public class LearnConstructor {
	/**
	 * Constructor:
	 * -used to initialize the state of the objects.
	 * -constructor will have the same class name,will look like the method but in constructor,
	 * we dont have the returntype(even void)
	 * types of constructor:
	 * 1)default(no parameters)
	 * 2)parameterized(parameters) 
	 *  Constructor Overloading:
	 *    when having more than on constructor in a class with different parameters
	 *  this:
	 *  -used to differentiate local and global variables
	 *  Can you call one constructor from another constructor?
	 *  yes. using this keyword
	 * 
	 */
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		this(90, "saranya", false);
		System.out.println("default constructor");
		//empId=40;
		
	}
	
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		//this();
		System.out.println("parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
	}
	public static void main(String[] args) {
		
		
		/*
		 * LearnConstructor lc1=new LearnConstructor(8, "saran", true) ;
		 * System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 */
		 
		
		
		  LearnConstructor lc=new LearnConstructor();
		  System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 
		
		
	}

}
