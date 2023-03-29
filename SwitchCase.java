package java_fund;

public class SwitchCase {

	public static void main(String[] args) {
		int month =Integer.parseInt(args[0]);
		String season="";

		switch(month) {
		case 1:
		case 2:
		case 11:
		case 12:
			season="Winter";
		   break;
		case 3:
		case 4:
		case 5:
		case 6:
			season="Summer";
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			season="Mansoon";
			break;
		default:
			System.out.println("Invalid Month");
			
			
		}
		System.out.println("Season is:  "+season);
		System.out.println("Thank you!!");
	}

}
