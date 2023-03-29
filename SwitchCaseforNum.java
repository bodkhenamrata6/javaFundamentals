package java_fund;

public class SwitchCaseforNum {

	public static void main(String[] args) {
		int x=20;
		int y=20;
		if(x>y)
		{
		x=1;
		}
		else if(x<y)
		
		{
			x=2;
		}
		switch(x) {
		case 1:
			System.out.println("x is greater than y");
			break;
		case 2:
			System.out.println("y is greater than x");
			break;
			
			default:
				System.out.println("Both are equals");
		}
	}

}
