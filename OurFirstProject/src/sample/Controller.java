package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button helloButton;
    @FXML
    private TextField usernameText;







    public void printHello1(ActionEvent e)
    {
        String usernameValue = usernameText.getText().toString();


        if(usernameValue.length()==0)
        {
            System.out.println("Please enter something");
        }
        else
        {
            System.out.println("The entered user name is "+usernameText.getText().toString());
        }
    }


    public void back(ActionEvent e) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }

    public void ExampleButtonClicked(ActionEvent e) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("ExampleView.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
