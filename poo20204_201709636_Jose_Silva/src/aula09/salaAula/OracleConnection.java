package aula09.salaaula;

public class OracleConnection implements DBConnection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("Conectado ao Oracle: " +
				"\nURL: " + url +
				"\nUsuario: " + username + 
				"\nPassword: " + password);
	}

}
