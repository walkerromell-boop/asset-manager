package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House() {
    }

    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSquareFoot;
        switch (condition) {

            case 1:
                pricePerSquareFoot = 180.00;
                break;
            case 2:
                pricePerSquareFoot = 130.00;
            case 3:
                pricePerSquareFoot = 90.00;
                break;
            case 4:
                pricePerSquareFoot = 80.00;
                break;
            default:
                pricePerSquareFoot = 0.00;
                break;
        }
        return (pricePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }

//    @Override
//    public String toString() {
//        return "House{" +
//                "address='" + address + '\'' +
//                ", condition=" + condition +
//                ", squareFoot=" + squareFoot +
//                ", lotSize=" + lotSize +
//                '}';
//    }

    @Override
    public String toString() {
        return String.format(
                "House at %s (%s condition) - %,d sq ft, lot size %,d sq ft, Value: $%,.2f",
                address,
                getCondition(),
                squareFoot,
                lotSize,
                getValue()
        );
    }

}
