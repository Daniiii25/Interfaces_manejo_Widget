
package vista;

import java.awt.event.MouseEvent;


public class Registro_Motor extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registro_Motor.class.getName());


    public Registro_Motor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       if (!jCheckBox1.isSelected()) {
         
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Debe aceptar el tratamiento de datos para poder registrarse.", 
                "Acceso Denegado", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
        } 
        
        else {
          
            String nombre = jTextField1.getText();
            String apellido = jTextField2.getText();
            String numDocumento = jTextField3.getText();
            
           
            String pais = jComboBox1.getSelectedItem().toString();
            
            
            String tipoDocumento = "";
            if (jRadioButton1.isSelected()) {
                tipoDocumento = "C.C";
            } else if (jRadioButton2.isSelected()) {
                tipoDocumento = "T.I";
            } else if (jRadioButton3.isSelected()) {
                tipoDocumento = "C.E";
            }
            
          
            System.out.println("--- REGISTRO EXITOSO ---");
            System.out.println("Datos del cliente: " + nombre + " " + apellido);
            System.out.println("País: " + pais);
            System.out.println("Documento: " + tipoDocumento + " " + numDocumento);
            System.out.println("Aceptó términos: Sí");
            
            
            javax.swing.JOptionPane.showMessageDialog(this, "¡Registro completado con éxito!");
            
                        jButton2MouseClicked(evt); 
        }

    private void jButton2MouseClicked() {
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
        jComboBox1.setSelectedIndex(0);
        
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jCheckBox1.setSelected(false);
    }
 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new Registro_Motor().setVisible(true));
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}