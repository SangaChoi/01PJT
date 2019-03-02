public class StringTest03 
{
	public static void main(String[] args) 
	{
		String name= "012ABCdef";
		String hi = "Hi !";

		String s1 = hi.concat(name);
		System.out.println("s1: "+s1);

		String s2 = s1.substring(7);
		System.out.println("s2: "+s2);

		int a = name.indexOf("ABC");
		System.out.println("a: "+a);
		System.out.println(name.substring(a));

		int b = name.indexOf("ABC");
		System.out.println("b: "+b);
		System.out.println(name.substring(b));
		System.out.println(name.substring(b,5));

		int c = name.indexOf("z");
		System.out.println("c: "+c);
	}
}
