/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class DoublyLinkedNode<E> {
	/*Atributos de la clase*/
	protected E datos;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElements;
	
	/*Constructor de la clase*/
	public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
		datos = v;
		nextElement = next;
		previousElements = previous;
		if(nextElement != null) {
			nextElement.previousElements = this;
			previousElements = previous;
		}
		if(previousElements != null) {
			previousElements.nextElement = this;
		}
	}
	/**
	 * @param v
	 */
	public DoublyLinkedNode(E v) {
		this(v,null,null);
	}
	/**
	 * @return previousElements
	 */
	public DoublyLinkedNode<E> previous(){
		return previousElements;
	}
	/**
	 * @param nextElement
	 */
	public void setNext(DoublyLinkedNode<E> nextElement) {
		this.nextElement = nextElement;
	}
	/**
	 * @return datos
	 */
	public E value() {
		return datos;
	}
}
