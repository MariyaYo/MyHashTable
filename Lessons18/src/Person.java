
public class Person {
	protected String name; //I can use protected right
	protected int age;
	protected boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}else{
			this.name = "Steve";
		}
		if (age >= 0) {
			this.age = age;
		}else{
			this.age = 0;
		}
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.println("Person name: " + name);
		System.out.println("Age: " + age);
		if(isMale){
			System.out.println("Gender: Male");
		}else{
			System.out.println("Gender: Female");
		}
	}
}
