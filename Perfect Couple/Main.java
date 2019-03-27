import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int [n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int num=s.nextInt();
      int sum=0;
      for(int i=0;i<n-1;i++)
      {
        for(int j=i;j<n-1;j++)
        {
       		sum=arr[i]+arr[j+1];
            if(sum==num)
            {
              System.out.print(arr[i]+", "+arr[j+1]);
              System.out.println();
            }
            sum=0;
        }
      }
    }
}