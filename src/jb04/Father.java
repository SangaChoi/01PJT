package jb04;

public class Father{

///////////////Field
	public String name="홍길동";
	protected String bank="한양은행";
	String branch="역삼동 지점";
	private int password=1234;

///////////////Constuctor
	public Father(){
	}
///////////////////Method
	public String getBank(int pwd){
		if (pwd !=7777){
			return ("key값을 정확히 입력하세요.");
		}else{
			return this.bank;
		}
	}

	public int getPassword(int key){
		if(key !=7777){
			return 0;
		}else{
			return this.password;
		}
	}

	public String getName(){
		return name;
	}

	public String getBranch(){
		return branch;
	}

}
