import java.util.ArrayList;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class StackArrayList<E> extends AbstractStack<E> {
	/*atributo*/
	protected ArrayList<E> datos;
	
	public StackArrayList() {
		datos = new ArrayList<E>();
	}
	/**
	 * @param E item
	 */
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		// post: the value is added to the stack
		datos.add(item);
	}
	/**
	 * @return datos
	 */
	@Override
	public E pop() {
		// pre: stack is not empty
		// post: most recently pushed item is removed and returned
		return datos.remove(size()-1);
	}

	@Override
	public E peek() {
		// pre: stack is not empty
		// post: top value (next to be popped) is returned
		return datos.get(size()-1);
	}

	@Override
	public int size() {
		// post: returns the number of elements in the stack
		return datos.size();
	}
	
	@Override
	public boolean empty() {
		// post: returns true if and only if the stack is empty
		return size() == 0;
		
	}

}
