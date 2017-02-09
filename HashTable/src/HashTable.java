import java.util.LinkedList;

public class HashTable {
	
	Object table[];
	int fullCells = 0;
	
	HashTable(int size){
		table = new Object[size];
	}
	
	void add(Object a){
		int position = hashCode(a);
		if(table[position] != null){
				if(table[position].getClass() == LinkedList.class){
					LinkedList x = (LinkedList)table[position];
					if(!x.equals(a)){
						x.add(a);
						fullCells++;
					}else{
						System.out.println("Nope!");
					}
				}else{
					if(!table[position].equals(a)){
						Object x = table[position];
						LinkedList array = new LinkedList();
						table[position] = array;
						array.add(x);
						array.add(a);
						fullCells++;
					}else{
						System.out.println("Nope!");
					}
				}
			}else{
				table[position] = a;
				fullCells++;
		}
		if(fullCells > (table.length*3/4)){
			rehash(table);
		}
	}
	
	int hashCode(Object a){
		int hach = a.hashCode();
		if(hach <0){
			hach *= -1;
		}
		return hach%table.length;	
	}	
	
	HashTable rehash(Object[] list){
		HashTable list2 = new HashTable(list.length + ((list.length/2)+1)); 
		//current size + (half of it +1)
		for(int i = 0; i<list.length; i++){
			list2.add(list[i]);
		}
		return list2;
		
	}
}
