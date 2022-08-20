class Employee {
    float salary = 40000;
}
public class Main extends Employee
{
    int bonous =10000 ;
	public static void main(String[] args) {
		Main programmer =new Main();
		System.out.println(programmer.salary);
		System.out.println(programmer.bonous);
	}
}
