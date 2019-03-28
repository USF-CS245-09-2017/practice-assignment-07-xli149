import java.util.*;
public class LinkedList<T> implements List<T>{
	//Data Members
	Node head = null;
	int size = 0;
	/** This function is for getting the size of an arrayList
	 */
	public int size(){
		return size;
	}
	/** This function is for adding an element at the end 
	 *	of the linked list.
	 * @param item: the element to be added
	 */
	public void add(T item){
		if(head == null){
			Node<T> newNode = new Node(item);
			head = newNode;
			size++;
		}
		else{
			Node prev = head;
			for(int i = 0; i < size - 1; i++){
				prev = prev.get_next();
			}
			Node<T> newNode = new Node(item);
			prev.set_next(newNode);
			size++;
		}
	}
	/** This function is for adding an element at a specific 
	 * position of the linked list
	 * @param pos: the position that the element to be added into
	 * @param item: the element to be added.
	 */
	public void add(int pos, T item){
		//Assert.not_false(pos > 0 && pos <= size);
		size++;
		if(pos == 0){
			Node node = new Node(item);
			node.set_next(head);
			head = node;
		}
		else{
			Node prev = head;
			for(int i = 0; i < pos -1; i++){
				prev = prev.get_next();
			}
			Node node = new Node(item);
			node.set_next(prev.get_next());
			prev.set_next(node);
		}

	}
	/** This function is for get an element from a specific position
	 * @param pos: The position of the element to get
	 */
	public T get(int pos){
		//Assert.not_false(pos > 0 && pos < size);
		Node curr = head;
		for(int i = 0; i < pos; i++){
			curr = curr.get_next();
		}
		return (T)curr.get_data();
	}
	/** This function is for removing an element from a specific position
	 * @param pos: The position of the element to be removed
	 */
	public T remove(int pos){
		//Assert.not_false(pos >= 0 && pos < size);
		if(pos == 0){
			Node curr = head;
			head = curr.get_next();
			size--;
			return (T)curr.get_data();
		}
		else{
			Node prev = head;
			for(int i = 0; i < pos - 1; i++){
				prev = prev.get_next();
			}
			Node curr = prev.get_next();
			prev.set_next(curr.get_next());
			return (T)curr.get_data();
		}
	}
}