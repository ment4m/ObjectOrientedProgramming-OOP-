package ment.introduction;

public class CellPhone {
    private String manufact;
    private int model;
    private double retailPrice;

    public CellPhone(String manufact, int model, double retailPrice) {
        this.manufact = manufact;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    public void setManufact(String manufact){
        this.manufact = manufact;
    }

    public void setModel(int model){
        this.model = model;
    }
    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }
}
