package employeerecordsystemfx;

import static employeerecordsystemfx.EmployeeRecordSystemFx.employeesArrList;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLNewSalariedEmployeeController implements Initializable {

    @FXML 
    private Button SalariedEmployeeSubmitBtn;
    @FXML 
    private Button SalariedEmployeeClearBtn;
    @FXML 
    private Button SalariedEmployeeBackBtn; 
    @FXML 
    private Button homeBtn;
    @FXML 
    private TextField nameTextField;
    @FXML 
    private TextField regTextField;
    @FXML 
    private TextField designationTextField;  
    @FXML 
    private TextField salaryTextField;
    @FXML 
    private Label label;
    

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLNewEmployee.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    @FXML
    private void home(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    @FXML
    private void finish(ActionEvent event) throws IOException {
        
        String id=regTextField.getText();       // Reading values from TextFeild
        String name=nameTextField.getText();
        String desg=designationTextField.getText();
        double sal=Double.parseDouble(salaryTextField.getText());
        
        EmployeeRecordSystem e = new NewSalariedEmployee(name,id,desg,sal);     //Sending value to arraylist
        employeesArrList.add(e);
        label.setText("SUBMIT DONE");    

    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
