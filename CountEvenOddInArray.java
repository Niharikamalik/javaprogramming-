import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : ");
        int n =sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter "+n+" values for array : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int count=0;
        for (int i=0;i<n;i++)
            if (arr[i]%2==0)
               count++;
        System.out.println("No.of even digits in the Array : "+count);
        int odd =n-count;
        System.out.println("No. of odd digits in the array : "+odd);
    }
}
