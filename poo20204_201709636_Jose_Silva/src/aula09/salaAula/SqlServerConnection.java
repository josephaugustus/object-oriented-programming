package aula09.salaaula;

public class SqlServerConnection implements DBConnection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("Conectado ao SQL Server: " +
				"\nURL: " + url +
				"\nUsuario: " + username + 
				"\nPassword: " + password);
	}

}
