import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the size of array : ");
	    int n = sc.nextInt();
	    int arr[]=new int[n];
	    int sum=0;
	    System.out.print("enter "+n+" values for array : ");
	    for (int i=0 ; i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("entered array ");
	    for (int i=0 ; i<n;i++){
    	        System.out.println(arr[i]);
	    }
	   
	    for (int i=0 ; i<n;i++){
	        sum+=arr[i];
	    }
	     System.out.println("sum of array is : "+sum);
	}
}
