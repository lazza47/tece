package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenuController {

	@FXML
	private ScrollPane spMainMenu;

	@FXML
	private Button btnDistribuitor;
	@FXML
	private Button btnCatalog;

	@FXML
	private VBox vboxDistributorLabels;

	@FXML
	private GridPane distributorInfo;

	@FXML
	private TableColumn<CatalogItem, String> tcClasa;
	@FXML
	private TableColumn<CatalogItem, Integer> tcCodProdus;
	@FXML
	private TableColumn<CatalogItem, String> tcDenumire;
	@FXML
	private TableColumn<CatalogItem, Float> tcPret;
	@FXML
	private TableColumn<CatalogItem, String> tcUM;
	@FXML
	private TableView<CatalogItem> tvCatalog;

	public void distributorClicked(ActionEvent e) {
		try {
			Node source = (Node) e.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			stage.show();
			tvCatalog.setVisible(false);
			spMainMenu.setVisible(true);
			distributorInfo.setVisible(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void catalogClicked(ActionEvent e) {

		try {
			distributorInfo.setVisible(false);
			tvCatalog.setVisible(true);
			tcClasa.setCellValueFactory(new PropertyValueFactory<CatalogItem, String>("clasaCol"));
			tcCodProdus.setCellValueFactory(new PropertyValueFactory<CatalogItem, Integer>("codProdusCol"));
			tcDenumire.setCellValueFactory(new PropertyValueFactory<CatalogItem, String>("denumireCol"));
			tcPret.setCellValueFactory(new PropertyValueFactory<CatalogItem, Float>("pretCol"));
			tcUM.setCellValueFactory(new PropertyValueFactory<CatalogItem, String>("UMcol"));
			tvCatalog.getItems().setAll(CatalogItem.getAllstudentInfo());

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
