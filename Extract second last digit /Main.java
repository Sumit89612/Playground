import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int L=n%100;
      int val=L/10;
      System.out.println(val);
	}
}