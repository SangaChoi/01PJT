//package jp01.part09;

import java.util.HashSet;
import java.util.Set;

/*
	FileName : SetTest
	java.util.Hashset: data�� �ߺ��� ������� �ʴ� �ڷ�����
	������ set(interface)/HashSet API�� Ȯ���ϰ� ������ method �ǹ̸� Ȯ��
	�Ʒ��� ��°���� ���� Ȯ��
*/

public class SetTest{
	public static void main(String[] args){

		Set<String>hs = new HashSet<String>();

		String str = new String("A");
		boolean isAddOk = hs.add(str);
		System.out.println("��������:"+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("��������:"+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("��������:"+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("��������:"+isAddOk);

		System.out.println("����� data ����:"+hs.size());
		if(hs.contains("b")){
			System.out.println("����� data b�� ������");
			hs.remove("b");
		}
		System.out.println("����� data ����:"+hs.size());

	

	}//end of main



}//end of class