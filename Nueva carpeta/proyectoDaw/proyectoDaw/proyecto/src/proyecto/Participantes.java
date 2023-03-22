package proyecto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Participantes {
	Connecion conx = new Connecion();
	String nombre;

	// lista para guardar los nombres de participantes

	static ArrayList<String> nombres = new ArrayList<>();

	// una instancia de la clase random
	Random rand = new Random();

	public Participantes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getNombres() {
		return nombres;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

	// metodo para añadir participantes
	public void addParticipantes(String nombre) {
		try {
			nombres.add(nombre);
			System.out.println(nombre + " añadido");
		} catch (Exception e) {
			System.out.println(" no ");
		}

	}

	// selecionar un nombre aleatoeio
	public String elegirPartisipante() {
		// selecionar un nombre aleatoeio

		String nombreElegido = nombres.get(rand.nextInt(nombres.size()));

		return nombreElegido + " " + conx.test1();

	}

}
