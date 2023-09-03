/*Escribe un método sin parámetros y con retorno que genere un número aleatorio entre 1 y 100 
 * y lo devuelva como resultado.*/

import java.util.Random;

import javax.swing.JOptionPane;

public class NumerosAleatorios {
	public static void main(String arg[]) {
		int resultadoNumeroAleatorio = seleccionarNumeroAleatorio();
		JOptionPane.showMessageDialog(null, resultadoNumeroAleatorio);
	}
	public static int seleccionarNumeroAleatorio() {
		Random random = new Random();
		int resultadoNumeroAleatorio = random.nextInt(100) + 1;
		
		return resultadoNumeroAleatorio;
	}

}
