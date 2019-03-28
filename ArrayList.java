import java.util.*;
public class ArrayList<T> implements List<T>{
	//Data Members
	Object []temp = new Object[10]; 
	T []arr;
	int size;
	//constructor
	public ArrayList(){
		size = 0;
		arr = (T[]) temp;
	}
	/** This function is for adding an element at the end 
	 *	of an arrayList.
	 * @param item: the element to be added
	 */
	public void add(T item){
		if((size % arr.length) == 0){
			growArray();
		}
		arr[size++] = item;
	}
	/** This function is for adding an element at a specific 
	 * position of an arraylist
	 * @param pos: the position that the element to be added into
	 * @param item: the element to be added.
	 */
	public void add(int pos, T item){

		//Assert.not_false(pos > 0 && pos < size);
		if((size % arr.length) == 0){
			growArray();
		}
		shiftforward(pos);
		arr[pos] = item;
		size++;
	}
	/** This function is for get an element from a specific position
	 * @param pos: The position of the element to get
	 */
	public T get(int pos){
		//Assert.not_false(pos > 0 && pos < size);
		return arr[pos];
	}
	/** This function is for removing an element from a specific position
	 * @param pos: The position of the element to be removed
	 */
	public T remove(int pos){
		T temp1;

		//Assert.not_false(pos > 0 && pos < size);
		temp1 = arr[pos];

		shiftback(pos);

		
		size--;
		return (T)temp1;
	}
	/** This function is for getting the size of an arrayList
	 */
	public int size(){
		return size;
	}
	/*The function for resizing the array*/
	public void growArray(){
		Object []temp2 = new Object[arr.length * 2];
		T [] tempArr = (T[])temp2;
		for (int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];			
		}
		arr = tempArr;
	}
	/** The function for shifting elements backward one position
	 * from the current position to the end of the array
	 * @param index: The position the array started to shift its 
	 * elements backward.
	 */
	public void shiftback(int index){
		if(size == 1 || index == size - 1){
			return;
		}
		for(int i = index; i <= size; i++){
			arr[i] = arr[i + 1];
		}
	}
	/** The function for shifting elements forward one position
	 * from the end of the array to the the current position
	 * @param index: The position the array will shift its 
	 * elements forward towards.
	 */
	public void shiftforward(int index){
		if(size == 0 || index == size){
			return;
		}
		for(int i = size -1; i <= index; i++){
			arr[i+1] = arr[i];
		}
	}


}