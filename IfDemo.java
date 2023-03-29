package java_fund;

public class IfDemo {

	public static void main(String[] args) {
		/*int marks=70;
		System.out.println("Print the result: ");
		if(marks>=35) 
			System.out.println("Pass");
		else
	      System.out.println("Fail");
	      */
		
	/*	int marks=80;
		System.out.println("Print the result: ");
		if(marks>=70) {
			System.out.println("First Class");
		}
	      System.out.println("All the best");*/
		
		/*int marks=17;
		
		if(marks>=75)
			System.out.println("Destiction");
		else if(marks>=60 && marks<=75)
			System.out.println("First Class");
		else if(marks>=50 && marks<=60)
			System.out.println("Second class");
		else if(marks>=35)
		System.out.println("Pass");
		else
		System.out.println("Fail");*/
		
		int age=50;
		
		if(age>=18) {
			System.out.println("Eligibale for Voting");
			if(age>=18 && age<=30)
				System.out.println("move to section A");
			else
				System.out.println("move to section B");
			System.out.println("Thank you");
		
		}	
		else
			{System.out.println("Not Eligibale for Voting");
		System.out.println("wait till 18");
			}
	}

		
}
