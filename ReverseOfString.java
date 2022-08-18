public class Main
{
  public static void main (String[]args)
  {

    String str = "niharika";
    String ans = " ";
    
    int n = str.length ();
    for (int i=n-1; i>=0; i--)
        ans += str.charAt (i);
    System.out.println(ans);

  }
}
