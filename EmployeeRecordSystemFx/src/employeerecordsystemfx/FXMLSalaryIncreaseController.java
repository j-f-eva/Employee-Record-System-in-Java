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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLSalaryIncreaseController implements Initializable {

    @FXML 
    private Button salaryIncreseSubmitBtn;
    @FXML 
    private Button salaryIncreseBackBtn; 
    @FXML 
    private TextField regTextField;
    @FXML 
    private TextField salaryTextField;  

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    @FXML
    private void finish(ActionEvent event) throws IOException {
        String id=regTextField.getText();
        double amount=Double.parseDouble(salaryTextField.getText());
        for(EmployeeRecordSystem emp: employeesArrList){ //for each loop ,first to last employee traversed korbe..index no checked
            if(emp.getId().equals(id)){
                emp.increaseSalary(amount);
                System.out.println(emp.getSalary());
                break;
            }
        }
        
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
