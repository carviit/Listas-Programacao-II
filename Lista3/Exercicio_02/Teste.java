package Exercicio_02;

public class Teste {

    public static void main(String[] args){

        //Criação e atribuição de valores para um CLIENTE

        Cliente c1 = new Cliente();

        c1.setNome("Carlos Vitor");
        c1.setIdade(20);
        c1.setSexo("Masculino");
        c1.setAnoNascimento(2002);
        c1.setValorDivida(590.50);
        
        //Chamada do método toString CLIENTE sobrescrito

        System.out.println(c1);

        //Criação e atribuição de valores para um GERENTE

        Gerente g1 = new Gerente();

        g1.setNome("Wanderlei");
        g1.setIdade(45);
        g1.setSexo("Masculino");
        g1.setMatricula("GC452");
        g1.setNomeGerencia("Gerente Comercial");
        g1.setSalario(2450);
        
        //Chamada do método toString GERENTE sobrescrito 
        
        System.out.println(g1);

        //Criação e atribuição de valores para um VENDEDOR

        Vendedor v1 = new Vendedor();

        v1.setNome("Magno");
        v1.setIdade(28);
        v1.setSexo("Masculino");
        v1.setSalario(1835);
        v1.setValorVendas(120);
        v1.setQntVendas(5);

        //Chamada do método toString VENDEDOR sobrescrito 

        System.out.println(v1);

    }
    
}
