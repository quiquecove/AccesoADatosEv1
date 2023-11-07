package DAO;

import java.sql.SQLException;

public class DaoCrearTabla extends dao1 {

	public DaoCrearTabla() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() throws SQLException {
		super.createTable();
		createStatement = connection.prepareStatement(
				"CREATE TABLE TABLAALUMNOS(ID INTEGER IDENTITY PRIMARY KEY, NOMBRE VARCHAR(15), EDAD TINYINT, NOGRUPO TINYINT, ALTURAPROXENMETROS FLOAT, JUEGAENCONSOLA BOOLEAN, HORASENLOL BIGINT, JUEGOFAVORITO VARCHAR(25))");
		createStatement.execute();
	}

}
