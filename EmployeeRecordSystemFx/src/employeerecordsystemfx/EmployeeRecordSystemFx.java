/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecordsystemfx;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class EmployeeRecordSystemFx extends Application {
    
    static ArrayList<EmployeeRecordSystem> employeesArrList; //type EmployeeRecordSystem
    @Override 
    public void start(Stage stage) throws Exception {   //change window
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employeesArrList= new ArrayList<EmployeeRecordSystem>(); 
        launch(args);
    }
    
}
