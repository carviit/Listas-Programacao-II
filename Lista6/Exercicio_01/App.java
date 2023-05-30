package Exercicio_01;

public class App {

    public static void main(String args[]){

        Professor p1 = new Professor("Carlos", "Banco de Dados I");

        Professor p2 = new Professor("Vitor", "Banco de Dados II");

        // Criação do objeto PROJETOR por meio do padrão Singleton

        ProjetorSingleton projetor = ProjetorSingleton.GetInstancia();

        System.out.println("O professor " + p1.getNome() + " está usando o projetor " + projetor);

        // Criação do objeto PROJETOR por meio do padrão Singleton e provando que o objeto retornado é o mesmo do criado anteriomente

        ProjetorSingleton projetor1 = ProjetorSingleton.GetInstancia();

        System.out.println("\nO professor " + p2.getNome() + " está usando o projetor " + projetor1);

    }
    
}
