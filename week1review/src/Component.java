public class Component {
    private double price;
    private String name;

    public Component() {
        price = 100.0;
        name = "no name component";
    }
    public Component(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
