package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
  Panel1 panel1;
  Panel2 panel2;
  Panel3 panel3;
  Panel4 panel4;
  PTitulo titulo;
  public VentanaPrincipal(){
    setResizable(false);
    setSize(400,400);
    setLayout(new FlowLayout());

    titulo = new PTitulo();
    add(titulo);
    panel1 = new Panel1();
    add(panel1);
    panel2 = new Panel2();
    add(panel2);
    panel3 = new Panel3();
    add(panel3);
    panel4 = new Panel4();
    add(panel4);
    setVisible(true);
    setLocationRelativeTo(null);
  }

  public Panel1 getPanel1() {
    return panel1;
  }

  public void setPanel1(Panel1 panel1) {
    this.panel1 = panel1;
  }

  public Panel2 getPanel2() {
    return panel2;
  }

  public void setPanel2(Panel2 panel2) {
    this.panel2 = panel2;
  }

  public Panel3 getPanel3() {
    return panel3;
  }

  public void setPanel3(Panel3 panel3) {
    this.panel3 = panel3;
  }

  public Panel4 getPanel4() {
    return panel4;
  }

  public void setPanel4(Panel4 panel4) {
    this.panel4 = panel4;
  }
}
