import java.util.Iterator;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class CircularList<E> extends AbstractList<E> {
	/*Lista*/
	protected int count;
	protected Node<E> tails;
	
	/*Constructor de la clase*/
	public CircularList() {
		count = 0;
		tails = null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value);
		if(tails == null) {
			tails = temp;
			tails.setNext(tails.next());
		}
		/*Elementos existentes en la lista*/
		else {
			temp.setNext(tails.next());
			tails.setNext(temp);
		}
		count ++;
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		/*nuevas entradas*/
		addFirst(value);
		tails = tails.next();
		
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

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		Node<E> finger = tails;
		while(finger.next() != tails) {
			
		}
		Node<E> temp = tails;
		if(finger == tails) {
			tails = null;
		} else {
			finger.setNext(tails.next());
			tails = finger;
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
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
