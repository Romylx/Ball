package ru.mirea.pr1;

public class Ball {
    private String type;
    private String manufacturer;

    public Ball(String type, String manufacturer) {
        setType(type);
        setManufacturer(manufacturer);

    }
    public void setType(String type) { this.type = type; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getBallType() {return type; }
    public String getballMenufacturer() {
        return  this.manufacturer;
    }
    public String toString() {
        return "Ball type: " + "\nBall manufacturer: " + this.manufacturer + "\n";
     }

}


