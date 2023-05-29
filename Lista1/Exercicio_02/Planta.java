package Exercicio_02;

public class Planta
{
    private String nome;
    private int estoqueIdeal;
    private int quantidadeEmEstoque;
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEstoqueIdeal(final int estoqueIdeal) {
        this.estoqueIdeal = estoqueIdeal;
    }
    
    public int getEstoqueIdeal() {
        return this.estoqueIdeal;
    }
    
    public void setQuantidadeEmEstoque(final int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }
}
