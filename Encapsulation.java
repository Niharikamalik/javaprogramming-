public class Main
{
	public static void main(String[] args) {
	   Student s = new Student();
	   s.setcgpa(9.7f);
	   System.out.println(s.getcgpa());
	    
	}
}
 class Student{
     String name ;
     private float cgpa;
      
     public float getcgpa(){
         return cgpa;
     }  
     public void setcgpa(float newcgpa){
        this.cgpa=newcgpa;
     }
 }
