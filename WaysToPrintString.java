public class Main
{
	public static void main(String[] args) {
		System.out.println("Different ways of creating string ");
    
// 		  using Character Array
        char []arr = {'N','i','h','a','r','i','k','a'};
        System.out.println("Using Character Array : "+arr);
    
//      using string class
        String str = "Niharika";
        System.out.println("Using string class : "+str);
    
//      using string buffer class
        StringBuffer str1 = new StringBuffer("Niharika");
        System.out.println("Using StringBuffer class : "+ str1);
    
//      using StringBuilder class
        StringBuilder str2 =new StringBuilder("Niharika");
        System.out.println("Using StringBuilder class : " + str2);
	}
}
