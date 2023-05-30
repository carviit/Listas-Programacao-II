package Exercicio_02.de;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Map<String, Funcionario> map = new HashMap<String, Funcionario>();

        Scanner input = new Scanner(System.in);

        String key;

        // Adição dos funcionários no MAP

        map.put("a1234", new Funcionario("Steve Jobs", "CEO", 560450.5));
        map.put("a1235", new Funcionario("Scott McNealy", "Coordenador", 120000));
        map.put("a1236", new Funcionario("Jeff Bezos", "Segurança", 10000));
        map.put("a1237", new Funcionario("Larry Ellison", "Contador", 130000));
        map.put("a1238", new Funcionario("Bill Gates", "Fundador", 10000000));

        // BUSCA DE UM FUNCIONÁRIO PELO ID

        System.out.println("===== B U S C A  D E  F U N C I O N Á R I O =====");

        System.out.print("\nDigite o identificador para verificar se o mesmo se encontra cadastrado: ");
        key = input.nextLine();

        key = key.toLowerCase();

        if (map.get(key) != null) {

            System.out.println("\n");

            System.out.println(map.get(key).toString());

        } else {

            System.out.println("\n>>ERRO, ID NÃO SE ENCONTRA CADASTRADO NO SISTEMA\n");
        }

        input.close();

        // EXIBIÇÃO DOS FUNCIONÁRIOS PERCORRENDO O MAP

        System.out.println("========== F U N C I O N Á R I O S ==========\n");

        for (Map.Entry<String, Funcionario> entry : map.entrySet()) {

            String chave = entry.getKey();
            Funcionario f = entry.getValue();

            System.out.println("ID: " + chave + "\n" + f.toString());

        }
    }

}
