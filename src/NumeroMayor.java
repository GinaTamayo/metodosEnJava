/*Escribe un método con parámetros y con retorno que reciba un arreglo de enteros y devuelva 
 * el valor máximo del arreglo.*/

import javax.swing.JOptionPane;

public class NumeroMayor {
	public static void main(String arg[]) {
		int []arreglo = {5,10,30,15};
		int numeroSeleccionado = seleccionarNuemroMayor(arreglo);
		JOptionPane.showMessageDialog(null, numeroSeleccionado);
	}
	public static int seleccionarNuemroMayor(int[] x) {
		int numeroSeleccionado = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > numeroSeleccionado) {
				numeroSeleccionado = x[i];
			}
		}
		return numeroSeleccionado;
	}
}
