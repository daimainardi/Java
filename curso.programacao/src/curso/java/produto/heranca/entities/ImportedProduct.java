package curso.java.produto.heranca.entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() +" $ " + String.format("%.2f", totalPrice()) + String.format(" (Customs fee: $ %.2f)", this.customsFee);
    }
    public Double totalPrice(){
        return super.getPrice() + this.customsFee;
    }

}
