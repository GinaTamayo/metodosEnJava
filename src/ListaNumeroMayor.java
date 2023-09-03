import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaNumeroMayor {
		public static void main(String arg[]) {
			ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();
			listaOrdenada.add(7);	
			listaOrdenada.add(14);		
			listaOrdenada.add(23);		
			listaOrdenada.add(5);		
			int numeroSeleccionado = seleccionarNuemroMayor(listaOrdenada);
			JOptionPane.showMessageDialog(null, numeroSeleccionado);
		}
		public static int seleccionarNuemroMayor(ArrayList<Integer> x) {
			int numeroSeleccionado = 0;
			for (int i = 0; i < x.size(); i++) {
				if (x.get(i) > numeroSeleccionado) {
					numeroSeleccionado = x.get(i);
				}
			}
			return numeroSeleccionado;
		}
}
