package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Button btnLogin;

	@FXML
	private PasswordField pwdField;

	public void Login(ActionEvent event) {
		if (pwdField.getText().equals("test")) {
			try {
				Node source = (Node) event.getSource();
				Stage stage = (Stage) source.getScene().getWindow();
				new FXMLLoader();
				Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
				Scene scene = new Scene(root);
				// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				stage.show();
				System.out.println("here");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {

		}

	}

	public PasswordField getPwdField() {
		return pwdField;
	}

}
