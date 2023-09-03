/*Crea un programa que permita a un profesor registrar las notas de sus estudiantes. Utiliza un HashMap donde
las claves sean los nombres de los estudiantes y los valores sean las notas correspondientes. El programa debe
permitir al profesor agregar estudiantes y asignar sus notas, así como también consultar la nota de un estudiante
específico.*/

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Notas {
	HashMap<String, ArrayList<Double>> notasEstudiantesMap;
	int cantidadEstudiantes;
	ArrayList<String> estudiantes = new ArrayList<String>();
	
	 
	public Notas () {
		 notasEstudiantesMap = new HashMap<String, ArrayList<Double>>();
		 iniciar();
	}
	
	
	
	public void iniciar() {
		cantidadEstudiantes =  Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de estudiantes"));
		llenarNotasEStudiantesMap();
		notaFinal(estudiantes);
	}
	
	
	public void llenarNotasEStudiantesMap() {
		ArrayList<Double> notasLista = null;
		String nombre= "";
		int cantidadValidados= 0;
		int cantidadNotas = 0;
		
		for (int i = 0; i < cantidadEstudiantes; i++) {
			nombre = JOptionPane.showInputDialog("Ingresar el nombre del estudiante " +(i+1));
			estudiantes.add(nombre);	
			notasLista = new ArrayList<Double>();
			//contador de estudiantes validados
			cantidadValidados ++;
			double nota;
			
			for (int j = 0; j < 3; j++) {
				do {
					nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " +(j+1)+ "para el estudiante o la estudiante"));
            //validación del rango de la nota
				} while (nota < 0 || nota > 5);
				notasLista.add(nota);
				//contador notas estudiantes
				cantidadNotas++;
			}
			
			System.out.println("Nombre de estudiante: "+nombre);
			System.out.println("Notas: "+notasLista);
			notasEstudiantesMap.put(nombre, notasLista);
			
		}
		//pasar parametros
		contadorEstudiantesValidados(cantidadValidados);
		contadorNotasEstudiantes(cantidadNotas);
		
	}
	
	public  void consultarEstudiante(String nombreEstudiante) {
					
			if (notasEstudiantesMap.containsKey(nombreEstudiante)) {
				ArrayList<Double> listaDeNotasTemp = notasEstudiantesMap.get(nombreEstudiante);
				double suma = 0;

						for (int i = 0; i < listaDeNotasTemp.size(); i++) {
							suma += listaDeNotasTemp.get(i);
						}
						
						double promedio = suma/listaDeNotasTemp.size();
						System.out.println("El promedio de : "+nombreEstudiante);
			} else {
				System.out.println("El estudiante "+ nombreEstudiante + " no se encuentra registrado");
			}
	}
	
	
	
	
	public void contadorEstudiantesValidados(int x) {
		System.out.println("La cantidad de estudiantes validados es: "+x);
	}
	public void contadorNotasEstudiantes(int y) {
		System.out.println("La cantidad de notas ingresadas es: "+y);

	}
	
	
	
	public void notaFinal(ArrayList<String> estudiantes) {
		int estudiantesQueAprovaron = 0;
		int estudiantesQueRecuperan = 0;
		int estudiantesQueReprovaron = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			String estudiante = estudiantes.get(i);
			if (notasEstudiantesMap.containsKey(estudiante)) {
				double promedio = calcularPromedio(estudiante);
				
				if (promedio >= 3.5) {
					estudiantesQueAprovaron++;
				} else if (promedio >= 2) {
					estudiantesQueRecuperan++;
				} else {
					estudiantesQueReprovaron++;
				}
				System.out.println(estudiante + ": promedio: " + promedio);
			}
		}
		System.out.println("La cantidad de estudiantes que aprovaron la materia: " + estudiantesQueAprovaron);
		System.out.println("La cantidad de estudiantes que pueden recuperar la materia: " + estudiantesQueRecuperan);
		System.out.println("La cantidad de estudiantes que reprovaron la materia: " + estudiantesQueReprovaron);			
	}
	
	public double calcularPromedio(String nombreEstudiante) {
		if (notasEstudiantesMap.containsKey(nombreEstudiante)) {
			ArrayList<Double> listaDeNotasTemp = notasEstudiantesMap.get(nombreEstudiante);
			double suma = 0;

					for (int i = 0; i < listaDeNotasTemp.size(); i++) {
						suma += listaDeNotasTemp.get(i);
					}
					return suma/listaDeNotasTemp.size();
		}
		return -1;
	}
}