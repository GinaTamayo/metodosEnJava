/*  Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves
 *  sean palabras en inglés y los valores sean las traducciones al español. Permite al usuario ingresar una
 *  palabra en inglés y muestra su traducción en español si está en el diccionario.*/


//NO FUNCIONO
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class DiccionarioSimple {
	static HashMap<String,String> diccionario = new HashMap<String, String>();

	public static void main(String arg[]) {
		crearDiccionario();
		consultar();
		
		
		
	}
	public static void crearDiccionario() {
		
		diccionario.put("dog", "perro");
		diccionario.put("people", "persona");
		diccionario.put("green", "verde");
	}
	public static void consultar() {
		String ingresarPalabraIngles = JOptionPane.showInputDialog("Ingrese una palabra").toLowerCase();
		
		//String traduccion = diccionario.get(ingresarPalabraIngles);
		
		if (diccionario.containsKey(ingresarPalabraIngles)) {
			
			System.out.println("La traduccion es: " +diccionario.get(ingresarPalabraIngles));
		} else {
			System.out.println("La palabra no existe en el diccionario");
		}
	}
}
