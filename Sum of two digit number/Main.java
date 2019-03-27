import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int F=n/10;
      int L=n%10;
      int sum=F+L;
      System.out.println(sum);
	}
}