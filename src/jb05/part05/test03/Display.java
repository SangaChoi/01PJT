package jb05.part05.test03;

abstract class BusCharge{
	String section;

	public BusCharge(){
	}

	public BusCharge(String section){
		this.section = section;
	}

	public void information(){
		System.out.println("������ݾȳ�");
	}

	//public void charge(){
	//	System.out.println("�л� : 300, �Ϲ��� : 500, ��� : ��¥");
	//}
	public abstract void charge();
}//end of class

class Student extends BusCharge{
	public Student(){
		super("�л�");
	}
	public void charge(){
		System.out.println(":: 300�� \n");
	}
}//end of class

class Adult extends BusCharge{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println(":: 500�� \n");
	}
}//end of class

class Old extends BusCharge{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println(":: ��¥ \n");
	}
}//end of class

public class Display{
	public static void main(String[] args){
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();

		//BusCharge bc01 = new BusCharge();
		//BusCharge bc02;

	}//end of main
}//end of class