package jb02;
public class BreakTest{
	public static void main(String[] args){
		int inputData=Integer.parseInt(args[0]);
		int i=0;
		int sum=0;

		while(true){
			i++;
			sum+=i;

			if(i==inputData){
				break;
			}
		}
		System.out.println("0~"+inputData+"������ ����:"+sum+"�Դϴ�.");
	}
}