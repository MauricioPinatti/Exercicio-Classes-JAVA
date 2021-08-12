package Exercicio_1;

public class Imovel {

    //atributos
    protected String endereco;
    protected double preco;

    
    //construtor
    public Imovel(String endereco,double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    //Metodos Getters e Setters
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
