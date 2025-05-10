package ar.edu.unlp.info.oo1.oo2.Patrones.Ej17;

import java.util.Collection;
import java.util.List;

public class DatabaseLoginAccess implements DatabaseAccess{
	private DatabaseRealAccess database;
	private boolean logued;
	private String contraseña;
	
	public DatabaseLoginAccess(DatabaseRealAccess database, String contraseña) {
		super();
		this.database = database;
		this.contraseña = contraseña;
		logued = false;
	}

	private void login(String contraseña) {
		logued = this.contraseña.equals(contraseña);
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		Collection<String> results = null;
		if(logued) {
			results=database.getSearchResults(queryString);
		}
		return results;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		int id = -1;
		if(logued) {
			id=database.insertNewRow(rowData);
		}
		return id;
	}
	
}
