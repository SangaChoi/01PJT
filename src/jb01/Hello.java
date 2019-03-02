package jb01;

/*
 FileName : Hello.java
*/
public class Hello
{
 //==>1�� �ּ� : �����Ͻ� �ּ����� �����Ͻ� ����
 //java ���࿡ �ʿ��� method : main method
  public static void main(String[] args)
  {
    System.out.println("Hello Java :: �ȳ��ڹ�");
  }//end of main
}//end of class

/*==>���ٹ� �ּ� : �����Ͻ� ����

<<���ǻ��� �� ��ӻ���>>
1. class name�� file name�� �����ؾ� �Ѵ�.
  ��) public class Hello�� ==> Hello.java (File Name)
2. ��ҹ��ڸ� ����
3. ����� public static void main(String[] args) �ʿ�
4. System.out.println(~~~); ==> ~~~ Console ���
5. Hello.java ������ �� Hello.class(Bytecode) ���� Ȯ��

<<Console(DOS ȭ��)���� compile&run>>
1. File save
��FileName : Hello.java ==> FileName�� ClassName�� ����
2. Compile
  1) file ���� directory�� �̵� �� compile ==> javac Ȯ�������� FileName
    c:\work>javac Hello.java
  2) classFile ���� Ȯ�� ==> byte code ����Ȯ�� (Hello.class)
    c:\work>dir
3. ����
  3) run ==> java Ȯ���ڸ� ������ FileName
    c:\work>java Hello

<<EditPlus ȯ�漳�� : ������, ���� ����ϱ�>>
==>����/�������������� ����� �� ����
*/ 