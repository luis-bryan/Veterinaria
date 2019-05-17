package Vista;

import javax.swing.JOptionPane;

public class Vista {

  public String obtenerNombre(int i) {
    String a = "";
    a = JOptionPane.showInputDialog("Ingrese nombre de la mascota #" + (i+1));
    return a;
  }
  public String obtenerNombre() {
    String a = "";
    a = JOptionPane.showInputDialog("Ingrese nombre de la mascota a buscar");
    return a;
  }

  public String obtenerDueño(String a) {
    String r = "";
    r = JOptionPane.showInputDialog("Ingrese el nombre del dueño de " + a);
    return r;
  }

  public int obtenerEdad(String a) {
    int r = 0;
    String aux = JOptionPane.showInputDialog("Ingrese la edad de " + a);
    r = Integer.parseInt(aux);
    return r;
  }

}
