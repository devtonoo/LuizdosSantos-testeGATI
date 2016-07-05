package pacoteAntigo;

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
