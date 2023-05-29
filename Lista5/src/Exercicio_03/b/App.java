package Exercicio_03.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        ArrayList<Empregados> empresa = new ArrayList<>();

        // Criação dos funcionários e adição dos mesmos no ARRAY LIST

        Empregados e1 = new Empregados("3FC3", "Carlos Vitor", 1400.60, "24/10/2022");
        Empregados e2 = new Empregados("45FC", "Luiz Henrique", 1340.60, "03/05/2021");
        Empregados e3 = new Empregados("VF34", "Roberto Flávio", 1000.60, "16/01/2023");

        empresa.add(e1);
        empresa.add(e2);
        empresa.add(e3);

        // Ordenação dos funcionários pelo salário e exibição do ARRAY LIST;

        empresa.sort(Comparator.comparing(Empregados::getSalario));

        System.out.println("======== O R D E M  D O  S A L A R I O ========\n");

        for (Empregados empregados : empresa) {

            System.out.println(empregados.toString());

            System.out.println("\n");

        }

        // Ordenação dos funcionários por ordem alfabética e exibição do ARRAY LIST

        empresa.sort(Comparator.comparing(Empregados::getNome));

        System.out.println("======== O R D E M  A L F Á B É T I C A ========\n");

        for (Empregados empregados : empresa) {

            System.out.println(empregados.toString());

            System.out.println("\n");

        }

        // Atribuição do empregado com menor salário retornado pela biblioteca
        // collections e exibição do mesmo.

        Empregados empregadoComMenorSalario = Collections.min(empresa,
                Comparator.comparingDouble(Empregados::getSalario));

        System.out.println("== EMPREGADO COM MENOR SALÁRIO ==\n");

        System.out.println(empregadoComMenorSalario.toString());

        // Atribuição do empregado com maior salário retornado pela biblioteca
        // collections e exibição do mesmo.

        Empregados empregadoComMaiorSalario = Collections.max(empresa,
                Comparator.comparingDouble(Empregados::getSalario));

        System.out.println("\n== EMPREGADO COM MAIOR SALÁRIO ==\n");

        System.out.println(empregadoComMaiorSalario.toString());

        // Atribuição do empregado com maior tempo na empresa retornado pela biblioteca
        // collections e exibição do mesmo.

        Empregados maisAntigo = Collections.min(empresa, Comparator.comparing(empregado -> LocalDate
                .parse(empregado.getDataDeContrato(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        System.out.println("\n== EMPREGADO COM MAIOR TEMPO NA EMPRESA ==\n");

        System.out.println(maisAntigo.toString());

        // Atribuição do empregado com menor tempo na empresa retornado pela biblioteca
        // collections e exibição do mesmo.

        Empregados maisNovo = Collections.max(empresa, Comparator.comparing(empregado -> LocalDate
                .parse(empregado.getDataDeContrato(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        System.out.println("\n== EMPREGADO COM MENOR TEMPO NA EMPRESA ==\n");

        System.out.println(maisNovo.toString());

    }


}
