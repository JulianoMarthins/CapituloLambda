package Aula01_LambdaComparadores;

public class Product {

    private String name;
    private Double price;

    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return "Nome: " + getName() + " R$ " + String.format("%.2f", getPrice());
    }

}
