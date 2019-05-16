package controlador;

import javax.swing.JOptionPane;

import modelo.Mascota;
import vista.VentanaPrincipal;
import vista.Vista;

public class Controlador {

	private VentanaPrincipal vista;
	private Mascota registro[];
	private int cantidadAnimales;

	public Controlador() {
		registro = new Mascota[10];
		cantidadAnimales = 0;
		vista = new VentanaPrincipal();
//		funcionar();
	}

//	public void funcionar() {
//		int opcion = 0;
//		do {
//
//			try {
//				opcion = vista.menuPrincipal();
//				switch (opcion) {
//				case 1:
//					ingresarAnimal();
//					break;
//
//				case 2:
//					buscarAnimal();
//					break;
//				case 3:
//					salir();
//					break;
//				}
//			} catch (NumberFormatException e) {
//				JOptionPane.showMessageDialog(null, "Opcion incorrecta", "MENSAJE DE ERROR",
//						JOptionPane.WARNING_MESSAGE);
//			} catch (NullPointerException e) {
//				JOptionPane.showMessageDialog(null, "No se encuentra la mascota", "MENSAJE DE ERROR",
//						JOptionPane.WARNING_MESSAGE);
//			}
//
//		} while (opcion != 3);
//
//	}
//
//	public void ingresarAnimal() {
//		registro[cantidadAnimales] = new Mascota();
//		String nombre = vista.obtenerNombre();
//		int edad = vista.obtenerEdad(nombre);
//		String dueño = vista.obtenerDueño();
//
//		registro[cantidadAnimales].setDueño(dueño);
//		registro[cantidadAnimales].setEdad(edad);
//		registro[cantidadAnimales].setMascota(nombre);
//
//		cantidadAnimales++;
//
//		vista.imprimirMensaje("Se ha completado el registro");
//
//	}
//
//	public void buscarAnimal() {
//		String nombre = vista.obtenerNombre();
//		for (int i = 0; i <= cantidadAnimales; i++) {
//			if (registro[i].getMascota().equals(nombre)) {
//
//				vista.imprimirMensaje("" + registro[i]);
//			}
//
//		}
//	}
//
//	public void salir() {
//		JOptionPane.showConfirmDialog(null, "�Esta seguro que desea salir?", "ALERTA!", JOptionPane.YES_NO_OPTION,
//				JOptionPane.ERROR_MESSAGE);
//	}

}
