import java.util.Scanner;
class Main{
  
	public static int sum(int x)
  {
      int z=0;
      for(int i=1;i<=x;i++)
      {
        z=z+i;
      }
    return z;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sm=sum(n);
      System.out.println(sm);
	} 
	}
