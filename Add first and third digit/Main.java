import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int first=n/100;
      int third=n%10;
      int sum=first+third;
      System.out.println(sum);
	}
}