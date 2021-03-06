/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Autos;
import clases.Helper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pared
 */
public class CompradoresAutos extends javax.swing.JDialog {

    /**
     * Creates new form CompradoresAutos
     */
        String ruta;
        ObjectOutputStream salida;
        ArrayList<Autos> auto;
        int aux = 0;
    public CompradoresAutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/autosComprados.txt";
        try {
            auto = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, auto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdBuscar = new javax.swing.JButton();
        cmbGuardar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Cedula:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 290, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Compradores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        cmbGuardar.setText("Guardar");
        cmbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, -1));

        cmdSalir.setText("Salir");
        jPanel2.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 120, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGuardarActionPerformed
        try{
        String nombre, apellido, cedula;
        if(txtApellido.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese el apellido correspondiente", 3);
           txtApellido.requestFocusInWindow();
        }
        else if (txtNombre.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese el nombre correspondiente", 3);
           txtNombre.requestFocusInWindow();
        }
        else if (txtCedula.getText().trim().isEmpty())
        {
           Helper.mensaje(this, "Ingrese la cedula correspondiente", 3);
           txtCedula.requestFocusInWindow();
        }
        else {
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        ArrayList<Autos> autoModificado;
        
       
            if (aux == 1){
                 Autos a = new Autos (nombre, apellido, cedula);

            try {
                a.guardar(salida);
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else {
                autoModificado = Helper.modificarAuto(ruta, cedula, nombre, apellido);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (IOException ex) {
                Logger.getLogger(CompradoresAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
                Helper.volcado(salida, autoModificado);
                aux=0;
                Helper.mensaje(this, "Persona Actualizada Correctamente!", 1);
            }
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtNombre.requestFocusInWindow();
        }
        }catch (NumberFormatException e)
        {
           Helper.mensaje(this, "Ingrese correctamente las casillas", 3);
        }
    }//GEN-LAST:event_cmbGuardarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
        Autos a;
        
        if (Helper.buscarAutoCedula(cedula, ruta)) {
            a = Helper.traerPersonaCedula(cedula, ruta);
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            aux = 1;
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");

        txtCedula.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompradoresAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CompradoresAutos dialog = new CompradoresAutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbGuardar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
