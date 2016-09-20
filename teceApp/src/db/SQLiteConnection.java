package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteConnection {

	public static Connection connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("test");
			Connection connection = DriverManager
					.getConnection("jdbc:sqlite:C:\\Users\\IBM_ADMIN\\workspace\\teceApp\\src\\ui\\tece.db");
			return connection;
		} catch (Exception e) {
			System.out.println("A picat...");
			return null;
		}
	}

}
