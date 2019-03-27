import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=s.nextInt();
      }
      int x=s.nextInt();
      int x2=s.nextInt();
      int x_ch=0,x2_ch=0,a=0,b=0;
      for(int i=0;i<size;i++)
      {
			if(x==arr[i])
            {
              x_ch=1;
               a=i;
            }
        	
       if(x2==arr[i])
       {
              x2_ch=1;
         	 b=i;
       }
        
      }
      if(x_ch==1)
        System.out.println(a);
      else
         System.out.println("-1");
       if(x2_ch==1)
        System.out.println(b);
      else
         System.out.println("-1");
    }
}