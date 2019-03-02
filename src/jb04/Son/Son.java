package jb04.son;

public class Son extends Father{

	public Son(){
		System.out.println(this.name);
		System.out.println(bank);
		System.out.println(branch);
		//System.out.println(password);

		System.out.println("은행 비밀번호:"+this.password(0));
	
	}

}