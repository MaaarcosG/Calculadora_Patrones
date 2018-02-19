/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public abstract class AbstractList<E> implements List<E> {
	// post: does nothing
	public AbstractList(){}
	
	//post: returns true iff list has no elements
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public boolean contains(E value) {
	// pre: value is not null
    // post: returns true iff list contains an object equal to value
		return -1 != indexOf(value);
	}
}
