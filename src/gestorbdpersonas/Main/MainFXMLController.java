/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorbdpersonas.Main;

import gestorbdpersonas.GestorBDPersonas;
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
import gestorbdpersonas.Person.Persona;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import gestorbdpersonas.Input.InputFXMLController;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private Button btnAgregar, btnModificar, btnEliminar;
    
    @FXML 
    private TableView tblPersona;
    
    @FXML
    private TableColumn colNombre, colApellidos, colEdad;
    
    @FXML
    private void btnAgregarOnAction(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(gestorbdpersonas.GestorBDPersonas.class.getResource("Input/InputFXML.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Nuevo usuario");
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);        
        stage.initOwner(((Node)event.getSource()).getScene().getWindow());
        stage.setResizable(false);
        stage.show();
        
        tblPersona.setItems(InputFXMLController.personas);
    }
    
    @FXML
    private void btnAgregarOnMouseDragOver(){
        btnAgregar.setStyle("-fx-background-color: AQUAMARINE; -fx-border-color: BLUE");
    }
    
    @FXML 
    private void btnModificarOnAction(){
        //De momento nada
    }
    
    @FXML
    private void btnEliminarOnAction(){
        //De momento nada
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }        
}
