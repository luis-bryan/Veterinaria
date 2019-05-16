package Controlador;

import javax.swing.JOptionPane;

import Modelo.*;
import Vista.*;

public class Controlador {

	private Vista vista;
	private Mascota registro[];
	private int cantidadAnimales;
	
	public int tamañoarreglo() {
		int tamañoarreglo=0;
		String aux = JOptionPane.showInputDialog("Ingrese el tamaño de su registro: ");
		return tamañoarreglo= Integer.parseInt(aux);
		
	}

	public Controlador() {
		registro = new Mascota[tamañoarreglo()];
		cantidadAnimales = 0;
		vista = new Vista();
		funcionar();
	}

	public void funcionar() {
		int opcion = 0;
		do {

			try {
				opcion = vista.menuPrincipal();
				switch (opcion) {
				case 1:
					ingresarAnimal();
					break;

				case 2:
					buscarAnimal();
					break;
				case 3:
					directorioVeterinaria();
					break;
				case 4:
					salir();
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Opcion incorrecta", "MENSAJE DE ERROR",
						JOptionPane.WARNING_MESSAGE);
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "No se encuentra la mascota", "MENSAJE DE ERROR",
						JOptionPane.WARNING_MESSAGE);
			}

		} while (opcion != 4);

	}

	public void ingresarAnimal() {
		registro[cantidadAnimales] = new Mascota();
		String nombre = vista.obtenerNombre();
		int edad = vista.obtenerEdad(nombre);
		String dueño = vista.obtenerDueño();

		registro[cantidadAnimales].setDueño(dueño);
		registro[cantidadAnimales].setEdad(edad);
		registro[cantidadAnimales].setMascota(nombre);

		cantidadAnimales++;

		vista.imprimirMensaje("Se ha completado el registro");

	}

	public void buscarAnimal() {
		String nombre = vista.obtenerNombre();
		for (int i = 0; i <= cantidadAnimales; i++) {
			if (registro[i].getMascota().equals(nombre)) {

				vista.imprimirMensaje("" + registro[i]);
			}

		}
	}

	public void directorioVeterinaria() {
		String datos = "";
		for (int i = 0; i < cantidadAnimales; i++) {
			
			String nombre = registro[i].getMascota();
			int edad = registro[i].getEdad();
			String dueño = registro[i].getDueño();
			datos = datos + "Nombre de tu mascota: " + nombre + "\n\nEdad de tu mascota: " + edad + "\n\nDueño: "
					+ dueño + "\n\n\n";

		}
		System.out.println(datos);
		vista.imprimirMensaje(datos);
	}

	public void salir() {
		JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "ALERTA!", JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE);
	}

}
