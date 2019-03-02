//package jb05.part08;

public abstract class Bank{

	private String name;

/////////////Consructor
	public Bank(){
	}
	public Bank(String name){
		this.name = name;
	}
///////////////////
	public abstract void display();
///////////////////get
	public String getName(){
		return name;
	}
////////////////set
	public void setName(String name){
		this.name = name;
	}
}//end of class