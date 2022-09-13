
public class PriceInfo {

    private String id;

    public PriceInfo() {
    }

    public PriceInfo(String id, String name, double priceinUsd) {
        this.id = id;
        this.name = name;
        this.priceinUsd = priceinUsd;
    }

    private String name;
    private double priceinUsd;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceinUsd(double priceinUsd) {
        this.priceinUsd = priceinUsd;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceinUsd() {
        return priceinUsd;
    }
}
