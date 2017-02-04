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

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido() {
        return apellido.get();
    }

    public void setApellido(String apellido) {
        this.apellido.get();
    }

    public String getDni() {
        return dni.get();
    }

    public void setDni(String dni) {
        this.dni.set(dni);
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = new SimpleStringProperty (nombre);
        this.apellido = new SimpleStringProperty (apellido);
        this.dni = new SimpleStringProperty (dni);
    }

   
}
