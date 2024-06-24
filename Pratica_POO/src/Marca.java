public class Marca {
            //Atributos da Classe
    private String nome;
    private String fornecedor;
    private String website;
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            //Getters
    public String getNome() {return nome;}
    public String getWebsite() {return website;}
    public String getFornecedor() {return fornecedor;}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            //Setters

    public void setFornecedor(String fornecedor) {this.fornecedor = fornecedor;}


//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            //Método construtor

    public Marca(String nome, String fornecedor, String website) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.website = website;
    }

    public Marca(String nome, String fornecedor) {
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            //ToString da classe

    @Override
    public String toString() {
        return "Marca:\nNome: " + nome + "\nFornecedor: " + fornecedor + "\nWebsite: " + website;
    }
}
