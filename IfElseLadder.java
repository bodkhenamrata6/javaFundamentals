package java_fund;

public class IfElseLadder {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		//arg passing through run conf at run time
		
		if(month==12 || (month>=1 && month<=2))
		{
			System.out.println("Winter Season");
		}
		else if(month>=3 && month<=6)
		{
			System.out.println("Summer Season");
		}
		else if(month>=7 && month<=11)
		{
			System.out.println("Mansoon Season");
		}
		else
			System.out.println("Invalid Month");

	}

}
