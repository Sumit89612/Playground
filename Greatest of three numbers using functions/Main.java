import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int c=com(n1,n2);
      if( c>n3)
        System.out.println(c);
      else
        System.out.println(n3);
	}
  public static int com(int x,int y)
  {
    if(x>y)
      return x;
    else
      return y;
  }
}