package jb02;

public class ForTest{
	///main method
	public static void main(String args[]){
		int j=5;
		System.out.println(j+"단을 출력합니다.");

		for(int i=1; i<10 ; i++){
			System.out.println(j+"*"+i+"="+j*i);
		}

		int k=1;
		while(k<10){
			System.out.println("5*"+k+"="+5*k);
			k++;
		}

//	    System.out.println("i의 최종변경 값:"+i);
//		System.out.println("k의 최종변경 값:"+k);

		for( ; ; ){
			//System.out.println("여기는 반복문내부의 무한 루프");
		}//==>아래 주석을 풀면 컴파일 에러 발생
		//System.out.println("error가 발생한다. 이유는...);
	}
}