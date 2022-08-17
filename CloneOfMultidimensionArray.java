public class Main
{
	public static void main(String[] args) {
		int arr[][]={{1,2,6},{34,5}};
		int clonearr[][] = arr.clone();
    // will print false
		System.out.println(arr==clonearr);
   // will print true
		System.out.println(arr[0]==clonearr[0]);
		System.out.println(arr[1]==clonearr[1]);
	}
}
