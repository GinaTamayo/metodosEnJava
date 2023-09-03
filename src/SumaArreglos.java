/*Escribe un método con parámetros y con retorno que reciba dos arreglos de enteros del 
 *mismo tamaño y devuelva un nuevo arreglo que contenga la suma de los elementos de ambos arreglos.*/

import javax.swing.JOptionPane;

public class SumaArreglos {
	public static void main(String arg[]) {
		int []primerArreglo = {2,4,6,8,10};
		int []segundoArreglo = {3,6,9,12,15};
		int []resultado = sumaDeLosArreglos(primerArreglo, segundoArreglo);
		JOptionPane.showMessageDialog(null, resultado[0]);
	}
	public static int[] sumaDeLosArreglos (int[]x, int[]y) {
		int [] resultado = new int[1];
		for (int i = 0; i < x.length; i++) {
				resultado[0] += x[i] + y[i];
		}
		
		return resultado;
	}
}
