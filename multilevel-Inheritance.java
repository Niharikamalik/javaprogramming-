class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("braking...");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class Main
{
	public static void main(String[] args) {
	     
	      
	     Puppy d = new Puppy();
	     d.weep();
	     d.bark();
	     d.eat();
	    
	    
	}
}
