/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @param <E>
 * @since 19 de febrero 2018
 */
public abstract class AbstractStack<E> implements Stack<E> {
	/*Constructor de la clase no hace nada*/
	public AbstractStack() {}
	/**
	 * @return 
	 * Verifica si esta vacio o no
	 */
	public boolean empty() {
		return size() == 0;
	}
}
