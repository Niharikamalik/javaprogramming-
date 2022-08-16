import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

class InputUsingBuffered {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("string : "+s);
        int age = Integer.parseInt(reader.readLine());
        System.out.println("integer : "+age);
        float weight = Float.parseFloat(reader.readLine());
        System.out.println("float : "+weight);
        /* code */
    }
}

