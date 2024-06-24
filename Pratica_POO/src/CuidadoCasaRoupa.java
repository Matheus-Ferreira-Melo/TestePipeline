public class CuidadoCasaRoupa extends ProdutoHigiene{
    //Atributos da Classe
    private String cor;
    private String usoIndicado;




    //Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getUsoIndicado() {
        return usoIndicado;
    }

    public void setUsoIndicado(String usoIndicado) {
        this.usoIndicado = usoIndicado;
    }




                //Métodos Construtores
    public CuidadoCasaRoupa(int codigo, String nome, Marca marca,double preco, String cor, String usoIndicado) {
        super(codigo, nome, marca,preco);
        this.cor = cor;
        this.usoIndicado = usoIndicado;

    }

    public CuidadoCasaRoupa(int codigo, String nome,double preco, String nomeMarca, String fornecedor, String website, String cor, String usoIndicado) {
        super(codigo, nome,preco, nomeMarca, fornecedor, website);
        this.cor = cor;
        this.usoIndicado = usoIndicado;

    }


                    //Métodos

    public double calcularPrecoMaisTributo(){
        if(super.calcularPrecoMaisTributo()>=5){
            return super.calcularPrecoMaisTributo()+1.29;
        }else if (super.calcularPrecoMaisTributo()>=19){
            return super.calcularPrecoMaisTributo()+1.65;
        }else{
            return super.calcularPrecoMaisTributo()+0.78;
        }
    }
                    //ToString
    @Override
    public String toString() {
        return "CuidadoCasaRoupa:\nCor: " + cor + "\nUso indicado: " + usoIndicado+"\n"+super.toString();
    }
}
