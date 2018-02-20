import java.util.Iterator;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 * references, referenceshttp://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
	/*Atributo de la clase*/
	protected int count; 
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tails;
	
	/*Constructor de la clase*/
	public DoublyLinkedList() {
		count = 0;
		head = null;
		tails = null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	/**
	 * Agrega el primer dato de el linked 
	 * @param value
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new DoublyLinkedNode<E>(value,head,null);
		if(tails.equals(head)) {
			tails = head;
			count++;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Agregra el ultimo dato de el linked
	 * @param value
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		tails = new DoublyLinkedNode<E>(value,null,tails);
		if(head.equals(null)) {
			head = tails;
			count++;
		}
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Remueva el ultimo dato de el linked
	 * @return el valor actual del nodo
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		DoublyLinkedNode<E> temp = tails;
		tails = tails.previous();
		if(tails.equals(null)) {
			head = null;
		} else {
			tails.setNext(null);
		}
		count --;
		return temp.value();
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
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

}
