package multithread;

class Stall implements Runnable {
    private String stallName;
    private String stallDetails;
    private double stallArea;
    private double stallCost;
    private String owner;

    public Stall() {
    }

    public Stall(String stallName, String stallDetails, double stallArea, String owner) {
        this.stallName = stallName;
        this.stallDetails = stallDetails;
        this.stallArea = stallArea;
        this.owner = owner;
    }

    public double getStallArea() {
        return stallArea;
    }

    public String getOwner() {
        return owner;
    }

    public String getStallName() {
        return stallName;
    }

    public String getStallDetails() {
        return stallDetails;
    }

    public double getStallCost() {
        return stallCost;
    }

    public void run() {

        stallCost = stallArea * 150;
    }
}