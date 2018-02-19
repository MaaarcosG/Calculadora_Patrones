import java.util.Vector;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class StackVector<E> extends AbstractStack<E> {
	/*Atributos de la clase*/
	protected Vector<E> datos;
	
	/*Constructor de la clase*/
	public StackVector() {
		datos = new Vector<E>();
	}
	
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		datos.addElement(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return datos.remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return datos.get(size()-1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return datos.size();
	} 

}
