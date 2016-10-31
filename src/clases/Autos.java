/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

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
      private int precioalquilada;
      private String tipomodelo;
      private String tipomarca;
      private String fecha;
      private int horasalquiladas;
      private int horaspagar;

    public Autos(String nombre, String apellido, String Cedula, String Modelo, String Marca, String tipomodelo, String tipomarca, String fecha, int horasalquiladas, int horaspagar, int precioalquilada, String precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.tipomodelo = tipomodelo;
        this.horasalquiladas = horasalquiladas;
        this.horaspagar = horaspagar;
        this.precio = precio;
        this.fecha = fecha;
        this.precioalquilada = precioalquilada;
    }
    
 public Autos(String Modelo, String Marca, String tipomarca, String precio) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.tipomarca = tipomarca;
        this.precio = precio;
    }
 
  public Autos(String nombre, String apellido, String Cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
  }
  
  public Autos(String nombre, String apellido, String Cedula, String marca, String fecha, int horasalquiladas, int precioalquilada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
        this.Marca = marca;
        this.fecha = fecha;
        this.horasalquiladas = horasalquiladas;
        this.precioalquilada = precioalquilada;
  }

    public Autos(String nombre, String apellido, String cedula, String automovil, Date fecha, int horasalquilar, int precioalquilar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPrecioalquilada() {
        return precioalquilada;
    }

    public void setPrecioalquilada(int precioalquilada) {
        this.precioalquilada = precioalquilada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHorasalquiladas() {
        return horasalquiladas;
    }

    public void setHorasalquiladas(int horasalquiladas) {
        this.horasalquiladas = horasalquiladas;
    }

    public int getHoraspagar() {
        return horaspagar;
    }

    public void setHoraspagar(int horaspagar) {
        this.horaspagar = horaspagar;
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
     
    public void Operacion ()
    {
        int aux;
        aux = this.precioalquilada*this.horasalquiladas;
        this.setHoraspagar(aux);
    }
    
       public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
    }
    

