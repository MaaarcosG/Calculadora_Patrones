/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 26 de enero 2018
 */
public class StackFactory {
	public static Stack creandoStack(String opcion) {
		Stack stack = null;
		if(opcion.toLowerCase().equals("StackArrayList")) {
			stack = new StackArrayList();
		} else if(opcion.toLowerCase().equals("StackVector")) {
			stack = new StackVector();
		} else if(opcion.toLowerCase().equals("StackListCircular")) {
			stack = (Stack) new CircularList();
		}
		return stack;
	}
}
