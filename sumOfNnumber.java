import java.util.Scanner;
public class SumOfNnumber
{
	public static void main(String[] args) {
	    System.out.println("Enter Number : ");
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int ans = 0;
	    for (int i=1;i<=n;i++){
	        ans+=i;
	    }
	    System.out.println("sum of n numbers : " + ans);
	}
}
