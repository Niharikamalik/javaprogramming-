import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter a Number : ");
	    int n  =sc.nextInt();
	    String s=" ";
	    while(n>0){
	        s=(n%2)+s;
	        n=n/2;
	    }
	    System.out.println("Binary of given number is "+s);
		
	}
}
