public class Smartphone extends Device {
    private int height;
    private int width;

    public Smartphone(String type, double price, double weight, int height, int width) {
        super(type, price, weight);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "\nSmartphone {" +
                "price=" + this.getPrice() + '$' +
                ", weight=" + this.getWeight() + " kg" +
                ", height=" + height + " cm" +
                ", width=" + width + " cm" +
                '}';
    }
}
