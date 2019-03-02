package jb03;
public class Developer2Test{
	public static void main(String[] args){
		Developer2 developer = new Developer2();

/*		System.out.println("이름은 : "+developer.name);
		System.out.println("직업은 : "+developer.job);
		System.out.println("평균수입은 : "+developer.avgIncome);
		System.out.println("PJT경력은 : "+developer.projectCareer);

		System.out.println("===================");
		*/

//		String name=developer.getName();
//		String job=developer.getJob();
//		int avgIncome=developer.getAvgIncome();
		System.out.println("이름은 : "+developer.getName());
		System.out.println("직업은 : "+developer.getJob());
		System.out.println("평균수입은 : "+developer.getAvgIncome());

		System.out.println("평균수입은 : "+developer.getProjectCareer());
		


	}
}
