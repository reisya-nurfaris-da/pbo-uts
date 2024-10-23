/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package computer.user.kiosTembakau;

/**
 *
 * @author user
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, String type, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - Rp." + price;
    }
}

class Tobacco extends Product {
    private double nicotineContent;

    public Tobacco(String name, double price, double nicotineContent) {
        super(name, "Tobacco", price);
        this.nicotineContent = nicotineContent;
    }

    public double getNicotineContent() {
        return nicotineContent;
    }

    public void setNicotineContent(double nicotineContent) {
        this.nicotineContent = nicotineContent;
    }

    @Override
    public String toString() {
        return super.toString() + " (Nic: " + nicotineContent + "mg";
    }
}

class Roller extends Product {
    private String material; 

    public Roller(String name, double price, String material) {
        super(name, "Roller", price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " (Material: " + material + ")";
    }
}

class Paper extends Product {
    private String size;

    public Paper(String name, double price, String size) {
        super(name, "Paper", price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " (Size: " + size + ")";
    }
}

class Filter extends Product {
    private String filterType;

    public Filter(String name, double price, String filterType) {
        super(name, "Filter", price);
        this.filterType = filterType;
    }


    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @Override
    public String toString() {
        return super.toString() + " (Filter Type: " + filterType + ")";
    }
}
