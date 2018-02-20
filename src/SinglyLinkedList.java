import java.util.Iterator;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
	/*Atributos de la clase*/
	protected int count; //tamaño de la lista
	protected Node<E> head; //primer elemente de la lista
	
	/*Constructor de la clase*/
	public SinglyLinkedList() {
		count = 0;
		head = null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	/**
	 * @param value
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new Node<E>(value,head);
		count++;
	}
	@Override
	public void clear() {

		// TODO Auto-generated method stub
		
	}
	
	/**
	 * @param value
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value, null);
		if(head != null) {
			Node<E> finger = head;
			while(finger.next() != null) {
				finger = finger.next();
			}
			finger.setNext(temp);
		} else {
			head = temp;
			count ++;
		}
	}
	/**
	 * @param value
	 */
	@Override
	public boolean contains(E value) {
		// pre: value is not null
	    // post: returns true iff value is found in list
		Node<E> finger = head;
		while(finger != null && !finger.value().equals(value)) {
			finger = finger.next();
		}
		return finger != null;
	}
	/**
	 * @return 
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
		head = head.next();	
		count--;
		return temp.value();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
