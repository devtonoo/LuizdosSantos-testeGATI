/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteAntigo;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author homeoffice
 */
public class Conexao {
    
    private Connection conecta;
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/CadastroClienteGATI";
    public static final String USUARIO = "root";
    public static final String SENHA = "root";
            
    //private a;
    //private a;
    
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conecao com erro notry da classe Conexao metodo getConexao! "+e);
            return null;
        }
        
                
    }
    public static void fechaConexao(Connection c){
        
        try {
            if(c!=null)
                c.close();
            else
                JOptionPane.showMessageDialog(null, "Mantendo conexão aberta! ");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
            
    }
    
    public static void fechaConexao(Connection c, PreparedStatement estado){
        
        fechaConexao(c);
        
        try {
            if(estado != null)
                estado.close(); 
            else
                JOptionPane.showMessageDialog(null, "Mantendo conexão aberta! ");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    
    public static void fechaConexao(Connection c, PreparedStatement estado, ResultSet resultadoConfiguracao){
        
        fechaConexao(c, estado);
        
        try {
            if(resultadoConfiguracao != null)
                resultadoConfiguracao.close(); 
            else
                JOptionPane.showMessageDialog(null, "Mantendo conexão aberta! ");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        CadastroCliente c = new CadastroCliente();
        
        
        
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            c.setVisible(true);
        });
    }
}
