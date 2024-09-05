package test;

public class Instrument {
    
        private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

        public Instrument() {
            type = "null";
            price = 0;
        }

        public Instrument(String a, double b) {
            type = a;
            price = b;
        }

        public void print() {
            System.out.println(type + "price : " + price);
        }
    
}
