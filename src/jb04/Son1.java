package jb04;

public class Son1 extends jb04.Father{

	public Son1(){
		System.out.println(this.name);
		System.out.println(bank);
		//System.out.println(branch);
		//System.out.println(password);

		System.out.println(this.getBranch());
		System.out.println(getPassword(0));

	
	}

}