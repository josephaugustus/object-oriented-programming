package aula09.salaaula;

public class MySqlConnection implements DBConnection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("Conectado ao MySql: " +
				"\nURL: " + url +
				"\nUsuario: " + username + 
				"\nPassword: " + password);
	}

}
