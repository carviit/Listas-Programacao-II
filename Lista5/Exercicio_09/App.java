package Exercicio_09;

public class App {

    public static void main(String[] args) {

        try {

            someMethod();

        } catch (Exception e) {

            System.out.print("ERRO: ");

            e.printStackTrace();

        }

    }

    public static void someMethod() throws Exception {

        try {

            someMethod2();

        } catch (Exception e) {

            throw e;

        }

    }

    public static void someMethod2() throws Exception {

        throw new ArrayIndexOutOfBoundsException();

    }

}
