//package jp02.part05;

public class OuterClass02{
////////Field
	private String outer="outerClass의 Field";
///////////Constructor
	public OuterClass02(){
	}
///////////////Method
	public void outerMethod(){

		System.out.println(":: "+this.getClass().getName()+" start..");

		final String localVariable="OuterClass 내의 outerMethod의 localVariable";
///////////Inner Local Class
		class InnerLocalClass{

			private String inner="innerClass의 Field";

			public InnerLocalClass(){
			}

			public void innerMethod(){
				System.out.println("==>"+this.getClass().getName()+" start..");

				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==> "+this.getClass().getName()+"end..");
			}
		}

		System.out.println(":: "+this.getClass().getName()+" start..");

		InnerLocalClass ilc=new InnerLocalClass();
		ilc.innerMethod();
	}
//////////Main
	public static void main(String[] args){
		new OuterClass02().outerMethod();
	}
}
