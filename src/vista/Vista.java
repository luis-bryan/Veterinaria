package vista;

import javax.swing.JOptionPane;

public class Vista {

	public int menuPrincipal() {
		int op = 0;

		do {
			String r = "Seleccione operacion que desea realizar: \n\n" + "\t1.Registrar Mascota\n"
					+ "\t2.Mostrar Mascota\n"
					+ "\t3.Salir" + "\nOpción: ";
			String aux = JOptionPane.showInputDialog(r);
			op = Integer.parseInt(aux);
			if (op < 0 || op > 3) {
				JOptionPane.showMessageDialog(null, "Opcion ingresada es invalida", "MENSAJE DE ERROR",
						JOptionPane.WARNING_MESSAGE);
			}
		} while (op < 0 || op > 3);
		return op;
	}

	public String obtenerNombre() {
		String a = "";
		a = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
		return a;
	}

	public String obtenerDueño() {
		String r = "";
		r = JOptionPane.showInputDialog("Ingrese el nombre del dueño");
		return r;
	}

	public int obtenerEdad(String a) {
		int r = 0;
		String aux = JOptionPane.showInputDialog("Ingrese la edad de " + a);
		r = Integer.parseInt(aux);
		return r;
	}

	public void imprimirMensaje(String a) {
		JOptionPane.showMessageDialog(null, a);
	}
}
