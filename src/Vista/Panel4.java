package Vista;

import javax.swing.*;

public class Panel4 extends JPanel {
  JButton buscar;
  JButton verDirectorio;

  public Panel4(){
    buscar = new JButton("Buscar");
    verDirectorio = new JButton("Ver Directorio");
    add(buscar);
    add(verDirectorio);
  }

}
