package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import db.SQLiteConnection;

public class CatalogItem {

	private final String clasaCol;
	private final String codProdusCol;
	private final String denumireCol;
	private final float pretCol;
	private final String UMcol;

	public CatalogItem(String clasa, String codProdus, String denumire, float pret, String um) {
		this.clasaCol = clasa;
		this.codProdusCol = codProdus;
		this.denumireCol = denumire;
		this.pretCol = pret;
		this.UMcol = um;
	}

	public String getClasaCol() {
		return clasaCol;
	}

	public String getCodProdusCol() {
		return codProdusCol;
	}

	public String getDenumireCol() {
		return denumireCol;
	}

	public float getPretCol() {
		return pretCol;
	}

	public String getUMcol() {
		return UMcol;
	}

	// public static ObservableList<COA> getAllCOA(){
	public static List<CatalogItem> getAllstudentInfo() {
		List ll = new LinkedList();
		try {
			Connection connection = SQLiteConnection.connector();
			PreparedStatement statement = connection.prepareStatement("select * from TECE_APP");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				String clasa = result.getString("CLASA");
				String codProdus = result.getString("COD");
				String denumire = result.getString("DENUMIRE");
				float pret = result.getFloat("PRET");
				String um = result.getString("UM");
				ll.add(new CatalogItem(clasa, codProdus, denumire, pret, um));
			}
		} catch (SQLException ex) {
			System.out.println("Error when reading from db");
		}
		return ll;
	}
}