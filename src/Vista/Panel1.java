package Vista;

import javax.swing.*;

public class Panel1 extends JPanel {
  JLabel ingresarText;
  JTextField cantidad;

  public JLabel getIngresarText() {
    return ingresarText;
  }

  public void setIngresarText(JLabel ingresarText) {
    this.ingresarText = ingresarText;
  }

  public JTextField getCantidad() {
    return cantidad;
  }

  public void setCantidad(JTextField cantidad) {
    this.cantidad = cantidad;
  }

  public Panel1(){
    ingresarText = new JLabel("Ingrese la cantidad de Mascotas");
    cantidad = new JTextField(10);
    add(ingresarText);
    add(cantidad);
  }

}
