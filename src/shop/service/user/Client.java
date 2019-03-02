package shop.service.user;

public class Client {
	private String name;
	protected int age;
	String add;
	public boolean gender;
	public static final String nationallity="´ëÇÑ¹Î±¹";

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String name, int age, String add, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

//	@Override
//	public String toString() {
//		return "Client [name=" + name + ", age=" + age + ", add=" + add + ", gender=" + gender + "]";
//	}

}
