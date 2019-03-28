import java.util.*;
public class Node<T>{
	T data;
	Node next;
	public Node(T data){
		this.data = data;
		next = null;
	}
	public void set_next(Node next){
		this.next = next;
	}
	public T get_data(){
		return data;
	}
	public Node get_next(){
		return next;
	}
}