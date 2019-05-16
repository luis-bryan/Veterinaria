package Vista;

import javax.swing.*;

public class Panel3 extends JPanel {
  JTextArea resultados;

  public Panel3(){
    resultados = new JTextArea(20,20);
    resultados.setText("");
    add(resultados);
  }

  public JTextArea getResultados() {
    return resultados;
  }

  public void setResultados(JTextArea resultados) {
    this.resultados = resultados;
  }
}
