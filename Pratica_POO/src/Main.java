public class Main {
    public static void main(String[] args) {
        Marca marca1 =new Marca("Flora","Sede  3","flora.com.br");
        Marca marca2 = new Marca("Flora","Sede 4");
        ProdutoHigiene produto1 = new ProdutoHigiene(231231233,"Creme para cabelo",marca1,16.34);
        ProdutoHigiene produto2 = new ProdutoHigiene(32141,"Sabonete",5.46,"Flora","Sede 1","flora.com.br");
        CuidadoCasaRoupa cuidadoCasaRoupa1 = new CuidadoCasaRoupa(217893,"Amaciante",new Marca("Flora","Sede 5","flora.com.br"),18.56,"Azul","Roupas");
        CuidadoCasaRoupa cuidadoCasaRoupa2 = new CuidadoCasaRoupa(234567,"Água sanitária",25.90,"Flora","Sede 8","flora.com.br","Rosa","Casa");
        CuidadoPessoal cuidadoPessoa1 = new CuidadoPessoal(59187,"Perfume",new Marca("Flora","Sede 23","flora.com.br"),120.01,"Pêssego",20,"Pescoço");
        CuidadoPessoal cuidadoPessoal2 = new CuidadoPessoal(452625,"Hidratante",25.68,"Flora","Sede 5","flora.com.br","Morango",5,"Pele");


        System.out.println(marca1+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(marca2+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(produto1+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(produto2+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(cuidadoCasaRoupa1+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(cuidadoCasaRoupa2+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(cuidadoPessoa1+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(cuidadoPessoal2);


        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-= Atualizações =-=-=-=-=-=-=-=-=-=-=-=-=");


        System.out.println("Atualização:\n" +
                "Preço: "+ produto1.getPreco()+" -> "+produto1.calcularPrecoMaisTributo()+
                "\n\n"+produto1+
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Atualização:\n"+
                "Preço: "+produto2.getPreco()+" -> "+produto2.calcularPrecoMaisTributo(produto2.getPreco())+
                "\n\n"+produto2+
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}