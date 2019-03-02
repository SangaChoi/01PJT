package jb08;

import java.io.*;

public class WriterTest{

	public static void main(String[] args){

		try{
//			InputStream inputStream=System.in;
			Reader reader=new InputStreamReader(System.in);

//			OutputStream outputStream=System.out;
			Writer writer=new OutputStreamWriter(System.out);

			System.out.println("입력을 기다립니다...");

			while(true){
				int i=reader.read();
				writer.write(i);
				writer.flush();

				if((char)i =='x'){
					break;
				}
			}
			//writer.flush();

			//Stream.close();
			reader.close();
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}