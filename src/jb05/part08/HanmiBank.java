//package jb05.part08;

public class HanmiBank extends Bank implements Deposit, PayOut{
//////////////Constuctor
	public HanmiBank(){
	}

	public HanmiBank(String name){
		super(name);
	}
///////////////Method	
	public void display(){
		System.out.println("����� : " +this.getName());
	}
	public void deposit(int money){
		System.out.println(money + "�� �Ա��մϴ�.");
	}
	public void payOut(int money){
		System.out.println(money + "�� ����մϴ�.");
	}
///////////////Main
	public static void main(String[] args){
		HanmiBank hb = new HanmiBank("�ѹ�����");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		System.out.println(Deposit.deposit);
		System.out.println(PayOut.payOut);

		//Deposit.deposit = "�Ա�";
		//PayOut.payOut = "���";
	}//end of main

}//end of class