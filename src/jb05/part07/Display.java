//package jb05.part07;

class BusCharge{
	String section;

	public BusCharge(){
	}

	public BusCharge(String section){
		this.section = section;
	}

	public void information(){
		System.out.println("버스요금안내");
	}
}//end of class

interface Fee{
	public void charge();
}//end of class

class Student extends BusCharge implements Fee{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println(":: 300원 \n");
	}
}//end of class

class Adult extends BusCharge implements Fee{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println(":: 500원 \n");
	}
}//end of class

class Old extends BusCharge implements Fee{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println(":: 공짜 \n");
	}
}//end of class

public class Display{
	public static void main(String[] args){
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();

		/*
		Fee[] fee = new Fee[3];
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

		for(int i=0;i<fee.length;i++){
			fee[i].information();
			System.out.println(fee[i].section);
			fee[i].charge();
		}*/

	}//end of main
}//end of class