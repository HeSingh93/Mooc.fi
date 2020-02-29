
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return squares > compared.squares;
    }

    public int price() {
        return squares * pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
        int price = price();
        int otherPrice = compared.price();
        if (price > otherPrice) {
            return price - otherPrice;
        } else {
            return otherPrice - price;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return price() > compared.price();
    }

}
