package jb03;

public class  MethodSyntaxTestApp
{
	public static void main(String[] args) 
	{
		MethodSyntax methodSyntax = new MethodSyntax();

		System.out.println("\n=====================");
		methodSyntax.browerOn();

		System.out.println("\n=====================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc�۾����� : "+result);

		System.out.println("\n=====================");
		int value = methodSyntax.sum(1,1);
		System.out.println("��� ����� : "+value);
		//System.out.println("��� ����� : "+methodSyntax.sum(1,1));

		System.out.println("\n=====================");
		String name = methodSyntax.getName();
		System.out.println("Field���� name : "+name);
		//System.out.println("Field ���� name : "+methodSyntax.getName());

		System.out.println("\n=====================");
		String add = methodSyntax.getAdd();
		System.out.println("Field���� add : "+add);
		//System.out.println("Field ���� add : "+methodSyntax.getAdd());

		System.out.println("\n=====================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field���� ������");

		for(int i=0 ; i<info.length ; i++){
		//for(int i=0 ; i<2 ; i++){ //<==info.length�� ���� 2�� ������?
			
			System.out.println((i+1)+"��° ���� : "+info[i]);
		}

	}

}