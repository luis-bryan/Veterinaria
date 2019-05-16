package vista;

import javax.swing.*;

public class Panel1 extends JPanel {
  JLabel ingresarText;
  JTextField cantidad;

  public Panel1(){
    ingresarText = new JLabel("Ingrese la cantidad de Mascotas");
    cantidad = new JTextField();
    add(ingresarText);
    add(cantidad);
  }

}
