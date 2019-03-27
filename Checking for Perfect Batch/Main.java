import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    perfect_batch(arr,n);
  }
  public static void perfect_batch(int arr[],int n)
  {
    boolean is_perfect=true;
    int sum1=arr[0]+arr[1]+arr[2];
    for(int i=3;i<n;i+=3)
    {
      int sum2=arr[i]+arr[i+1]+arr[i+2];
    if(sum2 != sum1)
      is_perfect=false;
    }
    if(is_perfect==true)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}