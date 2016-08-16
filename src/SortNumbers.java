import java.util.Vector;


public class SortNumbers {
	
	
	public static void display( Vector<Integer> randNumber){
		System.out.println("");
		
		for(int i= (0); i<randNumber.size(); ++i){
			System.out.println(randNumber.get(i));
		}
	}

	public static void bubbleSort ( Vector<Integer> randNumber){
		int tmp_buffer = (0);
		int result = (0);
		
		
		//for loop for x
		for (int x = (0); x < (randNumber.size()); ++x){
			
			//for loop for y
			for (int y = (0); y < (randNumber.size()-1); ++y){
				result = randNumber.get(y).compareTo(randNumber.get(y + 1));
				
				if(result < 0){
					tmp_buffer = (randNumber.get(y + 1));
					randNumber.set(y + 1, randNumber.get(y));
					randNumber.set(y, tmp_buffer );
					
				}
			}
			
		}

	}
	
	public static void main(String[] args) {
		 
		//BubbleSort bs = new BubbleSort();

Vector<Integer> randNumber = (new Vector<Integer>());
		
		randNumber.addElement(new Integer(-5));
		randNumber.addElement(new Integer(-4));
		randNumber.addElement(new Integer(-2));
		randNumber.addElement(new Integer(-1));
		randNumber.addElement(new Integer(1));
		randNumber.addElement(new Integer(2));
		randNumber.addElement(new Integer(3));
		randNumber.addElement(new Integer(4));
		randNumber.addElement(new Integer(5));
		randNumber.addElement(new Integer(6));
		randNumber.addElement(new Integer(7));
		randNumber.addElement(new Integer(-15));
		randNumber.addElement(new Integer(-9));
		randNumber.addElement(new Integer(14));
		randNumber.addElement(new Integer(20));
		randNumber.addElement(new Integer(16));
		randNumber.addElement(new Integer(11));
		randNumber.addElement(new Integer(10));
		randNumber.addElement(new Integer(19));
		
		display(randNumber);
		bubbleSort(randNumber);
		display(randNumber);
	}

}
