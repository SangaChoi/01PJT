package jb08;
import java.io.*;

public class UserVO implements Serializable{

	//field
	private int no;
	private String name;

	//constructor
	public UserVO(){
	}
	public UserVO(int no, String name){
		this.no = no;
		this.name = name;
	}

	//method
	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}

	@Override 
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [no=");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}