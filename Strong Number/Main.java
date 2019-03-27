import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
           Scanner s=new Scanner(System.in);
          int sum=0,pow,temp,x,i=1,last_digit;
       int n=s.nextInt();
    temp=n;
    x=n;
    while(temp>0)
    {
        last_digit=temp%10;
        pow=1;
        for(i=last_digit;i>0;i--)
        {
            pow=pow*i;
        }
        sum=sum+pow;
        temp=temp/10;
    }
    if(x==sum)
        System.out.println("Yes");
    else
       System.out.println("No");
	}
}