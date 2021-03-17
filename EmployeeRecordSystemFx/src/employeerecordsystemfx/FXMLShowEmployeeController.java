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
import javafx.scene.control.TextArea;

import javafx.stage.Stage;


public class FXMLShowEmployeeController implements Initializable {

    @FXML 
    private Button showEmployeeBackBtn; 
    @FXML
    private TextArea showTextArea;

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(parent);       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }
    
    void displayAll(){
        for(EmployeeRecordSystem emp : employeesArrList){
            showTextArea.setText(showTextArea.getText()+emp.display()+"\n");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayAll();
    }    
    
}
