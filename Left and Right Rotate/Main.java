import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner s=new Scanner(System.in);
    int n =s.nextInt();
    int arr[]=new int [n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    int r=s.nextInt();
    even_odd(arr,n,r);
  	}
  public static void even_odd(int arr[],int n,int r)
  {
    int even[]=new int[n];
    int e=0;
    int odd[]=new int[n];
    int o=0;
    for(int i=0;i<n;i++)
    {
      if(i%2==0)
      {
        even[e]=arr[i];
        e++;
      }
      else
      {
        odd[o]=arr[i];
          o++;
      }
    }
    for(int i=0;i<r;i++)
    {
      int temp=even[0];
      for(i=0;i<e;i++)
      {
        even[i]=even[i+1];
      }
      even[e-1]=temp;
    }
    for(int i=1;i<=r;i++)
    {
      int temp=odd[0];
      for(int j=1;j<o;j++)
      {
        odd[j-1]=odd[j];
      }
      odd[o-1]=temp;
    }
    o=0;
    e=0;
    for(int i=0;i<n;i++)
    {
      if(i%2==1)
      {
        arr[i]=odd[o];
        System.out.print(arr[i]+" ");
        o++;
      }
      else
      {
        arr[i]=even[e];
        System.out.print(arr[i]+" ");
        e++;
      }
    }
  }
}
