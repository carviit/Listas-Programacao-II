package Exercicio_02;

public class TesteIncremental {

    public static void main(String[] args){

        // Podemos Observar que o objeto sempre será o mesmo, pois estará sempre apontando para um endereço de memória criado na primeira iteração do FOR

        for(int i = 0; i < 10; i ++){

            IncrementalSingleton inc = IncrementalSingleton.GetInstancia();

            System.out.println(inc);

        }
    }
    
}
