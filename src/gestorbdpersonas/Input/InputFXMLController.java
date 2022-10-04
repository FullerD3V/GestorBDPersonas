/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorbdpersonas.Input;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import gestorbdpersonas.Person.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author alumno
 */
public class InputFXMLController implements Initializable {
    
    @FXML
    private TextField txtNombre, txtEdad, txtApellidos;
    
    @FXML
    private Button btnGuardar, btnSalir; 
    
    String nombre, apellidos;
    
    int edad;
    
    public static ObservableList<Persona> personas = FXCollections.observableArrayList();
    
    @FXML
    private void txtNombreKeyReleased(KeyEvent event){
        nombre = txtNombre.getText();
    }
    
    @FXML
    private void txtNombreKeyTyped(KeyEvent event){
        if (!event.getCharacter().matches("[A-z]")) {
            event.consume();
        }
    }
    
    @FXML
    private void txtApellidosKeyReleased(KeyEvent event){
        apellidos = txtApellidos.getText();
    }
    
    @FXML
    private void txtEdadKeyReleased(KeyEvent event){
        edad = Integer.valueOf(txtEdad.getText());
    }
    
    @FXML
    public void txtEdadKeyTyped(KeyEvent event) {
        if (!event.getCharacter().matches("[0-9]")) {
            event.consume();
        }
    }
    
    @FXML
    public void btnSalirOnAction(){
    Stage stage = (Stage) btnSalir.getScene().getWindow();
    stage.close();
    }
    
    @FXML
    public void btnGuardarOnAction(){    
        Persona p = new Persona(nombre, apellidos, edad);
        this.personas.add(p);   
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Datos insertados");
        alert.setHeaderText("Persona añadida correctamente");
        alert.showAndWait();
        
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
