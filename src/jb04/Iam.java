package jb04;

public class Iam extends Human{
	int age;

	String job;

///////////////Constuctor
	public Iam(){
		System.out.println("Iam class default Constructor");
	}


/////////////////Method

	public void setJob(String str){
		job=str;
	}

	public String getJob(){
		return job;
	}

////////////////////main
	public static void main(String args[]){

		Iam iam=new Iam();

		
/*		iam.setName("ȫ�浿");
		iam.setAge(100);
		iam.setJob("������");

		System.out.println("�̸� : "+iam.getName());
		System.out.println("���� : "+iam.getAge());
		System.out.println("���� : "+iam.getJob());
		*/
		
	}

}