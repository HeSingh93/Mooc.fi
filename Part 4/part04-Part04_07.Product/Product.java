public class Product {

    private String initialName;
    private double initialPrice;
    private int initialQuality;

    public Product(String initialName, double initialPrice, int initialQuality) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuality = initialQuality;
    }

    public void printProduct(){
        System.out.println(initialName + initialPrice + initialQuality);
    }
}

