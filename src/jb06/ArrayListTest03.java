import java.util.*;

public class ArrayListTest03
{
	public static void main(String[] args) 
	{
		//ArrayList ���� �� ����(����, ����)�� ��ü�� Data Type ����
		List<String> arrayList = new ArrayList<String>(10);

		//add(E obj) : E�� ���ڷ� �޴´ٴ� �ǹ̴�? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1 = new String("1. ȫ");
		arrayList.add(s1);
		arrayList.add(new String("2. ��"));
		arrayList.add("3. �� �ȳ��ϼ���");

		//ArrayList ����� ���� ���
		for(int i=0; i<arrayList.size(); i++){
			//Generic ������� ������ ����ȯ ���ʿ�
			System.out.print(arrayList.get(i));
			}
			System.out.println("\nJDK 1.5 �߰���� :: Generic, Enhanced For Loop���");
			//���� for���� ���Ͽ� ��������. /JDK 1.5�� �߰��� ��� :: Enhanced For Loop
			//ArrayList ���ο� ����� ���� size()��ŭ �ݺ�, Generic ������� 1EA�� ���� String �ش�.
			for(String value : arrayList){
				System.out.println(value);
			} //end of for
		System.out.println("\n ==> APIȮ��");

		arrayList.add(1,"4. ��");
		for(int i = 0; i<arrayList.size(); i++){

			System.out.println(arrayList.get(i));
			}

		System.out.println("\n ==> APIȮ��");
		arrayList.add(3,"4.ȫ���");

		for(int i = 0; i<arrayList.size(); i++){

		System.out.println(arrayList.get(i));
		}

		System.out.println("\n ==> APIȮ��");
		arrayList.remove(3);

		for(int i = 0; i<arrayList.size(); i++){
		System.out.println(arrayList.get(i));

		}
	}
}