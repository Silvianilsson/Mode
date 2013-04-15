package blog;
public class author {
	public String name = "";
	public String age = "";
	public String email = "";
	
	public void print()
	{
		System.out.println("Mitt namn är " + name + " och är " + age + " år " + " mitt email adress är " + email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		print();
		return "hej";
	}
	
	

}
