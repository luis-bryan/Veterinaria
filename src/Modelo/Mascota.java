package Modelo;

public class Mascota {

	// ATRIBUTOS
	private String mascota;
	private String dueño;
	private int edad;

	public Mascota() {
		mascota = "";
		dueño = "";
		edad = 0;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota:\n\n" + "Nombre: " + mascota + "\nEdad: " + edad + " años" + "\nDueño: " + dueño;
	}

}
