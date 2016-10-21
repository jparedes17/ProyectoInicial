/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author pared
 */
public class Autos implements java.io.Serializable{
      private String nombre;
      private String apellido;
      private String Cedula;
      private String Modelo;
      private String Marca;
      private String precio;
      private String tipomodelo;
      private String tipomarca;

    public Autos(String nombre, String apellido, String Cedula, String Modelo, String Marca, String tipomodelo, String tipomarca) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.tipomodelo = tipomodelo;
    }
    
 public Autos(String Modelo, String Marca, String tipomarca, String precio) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.tipomarca = tipomarca;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipomodelo() {
        return tipomodelo;
    }

    public void setTipomodelo(String tipomodelo) {
        this.tipomodelo = tipomodelo;
    }

    public String getTipomarca() {
        return tipomarca;
    }

    public void setTipomarca(String tipomarca) {
        this.tipomarca = tipomarca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
      
       public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
    }
    

