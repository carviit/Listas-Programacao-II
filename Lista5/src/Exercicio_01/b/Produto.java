package Exercicio_01.b;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, int id, double preco) {

        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {

        Produto p = (Produto) obj;

        return this.id == p.id;

    }

    @Override
    public int hashCode() {

        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {

        return "Nome: " + this.nome + "\n" +
                "ID: " + this.id + "\n" +
                "Preço: R$ " + this.preco;
    }

}
