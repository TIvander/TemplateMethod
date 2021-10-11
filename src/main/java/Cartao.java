public abstract class Cartao {

    protected String nome;
    private int credito;
    private int numero;
    

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public abstract String verificarPerfil();


    @Override
    public String toString() {
        return "Cartao{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero + '\'' +
                " ,Tipo: " + this.verificarPerfil() +
                '}';
    }
}
