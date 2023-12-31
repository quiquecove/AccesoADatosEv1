package actividades;

import java.io.*;
import java.util.Scanner;

public class AsignaturasEj4 implements Serializable {

	int codigoAsignatura;
	String nombre;
	String profesor;
	int horas;

	public AsignaturasEj4(int codigoAsignatura, String nombre, String profesor, int horas) {
		this.codigoAsignatura = codigoAsignatura;
		this.nombre = nombre;
		this.profesor = profesor;
		this.horas = horas;
	}

	public int getCodigoAsignatura() {
		return codigoAsignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getProfesor() {
		return profesor;
	}

	public int getHoras() {
		return horas;
	}

	public static void main(String[] args) throws Exception {
		AsignaturasEj4[] asignaturas = new AsignaturasEj4[1];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("Introduce los datos para la asignatura " + (i + 1) + ":");
			System.out.print("Código de asignatura: ");
			int codigoAsignatura = in.nextInt();
			in.nextLine(); // Consumir la nueva línea

			System.out.print("Nombre de la asignatura: ");
			String nombre = in.nextLine();

			System.out.print("Nombre del profesor: ");
			String profesor = in.nextLine();

			System.out.print("Número de horas: ");
			int horas = in.nextInt();
			in.nextLine(); // Consumir la nueva línea

			asignaturas[i] = new AsignaturasEj4(codigoAsignatura, nombre, profesor, horas);
		}

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("asignaturas.dat"));

			for (AsignaturasEj4 asignatura : asignaturas) {
				oos.writeObject(asignatura);
			}

			oos.close();

			System.out.println("Datos de las asignaturas almacenados en asignaturas.dat.");
//	            // Lectura
	            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("asignaturas.dat"));
	            for (int i = 0; i < asignaturas.length; i++) {
	                AsignaturasEj4 asignatura = (AsignaturasEj4) ois.readObject();
	                System.out.println("Asignatura " + (i + 1) + ":");
	                System.out.println("Código de asignatura: " + asignatura.getCodigoAsignatura());
	                System.out.println("Nombre de la asignatura: " + asignatura.getNombre());
	                System.out.println("Nombre del profesor: " + asignatura.getProfesor());
	                System.out.println("Número de horas: " + asignatura.getHoras());
	                System.out.println();
	            }

	            ois.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
