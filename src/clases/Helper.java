/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pared
 */
public class Helper {
    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
    
    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }
    
    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }
    
    public static void llenarTabla(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList <Autos> auto = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = auto.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(auto.get(i).getMarca(), i, 0);
           tabla.setValueAt(auto.get(i).getTipomarca(), i, 1);
           tabla.setValueAt(auto.get(i).getModelo(), i, 2);
           tabla.setValueAt(auto.get(i).getPrecio(), i, 3);
        }
    }
    
     public static void llenarTabla2(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList <Autos> auto = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = auto.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(auto.get(i).getMarca(), i, 3);
           tabla.setValueAt(auto.get(i).getModelo(), i, 4);
        }
     }
    
     public static void llenarTabla4 (JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList <Autos> auto = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = auto.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(auto.get(i).getNombre(), i, 0);
           tabla.setValueAt(auto.get(i).getApellido(), i, 1);
           tabla.setValueAt(auto.get(i).getCedula(), i, 2);
           tabla.setValueAt(auto.get(i).getMarca(), i, 3);
           tabla.setValueAt(auto.get(i).getFecha(), i, 4);
           tabla.setValueAt(auto.get(i).getHorasalquiladas(), i, 5);
           tabla.setValueAt(auto.get(i).getHoraspagar(), i, 6);
        }
     }
     public static void llenarTabla3(JTable tabla, String ruta){
        DefaultTableModel tm;
        int nf;
        ArrayList <Autos> auto = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = auto.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(auto.get(i).getNombre(), i, 0);
           tabla.setValueAt(auto.get(i).getApellido(), i, 1);
           tabla.setValueAt(auto.get(i).getCedula(), i, 2);
           tabla.setValueAt(auto.get(i).getMarca(), i, 3);
           tabla.setValueAt(auto.get(i).getModelo(), i, 4);
        }
     }
     
     public static void llenarTabla(JTable tabla, ArrayList <Autos> auto){
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel)tabla.getModel();
        limpiadoTabla(tabla);
        nf = auto.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
           tabla.setValueAt(auto.get(i).getMarca(), i, 0);
           tabla.setValueAt(auto.get(i).getTipomarca(), i, 1);
           tabla.setValueAt(auto.get(i).getModelo(), i, 2);
           tabla.setValueAt(auto.get(i).getPrecio(), i, 3);
        }
    }
    
    public static ArrayList traerDatos(String ruta){
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList auto = new ArrayList();
        Object p;
        
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                auto.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
           return auto;
    } 
    
    public static void volcado(ObjectOutputStream salida,ArrayList personas ){
        for (int i = 0; i < personas.size(); i++) {
            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    }
    
    public static void listadoPorMarca(JTable tabla, String ruta, String marca ){
      ArrayList <Autos> auto = traerDatos(ruta);
      ArrayList <Autos> marcasFiltradas = new ArrayList();
        for (int i = 0; i < auto.size(); i++) {
            if (auto.get(i).getMarca().equals(marca)){
                marcasFiltradas.add(auto.get(i));
            }
        }
        llenarTabla(tabla, marcasFiltradas);
    }
}

