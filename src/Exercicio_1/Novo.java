package Exercicio_1;

public class Novo extends Imovel{
    //Novo atributo
    public double adicionalPreco;

    //construtor
    public Novo(String endereco, double preco, double adicionalPreco){
        super(endereco, preco);
        this.adicionalPreco = adicionalPreco;
    }

    //Metodo getters e setters
    public double getAdicionalPreco(){
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco){
        this.adicionalPreco = adicionalPreco;
    }

    //calculo do adicionalPreco
    public double adicionalPreco(){
        double novoPreco = ((adicionalPreco * preco)/100) + preco;
        return novoPreco;
    }
}
