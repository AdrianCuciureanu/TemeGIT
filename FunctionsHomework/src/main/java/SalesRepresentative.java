public class SalesRepresentative {
    private String name;
    private int numberOfSales;
    private int salesQuota;
    private int revenueGenerated;

    public SalesRepresentative(String name, int numberOfSales, int salesQuota) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.salesQuota = salesQuota;
        revenueGenerated = numberOfSales * salesQuota;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public int getSalesQuota() {
        return salesQuota;
    }

    public int getRevenueGenerated() {
        return revenueGenerated;
    }

    @Override
    public String toString() {
        return "SalesRepresentative: " +
                "name='" + name + '\'' +
                ", numberOfSales=" + numberOfSales +
                ", salesQuota=" + salesQuota +
                ", revenueGenerated=" + revenueGenerated;
    }
}
