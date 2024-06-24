public class ProdutoHigiene {
    //Atributos da Classe
    private int codigo;
    private String nome;
    private Marca marca;
    private double preco;



    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
                //Métodos Construtores
    public ProdutoHigiene(int codigo, String nome, Marca marca,double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
    public ProdutoHigiene(int codigo, String nome,double preco, String nomeMarca, String fornecedor,String website) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.marca =new Marca(nomeMarca,fornecedor,website);

    }

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    //Métodos
    public double calcularPrecoMaisTributo(){
            return preco+=1.20;
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Método de Sobrecarga
    public double calcularPrecoMaisTributo(double preco){
            if(preco>=5){
                return preco+=0.68;
            }else{
                return preco+=1.39;
            }
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                //ToString
    @Override
    public String toString() {
        return "ProdutoHigiene:\nCodigo: " + codigo + "\nNome do produto: " + nome +"\n"+marca+"\nPreço: "+preco;
    }
}
