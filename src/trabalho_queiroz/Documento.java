package trabalho_queiroz;

// não pode criar diretamente um objeto dela com 
// new Documento(...). Ela serve como base para outras classes.
public abstract class Documento {

    private String numero;
    
    // "this" : pega o valor do objeto em que chamou seu método
    public Documento(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    //retorna true se o documento for válido ou false caso contrário.
    public abstract boolean validar();
    
    //retorna o documento formatado como texto.
    public abstract String formatar();
    
    // Como os métodos são abstratos, 
    // cada subclasse implementará sua própria versão.
}
