package jb04;
class JuniorHighSchool{

	String name="���ѹα� ���б�";

	public JuniorHighSchool(){
	}

	public void schoolName(){
		System.out.println("���б� �̸� : "+name);
	}
}
////////////////////////////////////////////////////////////////////////////
class HighSchool extends JuniorHighSchool{

	String name="���ѹα� �����б�";

	public HighSchool(){
	}

	public HighSchool(String str){
		name=str;
	}

	//public HighSchool(String name){
//		this.name=name;
//	}

	public void schoolName(){
	System.out.println("���б� �̸� : "+super.name);
	System.out.println("�����б� �̸� : "+this.name);
	System.out.println("�����б� �̸� : "+name);

	}
}
///////////////////////////////////////////////////////////////////////////////
public class SuperThisTest{

	public static void main(String[] args){
		HighSchool hs01=new HighSchool();
		hs01.schoolName();

		System.out.println("======================");

		HighSchool hs02=new HighSchool("��������б�");
		hs02.schoolName();
	}
}