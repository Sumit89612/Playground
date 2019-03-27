import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int c=Gcd(n1,n2);
      int max,min;
     if(c>n3)
    {
       max=c;
     min=n3;
  }
    else
    {
       max=n3;
       min=c;
    }
    while(min>1)
    {
      int r=max%min;
        max=min;
        min=r;
  }
      System.out.println(max);
	}
  public static int Gcd(int x,int y)
  {
    int max,min;
    if(x>y)
    {
       max=x;
     min=y;
  }
    else
    {
       max=y;
       min=x;
    }
    while(min>1)
    {
      int r=max%min;
      if(r==0)
        return min;
      else
        max=min;
        min=r;
  }
    return  min;
  } 
}