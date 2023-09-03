     /*Escribe un método con parámetros y sin retorno que reciba un número 
	 *entero y lo imprima en pantalla si es mayor que 10.*/

import javax.swing.JOptionPane;

public class NumeroEntero {
	public static void main (String arg[]) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
		numeroMayorADiez(num);
	}
	public static void numeroMayorADiez(int num) {
		if (num > 10) {
			System.out.println(num);
		}
	} 
}
