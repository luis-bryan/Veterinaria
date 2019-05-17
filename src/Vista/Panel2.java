package Vista;

import javax.swing.*;

public class Panel2 extends JPanel {
  JButton ingresar;
  public Panel2(){
    ingresar = new JButton("Ingresar");
    add(ingresar);
  }

  public JButton getIngresar() {
    return ingresar;
  }

  public void setIngresar(JButton ingresar) {
    this.ingresar = ingresar;
  }
}
