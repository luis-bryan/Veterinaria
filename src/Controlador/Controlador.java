package Controlador;

import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

  private VentanaPrincipal ventanaPrincipal;
  private Vista vista;
  private Mascota registro[];
  private int cantidadAnimales;
  ActionListener oyente;
  private int tamañoArreglo;

  public Controlador() {
    ventanaPrincipal = new VentanaPrincipal();
    vista = new Vista();
    actionListener(this);

    cantidadAnimales = 0;
    vista = new Vista();
  }
  public void ingresarAnimal(int i) {

    registro[cantidadAnimales] = new Mascota();
    String nombre = vista.obtenerNombre(i);
    int edad = vista.obtenerEdad(nombre);
    String dueño = vista.obtenerDueño(nombre);

    registro[cantidadAnimales].setDueño(dueño);
    registro[cantidadAnimales].setEdad(edad);
    registro[cantidadAnimales].setMascota(nombre);

    cantidadAnimales++;
  }

  public String buscarAnimal() {
    String nombre = vista.obtenerNombre();
    String mascota = "";
    for (int i = 0; i < cantidadAnimales; i++) {
      if (registro[i].getMascota().equals(nombre)) {
        mascota = registro[i].toString();
      }
    }
    return mascota;
  }

  public String directorioVeterinaria() {
    String datos = "";
    for (int i = 0; i < cantidadAnimales; i++) {

      String nombre = registro[i].getMascota();
      int edad = registro[i].getEdad();
      String dueño = registro[i].getDueño();
      datos += registro[i].toString() + '\n'+"---------"+'\n';
    }
    return datos;
  }

  public void actionListener(ActionListener escuchador) {
    ventanaPrincipal.getPanel2().getIngresar().addActionListener(escuchador);
    ventanaPrincipal.getPanel4().getBuscar().addActionListener(escuchador);
    ventanaPrincipal.getPanel4().getVerDirectorio().addActionListener(escuchador);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == "Ingresar") {
      String aux = ventanaPrincipal.getPanel1().getCantidad().getText();
      int cantidad = Integer.parseInt(aux);
      tamañoArreglo = cantidad;
      registro = new Mascota[tamañoArreglo];
      for (int i = 0; i < tamañoArreglo; i++) {
        ingresarAnimal(i);
      }
    } else if (e.getActionCommand() == "Ver Directorio") {
      String datos = directorioVeterinaria();
      ventanaPrincipal.getPanel3().getResultados().setText(datos);
    } else if (e.getActionCommand() == "Buscar") {
      String datos = buscarAnimal();
      ventanaPrincipal.getPanel3().getResultados().setText(datos);
    }
  }
}
