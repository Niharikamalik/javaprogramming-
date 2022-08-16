import java.util.Scanner;

class InputUsingScanner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Entered String "+s);
        int i = sc.nextInt();
        System.out.println("entered integer "+i);
        float f = sc.nextFloat();
        System.out.println("Entered Float "+f);
        double d = sc.nextDouble();
        System.out.println("Entered double " + d);
    }
}
