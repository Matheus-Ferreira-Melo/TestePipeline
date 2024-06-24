public class CuidadoPessoal extends ProdutoHigiene{
    //Atributos da Classe
    private String fragancia;
    private int idadeIndicada;
    private String parteCorpo;


//Getters e Setters
    public String getFragancia() {
        return fragancia;
    }
    public int getIdadeIndicada() {
        return idadeIndicada;
    }

    public void setIdadeIndicada(int idadeIndicada) {
        this.idadeIndicada = idadeIndicada;
    }

    public String getParteCorpo() {
        return parteCorpo;
    }



//Métodos Construtores
    public CuidadoPessoal(int codigo, String nome, Marca marca,double preco, String fragancia, int idadeIndicada, String parteCorpo) {
        super(codigo, nome, marca,preco);
        this.fragancia = fragancia;
        this.idadeIndicada = idadeIndicada;
        this.parteCorpo = parteCorpo;

    }

    public CuidadoPessoal(int codigo, String nome,double preco, String nomeMarca, String fornecedor, String website, String fragancia, int idadeIndicada, String parteCorpo) {
        super(codigo, nome, preco , nomeMarca, fornecedor, website);
        this.fragancia = fragancia;
        this.idadeIndicada = idadeIndicada;
        this.parteCorpo = parteCorpo;

    }

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    //Métodos

    public double calcularPrecoMaisTributo(){
        if(super.calcularPrecoMaisTributo()>=5){
        return super.calcularPrecoMaisTributo()+0.89;
    }else{
        return super.calcularPrecoMaisTributo()+1.45;
        }
    }

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    //ToString
    @Override
    public String toString() {
        return "CuidadoPessoal:\nFragancia: " + fragancia + "\nIdade indicada: " + idadeIndicada + "\nParte do corpo: " + parteCorpo+"\n"+super.toString();
    }
}
