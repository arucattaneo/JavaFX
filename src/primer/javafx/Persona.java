/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.javafx;

import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author educacionit
 */
public class Persona {
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleStringProperty dni;

    public SimpleStringProperty getNombre() {
        return nombre;
    }

    public void setNombre(SimpleStringProperty nombre) {
        this.nombre = nombre;
    }

    public SimpleStringProperty getApellido() {
        return apellido;
    }

    public void setApellido(SimpleStringProperty apellido) {
        this.apellido = apellido;
    }

    public SimpleStringProperty getDni() {
        return dni;
    }

    public void setDni(SimpleStringProperty dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = new SimpleStringProperty (nombre);
        this.apellido = new SimpleStringProperty (apellido);
        this.dni = new SimpleStringProperty (dni);
    }

   
}
