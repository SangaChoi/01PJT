package jb04;

public class Other1{

	jb04.Father unknown=new jb04.Father();

	public Other1(){
		System.out.println(this.unknown.name);
		//System.out.println(f.bank);
		//System.out.println(f.branch);
		//System.out.println(f.password);

		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));

	}
}