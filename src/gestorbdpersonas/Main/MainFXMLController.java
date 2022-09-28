/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorbdpersonas.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    
    @FXML
    private void btnAgregarOnAction(){}
    @FXML
    private void btnModificarOnAction(){}
    @FXML
    private void btnEliminarOnAction(){}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
