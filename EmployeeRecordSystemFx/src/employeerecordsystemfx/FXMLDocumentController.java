package employeerecordsystemfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    private Button newEmployeeBtn;
    @FXML 
    private Button searchEmployeeBtn;
    @FXML 
    private Button SalaryIncreseBtn;
    @FXML 
    private Button showEmployeeBtn;
    
    @FXML
    private void newEmployee(ActionEvent event) throws IOException {     //window chANGE.
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLNewEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    @FXML
    private void searchEmployee(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLSearchEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    
    @FXML
    private void SalaryIncrese(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLSalaryIncrease.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    @FXML
    private void showEmployee(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLShowEmployee.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    
    @Override            //auto generated..
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
