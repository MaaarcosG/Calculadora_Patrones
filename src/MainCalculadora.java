import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 19 de febrero 2018
 */
public class MainCalculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
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
		Calculos.getInstance(opcion);
		
		/*Datos del archivo de texto*/
		String path = "src/datos.txt";
		List<String> lineas = leerArchivo(path);
		if(lineas == null) {
			/*Si esta vacio se manda el mensaje*/
			System.err.println("El .txt esta vacio");
		}
		/*Ciclo para recorrer el archivo*/
		String linea = "";
		for(int i=0; i < linea.length(); i++) {
			System.out.println("El resultado es: " + linea + Calculos.getInstance(opcion).calcular(linea));
		}
	}
	public static List<String> leerArchivo(String path){
		try {
			return (List<String>) Files.readAllLines(Paths.get(path), Charset.defaultCharset());
		
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
		return null;
	}
}
