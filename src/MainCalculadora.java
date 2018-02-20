import java.io.*;
import java.util.Scanner;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class MainCalculadora {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String linea = "";
		/*Abrimos el archivo de texto*/
		try {
			
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			/*Condicion para verificar si esta lleno o no*/
			if ((linea=buffer.readLine()) != null) {
				System.out.println("El archivo de texto es: ");
				System.out.println(linea.replace(" ", " "));
				System.out.println("-----------------");
			}
			else {
				/*Si esta vacio se manda el mensaje*/
				System.err.println("El .txt esta vacio");
			}
			entrada.close(); 
		}
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
		
		/*Despliega menu para escoger*/
		System.out.println("Bienvenido");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Escriba una opcion, con la cual quiere hacer los calculos: ");
		System.out.println("1. StackArrayList");
		System.out.println("2. StacKVector");
		System.out.println("3. StackListDouble");
		System.out.println("4. StackListCircular");
		/*Para escoger el menu*/
		String opcion = teclado.nextLine();
		//StackFactory.creandoStack(opcion);
		if(linea == null) {
			/*Si esta vacio se manda el mensaje*/
			System.err.println("El .txt esta vacio");
		}
		/*Ciclo para recorrer el archivo*/
		String lineas = "";
		for(int i=0; i < linea.length(); i++) {
			System.out.println("El resultado es: " + linea + "" + Calculos.instance.calcular(linea));
		}
	}
}
