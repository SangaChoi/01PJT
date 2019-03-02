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
		System.out.println("은행명 : " +this.getName());
	}
	public void deposit(int money){
		System.out.println(money + "를 입금합니다.");
	}
	public void payOut(int money){
		System.out.println(money + "를 출금합니다.");
	}
///////////////Main
	public static void main(String[] args){
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		System.out.println(Deposit.deposit);
		System.out.println(PayOut.payOut);

		//Deposit.deposit = "입금";
		//PayOut.payOut = "출금";
	}//end of main

}//end of class
