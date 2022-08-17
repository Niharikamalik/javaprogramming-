public class CloneOfArray
  {
	public static void main(String[] args) {
		int arr[]={1,2,34,5};
		int clonearr[] = arr.clone();
    // will print false
		System.out.println(arr==clonearr);
		for(int i=0;i<clonearr.length;i++)
		    System.out.println(clonearr[i]);
	}
}
