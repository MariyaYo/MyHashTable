
public class Demo {
	public static void main(String[] args) {
	
		HashTable a = new HashTable(14);
		Pizza pizza1 = new Pizza("Domin's pizza", 'L');
		Pizza pizza2 = new Pizza("Aladin's pizza", 'M');
		Pizza pizza3 = new Pizza("Don Domat's pizza", 'M');
		Pizza pizza4 = new Pizza("Djikov's pizza", 'L');
		
		a.add(pizza1);
		a.add(pizza1);
		a.add(pizza3);
		a.add(pizza4);
		a.add(pizza2);
		
	}
}
