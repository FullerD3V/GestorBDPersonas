/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorbdpersonas.Person;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Persona {
    private String Nombre;
    private String Apellidos;
    private int Edad;    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Persona other = (Persona) obj;
        if (this.Edad != other.Edad) {
            return false;
        }
        
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        
        if (!Objects.equals(this.Apellidos, other.Apellidos)) {
            return false;
        }
        
        return true;
    }
    
    public Persona(String Nombre, String Apellidos, int Edad){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}
