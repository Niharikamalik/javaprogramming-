import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter a binary number : ");
	    int n =0 ,k =1 ;
	    String s=sc.nextLine();
	    for (int i=s.length()-1;i>=0;i--){
	        n+=(s.charAt(i)-'0')*k;
	        k=k*2;
	    }
	    System.out.println("Decimal of given binary number is "+n);
		
	}
}
