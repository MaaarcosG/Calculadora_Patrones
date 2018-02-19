/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class Node<E>{
	/*Atributo, que alamacena los datos*/
	protected E datos;
	/*Referencia al nodo*/
	protected Node<E> nextElement;
	/**
	 * Constructor de la clase Node
	 * @param v
	 * @param next
	 */
	public Node(E v, Node<E> next) {
		datos = v;
		nextElement = next;
	}
	/**
	 * @param v
	 * post: constructs a new tail of a list with value v
	 */
	public Node(E v) {
		this(v, null);
	}
	/**
	 * @return nextElement
	 * post: returns reference to next value in list
	 */
	public Node<E> next(){
		return nextElement;	
	}
	/**
	 * post: sets reference to new next value
	 * @parama nextElement
	 */
	public void setNext(Node<E> next) {
		nextElement = next;
	}
	/**
	 * @return datos
	 */
	public E value() {
		return datos;
	}
	/**
	 * post: sets value associated with this element
	 * @param value
	 */
	public void setValue(E value) {
		datos = value;
	}
	
}
