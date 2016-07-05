package pacoteAntigo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author homeoffice
 */
public class Cliente {
   
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int numero;
    private String bairro;
    private int cep;
    private boolean ativo;

    public static final String PROP_ATIVO = "ativo";

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        boolean oldAtivo = this.ativo;
        this.ativo = ativo;
        propertyChangeSupport.firePropertyChange(PROP_ATIVO, oldAtivo, ativo);
    }

    
    public static final String PROP_CEP = "cep";

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        int oldCep = this.cep;
        this.cep = cep;
        propertyChangeSupport.firePropertyChange(PROP_CEP, oldCep, cep);
    }

    
    public static final String PROP_BAIRRO = "bairro";

    /**
     * Get the value of bairro
     *
     * @return the value of bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Set the value of bairro
     *
     * @param bairro new value of bairro
     */
    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        propertyChangeSupport.firePropertyChange(PROP_BAIRRO, oldBairro, bairro);
    }

    
    
    
    public static final String PROP_NUMERO = "numero";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        propertyChangeSupport.firePropertyChange(PROP_NUMERO, oldNumero, numero);
    }

    
    
    
    
    public static final String PROP_ENDERECO = "endereco";

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        propertyChangeSupport.firePropertyChange(PROP_ENDERECO, oldEndereco, endereco);
    }

    
    
    
    public static final String PROP_TELEFONE = "telefone";

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONE, oldTelefone, telefone);
    }

    public static final String PROP_EMAIL = "email";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        propertyChangeSupport.firePropertyChange(PROP_EMAIL, oldEmail, email);
    }


    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public Cliente(){
      //  if(ativo=='S' || ativo=='s')
       //     this.ativo = true;
        //else
         //   this.ativo = false;
    }
    
    public void exibeDados(){
        if(getNome()==null){
            System.out.println("Ainda sem dados ou cadastro incompleto!");
            System.exit(0);
        }
        
        System.out.println("Nome do cliente: "+getNome());
        System.out.println("Email do cliente: "+getEmail());
        System.out.println("Telefone do cliente: "+getTelefone());
        System.out.println("Endereco do cliente: "+getEndereco());
        System.out.println("Numero do cliente: "+getNumero());
        System.out.println("Bairro do cliente: "+getBairro());
        System.out.println("Cep do cliente: "+getCep());
        if(isAtivo())
            System.out.println("Cliente Ativo! ");
        if(!isAtivo())
            System.out.println("Cliente inativo! ");
        
    }      
}
