
public class Demo {
	public static void main(String [] args){
		
		/*
		 * 3.Да се обходим масива и в зависимост от това дали обекта е от тип
		 * Person, Student или Employee да се извика съответно метода
		 * showPersonInfo, showStudentInfo или showEmployeeInfo.
		 * 4.Да се обходи още веднъж масива с хора и за всеки човек, който е
		 * работник, да се изведе на екрана сумата, която му се дължи при 2
		 * часа работа извън работно време.
		 */
		
		Person [] people = new Person[10];
		Person josh = new Person("Josh", 10, true);
		Person jane = new Person("Jane", 18, false);
		Person gosho = new Student("Gosho", 19, true, 4);
		Person geri = new Student("Gergana", 19, false, 5);
		Person Miki = new Employee("Miki", 14, false, 21);
		Person Niki = new Employee("Niki", 21, true, 35);
		
		addPeople(josh, people);
		addPeople(jane, people);
		addPeople(gosho, people);
		addPeople(geri, people);
		addPeople(Miki, people);
		addPeople(Niki, people);
		
		for(int i = 0; i<people.length; i++){
			if(people[i]!=null){
				people[i].showPersonInfo();//sorry for not doing it the way this task wants me to
			}
		}
		for(int i = 0; i<people.length; i++){
			if(people[i] instanceof Employee ){
				Employee a = (Employee) people[i];
				double b = a.calculateOvertime(2.00);
				System.out.println("Emlpoyee " + a.name + " will receive " + b + " for his/her overtime work");
			}
		}

	}
	static void addPeople(Person a, Person[]people){
		for(int i = 0; i < people.length; i++){
			if(people[i]==null){
				people[i] = a;
				break;
			}
		}
	}
}