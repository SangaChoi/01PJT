package jb03;
public class Developer2{

		private String name = "홍길동";
		//String name = "홍길동";
		String job = "개발자";
		int avgIncome = 100;
		int projectCareer;
/*
		public void participateProject(){
			System.out.println("프로그램 개발로 수입증가, 경력쌓음");
			avgIncome++;
			projectCareer++;
		}

		public void participateProject(String project){
			System.out.println(project+"==>project 참여로 수입증가, 경력쌓음");
			avgIncome++;
			projectCareer++;
		}

		public void instruct(){
			System.out.println("강의를 통한 수입증가");
			avgIncome++;
		}

		public void instruct(int lectureCount){
			System.out.println(lectureCount+" : 개 강의를 통한 수입증가");
			avgIncome +=lectureCount;
		}
*/
		public String getName(){
			System.out.println("getName() method");
			return name;
		}
		public String getJob(){
			System.out.println("getJob() method");
			return job;
		}
		public int getAvgIncome(){
			System.out.println("getAvgIncome() method");
			return avgIncome;
		}
		public int getProjectCareer(){
			System.out.println("getprojectCareer() method");
			return projectCareer;
		}

		///////////////////////////////////////////main

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

