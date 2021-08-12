package Exercicio_2;

public class Animal{
    //atributos
    private String nome;
    private String raca;

    //CONSTRUTOR vazio
    public Animal(){
    }

    //CONSTRUTOR com parametro
    public Animal(String nome){
        this.nome = nome;
    }

    //METODO
    public String caminha(){
        return "Animal andando";
    }
}