package jb08;

import java.io.*;

public class ReaderTest{

	public static void main(String args[]){

		try{
//			InputStream inputStream=System.in;
			Reader reader=new InputStreamReader(System.in);

			System.out.println("�Է��� ��ٸ��ϴ�...");

			while(true){
//				int i=reader.read();
				char c=(char) reader.read();

				System.out.println("�Է��Ͻ� �� : "+c);

				if(c=='x'){
					System.in.close();
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}