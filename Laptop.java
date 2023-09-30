public class Laptop extends Device {
    private String modelName;
    private String laptopType;

    public Laptop(String type, double price, double weight, String modelName, String laptopType) {
        super(type, price, weight);
        this.modelName = modelName;
        this.laptopType = laptopType;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    @Override
    public String toString() {
        return "\nLaptop {" +
                "price=" + this.getPrice() + '$' +
                ", weight=" + this.getWeight() + " kg" +
                ", modelName='" + modelName + '\'' +
                ", laptopType='" + laptopType + '\'' +
                '}';
    }
}
