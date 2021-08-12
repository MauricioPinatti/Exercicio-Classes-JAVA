package Exercicio_1;

public class Application{

    public static void main(String[] args){

        Novo objNovo = new Novo("Rua",50000.0,30.0);
        Velho objvelho = new Velho("Avenida",50000.0,30.0);

        System.out.println("O valor do imovel novo, é R$: " + objNovo.adicionalPreco());
        System.out.println("O valor do imovel velho, é R$: " + objvelho.descontoPreco());

    }
}
