package JavaAssignment;

public class ReverseSenetence {

	public static void main(String[] args) {
		String s="My name is JAMAL";
		String[]s1=s.split(" ");
		String rev="";
		
		for(int i=0;i<s1.length;i++) {
			rev=s1[i]+rev;
			
			
		}
		System.out.println(rev);
	}
}
