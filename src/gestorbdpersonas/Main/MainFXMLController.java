/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorbdpersonas.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private Button btnAgregar, btnModificar, btnEliminar;
    
    @FXML
    private TextField txtNombre, txtEdad, txtApellidos;
    
    @FXML 
    private TableView tblPersona;
    
    @FXML
    private TableColumn colNombre, colApellidos, colEdad;
    
    String nombre, apellidos;
    
    int edad;
    
    private ObservableList<Persona> personas = FXCollections.observableArrayList();

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
    private void btnAgregarOnAction(){
        Persona p = new Persona(nombre, apellidos, edad);
        this.personas.add(p);
        this.tblPersona.setItems(personas);
    }
    
    @FXML
    private void btnModificarOnAction(){}
    
    @FXML
    private void btnEliminarOnAction(){}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }        
}
