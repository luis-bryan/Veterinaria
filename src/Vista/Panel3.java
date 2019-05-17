package Vista;

import javax.swing.*;

public class Panel3 extends JPanel {
  JTextArea resultados;
  JScrollPane contenedor;

  public Panel3(){
    resultados = new JTextArea(10,30);
    contenedor = new JScrollPane(resultados);

    resultados.setText("");
    resultados.setEditable(false);
    contenedor.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    contenedor.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    add(contenedor);
  }

  public JTextArea getResultados() {
    return resultados;
  }

  public void setResultados(JTextArea resultados) {
    this.resultados = resultados;
  }
}
