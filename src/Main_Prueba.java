import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 16 de febrero 2018
 */
public class Main_Prueba {
	public static void main(String[] args) {
		/*Atributo de la clase leer*/
		//Calculadora leer = new Calculadora();
		/*Atributo de la clase*/
		String expresion = "";
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			/*Condicion para verificar si esta lleno o no*/
			if ((expresion=buffer.readLine()) != null) {
				System.out.println(expresion.replace(" ", " "));
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
		/*Metodo*/
		//System.out.println("Resultado de los calculos: " + leer.calcular(expresion));
	}
}
