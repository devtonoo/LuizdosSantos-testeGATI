package pacoteAntigo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Luiz Fernando dos Santos em homeoffice
 */
public class Cliente {
    
    private String nome;
    private String nomeEntreda;

    public static final String PROP_NOMEENTREDA = "nomeEntreda";

    public String getNomeEntreda() {
        return nomeEntreda;
    }

    public void setNomeEntreda(String nomeEntreda) {
        String oldNomeEntreda = this.nomeEntreda;
        this.nomeEntreda = nomeEntreda;
        propertyChangeSupport.firePropertyChange(PROP_NOMEENTREDA, oldNomeEntreda, nomeEntreda);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private String email;
    private String emailEntrada;

    public static final String PROP_EMAILENTRADA = "emailEntrada";

    public String getEmailEntrada() {
        return emailEntrada;
    }

    public void setEmailEntrada(String emailEntrada) {
        String oldEmailEntrada = this.emailEntrada;
        this.emailEntrada = emailEntrada;
        propertyChangeSupport.firePropertyChange(PROP_EMAILENTRADA, oldEmailEntrada, emailEntrada);
    }

    private String telefone;
    private String telefoneEntreda;

    public static final String PROP_TELEFONEENTREDA = "telefoneEntreda";

    public String getTelefoneEntreda() {
        return telefoneEntreda;
    }

    public void setTelefoneEntreda(String telefoneEntreda) {
        String oldTelefoneEntreda = this.telefoneEntreda;
        this.telefoneEntreda = telefoneEntreda;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONEENTREDA, oldTelefoneEntreda, telefoneEntreda);
    }

    private String endereco;
    private String enderecoEntreda;

    public static final String PROP_ENDERECOENTREDA = "enderecoEntreda";

    public String getEnderecoEntreda() {
        return enderecoEntreda;
    }

    public void setEnderecoEntreda(String enderecoEntreda) {
        String oldEnderecoEntreda = this.enderecoEntreda;
        this.enderecoEntreda = enderecoEntreda;
        propertyChangeSupport.firePropertyChange(PROP_ENDERECOENTREDA, oldEnderecoEntreda, enderecoEntreda);
    }

    private int numero;
    private int numeroEntrada;

    public static final String PROP_NUMEROENTRADA = "numeroEntrada";

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        int oldNumeroEntrada = this.numeroEntrada;
        this.numeroEntrada = numeroEntrada;
        propertyChangeSupport.firePropertyChange(PROP_NUMEROENTRADA, oldNumeroEntrada, numeroEntrada);
    }

    private String bairro;
    private String bairroEntrada;

    public static final String PROP_BAIRROENTRADA = "bairroEntrada";

    public String getBairroEntrada() {
        return bairroEntrada;
    }

    public void setBairroEntrada(String bairroEntrada) {
        String oldBairroEntrada = this.bairroEntrada;
        this.bairroEntrada = bairroEntrada;
        propertyChangeSupport.firePropertyChange(PROP_BAIRROENTRADA, oldBairroEntrada, bairroEntrada);
    }

    private int cep;
    private int cepEntrada;

    public static final String PROP_CEPENTRADA = "cepEntrada";

    public int getCepEntrada() {
        return cepEntrada;
    }

    public void setCepEntrada(int cepEntrada) {
        int oldCepEntrada = this.cepEntrada;
        this.cepEntrada = cepEntrada;
        propertyChangeSupport.firePropertyChange(PROP_CEPENTRADA, oldCepEntrada, cepEntrada);
    }

    private boolean ativo;
   
    public Cliente(String nome, String email, String telefone, String endereco,
            int numero, String bairro, int cep, char ativo){
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setEndereco(endereco);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        if(ativo=='S' || ativo=='s')
            this.ativo = true;
        else
            this.ativo = false;
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
        
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    public String getEmail(){
        return this.email;
    }
    
    public void setTelefone(String t){
        this.telefone = t;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEndereco(String e){
        this.endereco = e;
    }
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    public int getNumero(){
        return this.numero;
    }
    
    public void setBairro(String b){
        this.bairro = b;
    }
    public String getBairro(){
        return this.bairro;
    }
    
    public void setCep(int cep){
        this.cep = cep;
    }
    public int getCep(){
        return this.cep;
    }
    
    public boolean isAtivo(){
        return this.ativo;
    }
            
}
