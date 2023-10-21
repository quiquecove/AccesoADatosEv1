package actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
	public static void main(String[] args) {
		File fl = new File("productos.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(fl))) {
			String linea;
			while ((linea = br.readLine()) != null) {

				String lineaReemplazada = linea.replaceAll("[aeiouAEIOU]", "a");
				System.out.println(lineaReemplazada);
			}
			br.close();
		} catch (IOException e) {
			System.err.println("Error al abrir o procesar el archivo: " + e.getMessage());
		}
		
	}
}
