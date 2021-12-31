package JavaAssignment;

public class NumberOfOccurrence {

	public static void main(String[] args) {
	String s="hi hello welcome to your home town";
	int count=0;
	
	char ch[]=s.toCharArray();
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='h') {
			count++;
		}
	}
	System.out.println(count);
	}

}
