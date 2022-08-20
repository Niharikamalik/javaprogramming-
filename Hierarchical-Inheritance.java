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
class Cat extends Animal{
    void meow(){
        System.out.println("meow...");
    }
}
public class Main
{
	public static void main(String[] args) {
	     
	      
	     Cat d = new Cat();
	     d.meow();
	     d.eat();
	     
	    
	}
}
