package Exercicio_02.abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> map = new HashMap<String, String>();

        String key;

        // Adição dos funcionários no MAP

        map.put("a1234", "Steve Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1237", "Larry Ellison");
        map.put("a1238", "Bill Gates");

        // Recuperação do funcionário pelo IDENFICADOR

        System.out.println(map.get("a1234"));
        System.out.println(map.get("a1235"));

        // Recuperação do funcionário pelo IDENFICADOR que não está no MAP

        System.out.println(map.get("a1229"));

        // Busca de um FUNCIONÁRIO pelo ID

        System.out.println("===== B U S C A  D E  F U N C I O N Á R I O =====");

        System.out.print("Digite o identificador para verificar se o mesmo se encontra cadastrado: ");
        key = input.nextLine();

        key = key.toLowerCase();

        if (map.get(key) != null) {

            System.out.println("\nFuncionario: " + map.get(key));

        } else {

            System.out.println("\n>>ERRO, ID NÃO SE ENCONTRA CADASTRADO NO SISTEMA");
        }

        input.close();
    }

}
