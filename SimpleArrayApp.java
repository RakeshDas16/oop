public class SimpleArrayApp{
	public static void main (String[] args){
		SimpleArray a = new SimpleArray(10);
		a.setElement(10);
		a.setElement(10);
		a.setElement(10);
		a.setElement(20);
		a.setElement(20);
		a.setElement(30);
		a.setElement(40);
		a.setElement(10);
		a.setElement(20);
		//a.printAllElement();
		//System.out.println(a.search(10));
		//a.deleteElement(20);
		a.printAllElement();
		System.out.println("\nDelete Duplicates\n");
		a.deleteDuplicateElement();
		a.printAllElement();
	}
}

class SimpleArray{
	private int array[];
	private int length;

	//Constucter
	SimpleArray(int Size){
		array = new int[Size];
		length = 0;
	}

	//Setters
	public void setElement(int e){
		array[length++] = e;
	}

	//Getter
	public int getLength(){ return length; }
	public int getElement(int pos){ return array[pos]; }

	//Operations
	public boolean search(int ele){
		for(int i = 0; i < length; i++){
			if (array[i] == ele)
				return true;
		}
		return false;
	}
	public void printAllElement(){
		for (int i =0; i < length; i++){
			System.out.println("\n" + array[i]);
		}
	}
	public boolean deleteElement(int ele){
		if (!search(ele)){
			return false;	
		}else{
			for (int i = 0; i < length;){
				if (array[i] ==	ele){
					array[i] = 0;
					int k = i;
					for (int j = i + 1; j < length; j++){
						array[k] = array[j];
						k = j;
					}
					length--;
				}else{
					i++;
				}
			}
		return true;
		}
	}
	public boolean deleteDuplicateElement(){
		for (int l = 0; l < length; l++){
			for (int i = l + 1; i < length;){
				if (array[l] ==	array[i]){
					array[i] = 0;
					int k = i;
					for (int j = i + 1; j < length; j++){
						array[k] = array[j];
						k = j;
					}
					length--;
				}else{
					i++;
				}
			}
		}
		return true;
	}
}
