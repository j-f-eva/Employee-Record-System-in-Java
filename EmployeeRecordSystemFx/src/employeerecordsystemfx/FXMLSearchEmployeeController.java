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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLSearchEmployeeController implements Initializable {
    @FXML 
    private Button searchEmployeeSubmitBtn;
    
    @FXML 
    private Button searchEmployeeBackBtn; 
    @FXML 
    private TextField regTextField;
    @FXML
    private TextArea showTextArea;
    @FXML 
    private Label label;
    
    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    
    @FXML
    private void finish(ActionEvent event) throws IOException {          //sign in button
        String id=regTextField.getText();  //reg text fiels
        
        for(EmployeeRecordSystem emp: employeesArrList){
            if(emp.getId().equals(id)){
                showTextArea.setText(emp.display());   //result text field ..
                break;
            }
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}