import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int end = str.length()-1;
    int start = 0;
    boolean isPal=true;
    while(start<end ){
        if(str.charAt(start)!=str.charAt(end)){
            isPal=false;
            break;
        }
      start++;end--;
    }
      
    if(isPal==true){
        System.out.println("palindrome");
    }
    else System.out.println("not palindrome");
    
  }
}

