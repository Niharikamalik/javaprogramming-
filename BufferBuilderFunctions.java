public class Main
{
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Niharika");
		
		System.out.println(str.append("_"));
		System.out.println(str.insert(9,'M'));
		System.out.println(str.capacity());
		System.out.println(str.delete(8,10));
		System.out.println(str.replace(3,7,"___"));
	}
}
