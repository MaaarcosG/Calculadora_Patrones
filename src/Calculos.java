/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class Calculos implements CalculadoraI {
	/*Objeto de la misma clase, instanciado*/
	private static Calculos instance;
	private static Stack<Integer> dato = new StackArrayList<Integer>();
	private Stack<Float> stack;
	
	/**
	 * Metodo obtenido de la interfaz de la Calculadora
	 */
	@Override
	public String calcular(String linea) {
		int num2=0;
		int num1=0;
		int resultado=0;
		for(int i=0; i < linea.length(); i++) {
			
			/*Si encuentra u nsigno "+", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/
			if(linea.charAt(i) == '+') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 + num2;
				dato.push(resultado);
			} 
			
			/*Si encuentra u nsigno "-", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(linea.charAt(i) == '-') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 - num1;
				dato.push(resultado);
			}
			
			/*Si encuentra u nsigno "*", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(linea.charAt(i) == '*') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 * num2;
				dato.push(resultado);
			}

			/*Si encuentra u nsigno "/", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(linea.charAt(i) == '/') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 / num1;
				dato.push(resultado);
			}
			
			/*Si el resultado es menor o igual a 0, se añadira un valor numerico a la cadena
			 * para asi tener un dato integer dentro del resultado, y no devolvera un error*/
			if (Character.getNumericValue(linea.charAt(i)) >= 0) {
				int datos = Character.getNumericValue(linea.charAt(i));
				dato.push(datos);
			}
		}
		
		return String.valueOf(resultado);
	}
	/**
	 * Metodo, que devolvera los calculos dependiendo de el tipo de memoria que se utilizara
	 * @param opcion
	 */
	private Calculos(String opcion) {
		stack = StackFactory.creandoStack(opcion);
	}
	/**
	 * Metodo que regresa la instancia
	 */
	public static Calculos getInstance(String opcion) {
		if(instance == null) {
			instance = new Calculos(opcion);
		}
		return instance;
	}

}

