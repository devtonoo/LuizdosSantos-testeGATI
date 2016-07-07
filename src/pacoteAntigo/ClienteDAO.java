/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteAntigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author homeoffice
 */
public class ClienteDAO {
    Connection conexao;

    public ClienteDAO() throws SQLException {
        
        //criar(c);
    
    }
    
    public void criar(Cliente c) throws SQLException{
        
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pEstado = null;
            
            pEstado = conexao.prepareStatement("INSERT INTO clienteTabela (nomea,email,telefone,endereco,numero,bairro,cep,atibo)VALUES(?,?,?,?,?,?,?,?)");
            pEstado.setString(1, c.getNome());
            pEstado.setString(2, c.getEmail());
            pEstado.setString(3, c.getTelefone());
            pEstado.setString(4, c.getEndereco());
            pEstado.setInt(5, c.getNumero());
            pEstado.setString(6, c.getBairro());
            pEstado.setInt(7, c.getCep());
            pEstado.setBoolean(8, c.isAtivo());
            
            
            JOptionPane.showMessageDialog(null, "Voce esta conectado com o banco de dados MySql!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
