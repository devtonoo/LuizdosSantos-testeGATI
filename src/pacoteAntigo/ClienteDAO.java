/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteAntigo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author homeoffice
 */
public class ClienteDAO {
    Connection conexao;
    PreparedStatement pEstado;

    public ClienteDAO() throws SQLException {
        
        //criar(c);
    
    }
    
    public void criar(Cliente c) throws SQLException{
        
        try {
            
            conexao = Conexao.getConexao();
            pEstado = null;
            
            pEstado = conexao.prepareStatement("INSERT INTO clienteTabela (nome,email,telefone,endereco,numero,bairro,cep,ativo)VALUES(?,?,?,?,?,?,?,?)");//"INSERT INTO clienteTabela (nomea,email,telefone,endereco,numero,bairro,cep,atibo)VALUES(?,?,?,?,?,?,?,?)");
           
            pEstado.setString(1, c.getNome());
            pEstado.setString(2, c.getEmail());
            pEstado.setString(3, c.getTelefone());
            pEstado.setString(4, c.getEndereco());
            pEstado.setInt(5, c.getNumero());
            pEstado.setString(6, c.getBairro());
            pEstado.setInt(7, c.getCep());
            pEstado.setBoolean(8, c.isAtivo());
            pEstado.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro para salvar dados no banco de dados(Classe ClienteDAO)!"+ex);
        }finally{
            Conexao.fechaConexao(conexao, pEstado);
            JOptionPane.showMessageDialog(null, "Fechando conexao!");
        }
    }
   
    public List<Cliente> listarClientes() throws ClassNotFoundException, SQLException{
        conexao = Conexao.getConexao();
        pEstado = null;
        ResultSet result = null;
        
        List<Cliente> listaClientes = new ArrayList<>();
        
        try {
            pEstado = conexao.prepareStatement("SELECT * FROM clienteTabela");
            result = pEstado.executeQuery();
            
            while(result.next()){
                
                Cliente cliente = new Cliente(null,null,null,null,0,null,0,true);
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setEmail(result.getString("email"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCep(result.getInt("cep"));
                cliente.ativo = result.getBoolean("ativo");
                listaClientes.add(cliente);
                
                
            }
            
            JOptionPane.showMessageDialog(null, "Listagem finalizada e preenchida com sucesso! ");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro para colocar dados na listagem de clientes! "+e);
            return null;
        }finally{
            JOptionPane.showMessageDialog(null, "Finlizando conexao da listagem! ");
            Conexao.fechaConexao(conexao, pEstado, result);
        }
        
         
        return listaClientes;
    }
}
