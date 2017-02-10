
public class Demo {
	public static void main(String [] args){
		
		/*
		 * 3.�� �� ������� ������ � � ���������� �� ���� ���� ������ � �� ���
		 * Person, Student ��� Employee �� �� ������ ��������� ������
		 * showPersonInfo, showStudentInfo ��� showEmployeeInfo.
		 * 4.�� �� ������ ��� ������ ������ � ���� � �� ����� �����, ����� �
		 * ��������, �� �� ������ �� ������ ������, ����� �� �� ����� ��� 2
		 * ���� ������ ����� ������� �����.
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