package Exercicio_1;

public class Velho extends Imovel{
    //Novo atributo
    public double descontoPreco;

    //construtor
    public Velho(String endereco, double preco, double descontoPreco){
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }

    //Metodo getters e setters
    public double getDescontoPreco(){
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco){
        this.descontoPreco = descontoPreco;
    }

    //calculo do descontoPreco
    public double descontoPreco(){
        double novoPreco = preco - ((descontoPreco * preco)/100) ;
        return novoPreco;
    }
}
