package jb04;

public class Manager extends Employee{
///////////////////Field	
	int salary;
 ///////////////Constuctor
	public Manager(){
		System.out.println("Manager�� default Constructor");
	}
	public Manager(String str){
		super(str);
		System.out.println("Manager�� name�� �޴� Constructor");
	}
	public Manager(String str1, String str2){
		this(str1);
		part=str2;
		System.out.println("Manager�� name, part�� �޴� Constructor");
	}
	public Manager(String str1, String str2, int i){
		super(str1,str2);
		age=i;
		System.out.println("Manager�� name, part, age�� �޴� Constructor");
	}
	public Manager(String str1, String str2, int i, int j){
		this(str1, str2, i);
		salary=j;
		System.out.println("Manager�� name, part, age, salary�� �޴� Constructor");
	}
///////////////////Method
	public void callSalary(){
		System.out.println("Manager�� �⺻���� : "+super.salary());
	}
///////////////////////Main
	public static void main(String args[]){

		Manager m1=new Manager();
		
/*		Manager m2=new Manager("ȫ�浿","EJB");
		Manager m3=new Manager("ȫ�浿","EJB",25);
		Manager m4=new Manager("ȫ�浿","EJB",25,300);
		*/

		System.out.println("\n");

//		System.out.println("overriding�� salary ȣ�� : "+m4.salary());
//		m4.callSalary();
		

	}

}