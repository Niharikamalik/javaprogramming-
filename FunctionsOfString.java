public class Main
{
	public static void main(String[] args) {
	   
	   // FUNCTIONS OF STRING 
	   
	   String str = "Niharika";
	   System.out.println("length : "+str.length());
	   System.out.println("charAt : "+str.charAt(4));
	   System.out.println("substring : "+str.substring(4));
	   System.out.println("substring : " +str.substring(2,5));
	   
	   
	   String str1 = "arika";
	   String str2 = "Niharika";
	   System.out.println("toUpperCase : " +str1.toUpperCase());
	   System.out.println("contains : " +str2.contains(str1));
	   System.out.println("eqauls : "+str.equals(str2));
	   System.out.println("indexOf : "+str.indexOf(str1));
	   int comp = str.compareTo(str2);
	   System.out.println("compareTo : " +comp);
	   int comp1 = str.compareTo(str1);
	   if (comp1==0) System.out.println("same");
	   if(comp1>0)System.out.println("str greater");
	   if(comp1<0)System.out.println("str smaller");
	   
	}
}
