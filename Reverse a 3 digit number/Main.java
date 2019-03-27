import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);            
    int n=s.nextInt();
    int f=n/100;
    int f1=n%100;
    int m=f1/10;
    int l=f1%10;
    int reverse=((l*100)+(m*10)+f);
    System.out.println(reverse);
  }
}