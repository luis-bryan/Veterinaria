package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
  Panel1 panel1;
  Panel2 panel2;
  Panel3 panel3;
  Panel4 panel4;

  public VentanaPrincipal(){
    setResizable(false);
    setSize(400,400);
    setLayout(new GridLayout(5,1));
    panel1 = new Panel1();
    add(panel1);
    panel2 = new Panel2();
    add(panel2);
    panel3 = new Panel3();
    add(panel3);
    panel4 = new Panel4();
    add(panel4);
    setVisible(true);
  }
}
