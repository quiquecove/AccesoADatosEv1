package DAO;

import java.sql.SQLException;

public class DaoActualizar extends dao1 {
//	public void modificarNombre(AlumnoCFGS a) throws SQLException {
//		createStatement = connection.prepareStatement("UPDATE TABLAALUMNOS SET NOMBRE = ?");
//		createStatement.setString(1, a.getNombre());
//		int rowsUpdated = createStatement.executeUpdate();
//
//		if (rowsUpdated > 0) {
//			System.out.println("Nombre modificado con éxito.");
//		} else {
//			System.out.println("No se encontró el registro para modificar.");
//		}
//	}

	public void modificarEdad(AlumnoCFGS a) throws SQLException {
		createStatement = connection.prepareStatement("UPDATE TABLAALUMNOS SET EDAD = ? WHERE NOMBRE = ?");
		createStatement.setByte(1, a.getEdad());
		createStatement.setString(2, a.getNombre());
		int rowsUpdated = createStatement.executeUpdate();

		if (rowsUpdated > 0) {
			System.out.println("Edad modificada con éxito.");
		} else {
			System.out.println("No se encontró el registro para modificar.");
		}
	}

	public void modificarNoGrupo(AlumnoCFGS a) throws SQLException {
		createStatement = connection.prepareStatement("UPDATE TABLAALUMNOS SET NOGRUPO = ? WHERE NOMBRE = ?");
		createStatement.setByte(1, a.getNoGrupo());
		createStatement.setString(2, a.getNombre());
		int rowsUpdated = createStatement.executeUpdate();

		if (rowsUpdated > 0) {
			System.out.println("Número de grupo modificado con éxito.");
		} else {
			System.out.println("No se encontró el registro para modificar.");
		}

	}

	// Implementa métodos similares para modificar los otros campos
	// (ALTURAPROXENMETROS, JUEGAENCONSOLA, HORASENLOL, JUEGOFAVORITO)

//	@Override
//	public void modificarRegistro(AlumnoCFGS a) throws SQLException {
//		// TODO Auto-generated method stub
////		super.modificarRegistro(int id,String nombre,byte edad,byte noGrupo, float altura, boolean juegaConsola, long horasEnLoL,String juegoFavorito);
//		    createStatement = connection.prepareStatement("INSERT INTO TABLAALUMNOS (NOMBRE, EDAD, NOGRUPO, ALTURAPROXENMETROS, JUEGAENCONSOLA, HORASENLOL, JUEGOFAVORITO) VALUES (?, ?, ?, ?, ?, ?, ?)");
//
//		    createStatement.setString(1, a.getNombre());
//		    createStatement.setByte(2, a.getEdad());
//		    createStatement.setByte(3, a.getNoGrupo());
//		    createStatement.setFloat(4, a.getAlturaAproxEnMetros());
//		    createStatement.setBoolean(5, a.isJuegaEnConsola());
//		    createStatement.setLong(6, a.getHorasEnElLOL());
//		    createStatement.setString(7, a.getJuegoFavorito());
//		    createStatement.executeUpdate();
//		    
//		    System.out.println("Registro modificado!!!");
//	}

}