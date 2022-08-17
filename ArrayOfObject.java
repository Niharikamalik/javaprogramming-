******************************************************************************************************************
* // Java programming language is all about classes and objects as it is an object-oriented programming language.*
* // When we require a single object to store in our program we do it with a variable of type Object.            *
* // But when we deal with numerous objects, then it is preferred to use an Array of Objects.                    *
******************************************************************************************************************
// ARRAY OF OBJECT // 
import java.util.Scanner;
class Student{
    public int roll_no;
    public String name;
    //// CONSTRUCTOR////
 Student(int roll_no, String name){
     this.roll_no = roll_no;
     this.name = name;
 }    
}
public class ArrayOfObject{
    public static void main (String[] args) {
        /* code */
       Student []arr = new Student[3];
       arr[0] = new Student(1,"avina");
       arr[1] = new Student(2,"maya");
       arr[2] = new Student(3,"rishi");
        for(int i=0; i<3;i++){
           System.out.println(arr[i].roll_no + " " + arr[i].name);
        }
    }
    
}
