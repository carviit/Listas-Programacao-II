package Exercicio_07;

public class Invoice {

    private int numeroDoItem;

    private String descricaoDoItem;

    private int quantidadeDoItem;

    private double precoDoItem;

    public int getNumeroDoItem() {
        return this.numeroDoItem;
    }

    public void setNumeroDoItem(int numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public String getdescricaoDoItem() {
        return this.descricaoDoItem;
    }

    public void setdescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public int getQuantidadeDoItem() {
        return this.quantidadeDoItem;
    }

    public void setQuantidadeDoItem(int quantidadeDoItem) {
        this.quantidadeDoItem = quantidadeDoItem;
    }

    public double getprecoDoItem() {
        return this.precoDoItem;
    }

    public void setprecoDoItem(double precoDoItem) {
        this.precoDoItem = precoDoItem;
    }

    public Invoice(int numeroDoItem, String descricaoDoItem, int quantidadeDoItem, double precoDoItem) {
        
        if (quantidadeDoItem < 0) {
            
            this.quantidadeDoItem = 0;
        }
        
        if (precoDoItem < 0.0) {
           
            this.precoDoItem = 0.0;
        }
        
        this.numeroDoItem = numeroDoItem;
        
        this.descricaoDoItem = descricaoDoItem;
        
        this.quantidadeDoItem = quantidadeDoItem;
        
        this.precoDoItem = precoDoItem;
    }

    public double getInvoiceAmount() {
        return (double)this.quantidadeDoItem * this.precoDoItem;
    }

}