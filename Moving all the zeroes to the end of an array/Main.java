
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      zero(arr,n);
      for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");
    }
  public static void zero(int arr[],int n)
  {
    int c=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]!=0)
      {
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
        c++;
      }
    }
  }
}