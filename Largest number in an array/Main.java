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
      int greatest=arr[0];
      for(int i=0;i<size;i++)
      {
        if(greatest<arr[i])
        	greatest=arr[i];
      }
      System.out.println(greatest);
    }
}