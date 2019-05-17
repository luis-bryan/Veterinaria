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

  public JButton getBuscar() {
    return buscar;
  }

  public void setBuscar(JButton buscar) {
    this.buscar = buscar;
  }

  public JButton getVerDirectorio() {
    return verDirectorio;
  }

  public void setVerDirectorio(JButton verDirectorio) {
    this.verDirectorio = verDirectorio;
  }
}
