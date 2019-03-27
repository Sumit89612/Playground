import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int temp=n;
      int x=n;
      int digit=0,sum=0;
      while(n>0)
      {
        digit++;
        n=n/10;
      }
      while(temp>0)
      {
        int last_dig=temp%10;
        int pow=1;
        for(int i=1;i<=digit;i++)
        {
          pow=pow*last_dig;
        }
        sum=sum+pow;
        temp=temp/10;
      }
      if(x==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}