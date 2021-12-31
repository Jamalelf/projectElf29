package JavaAssignment;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int num=1234321;
		int rev=0;
		int temp=num;
		
		while(num>0) {
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
	System.out.println(rev);

	}

}
