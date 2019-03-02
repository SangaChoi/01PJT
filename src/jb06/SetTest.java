//package jp01.part09;

import java.util.HashSet;
import java.util.Set;

/*
	FileName : SetTest
	java.util.Hashset: data의 중복을 허용하지 않는 자료저장
	각각의 set(interface)/HashSet API를 확인하고 각각의 method 의미를 확인
	아래의 출력결과를 이해 확인
*/

public class SetTest{
	public static void main(String[] args){

		Set<String>hs = new HashSet<String>();

		String str = new String("A");
		boolean isAddOk = hs.add(str);
		System.out.println("저장유무:"+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("저장유무:"+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("저장유무:"+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("저장유무:"+isAddOk);

		System.out.println("저장된 data 갯수:"+hs.size());
		if(hs.contains("b")){
			System.out.println("저장된 data b를 삭제함");
			hs.remove("b");
		}
		System.out.println("저장된 data 갯수:"+hs.size());

	

	}//end of main



}//end of class