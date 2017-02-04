/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author educacionit
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtDni;
    @FXML
    private TableColumn colApellido;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colDni;
    @FXML
    private TableView tabla;
    @FXML
    final ObservableList <Persona> data=FXCollections.observableArrayList();
   
    @FXML
    private void grabarButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Persona p1= new Persona(txtNombre.getText(), txtApellido.getText(), txtDni.getText());
        data.add(p1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
        colDni.setCellValueFactory(new PropertyValueFactory<Persona, String>("dni"));
        tabla.setItems(data);
    }    
    
    //tablas
   
    
}
