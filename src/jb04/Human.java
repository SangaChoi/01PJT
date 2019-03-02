package jb04;

public class Human{

	String name;
	int age;
/////////////////////Constuctor
	public Human(){
		System.out.println("Human calss defaulf Constructor");
	}
	public Human(String str){
		System.out.println("Human class의 name을 받는 Constructor");
		name=str;
	}
////////////////////////////
	public void setName(String str){
		name=str;
	}
	public void setAge(int b){
		age=b;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

}