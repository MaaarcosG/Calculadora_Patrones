/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class StackSinglyLinkedList<E> extends AbstractStack<E> {
	/*Atributos de la clase*/
	protected SinglyLinkedList<E> datos; 
	
	public StackSinglyLinkedList() {
		datos = new SinglyLinkedList<E>();
	}
	/**
	 * @param item
	 */
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		datos.addFirst(item);
	}
	/**
	 * @return datos
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return datos.removeFirst();
	}
	/**
	 * @return datos
	 */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return datos.getFirst();
	}
	/**
	 * @return datos
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return datos.size();
	}

}
