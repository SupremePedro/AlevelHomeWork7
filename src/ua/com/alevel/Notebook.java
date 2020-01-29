package ua.com.alevel;

public class Notebook extends Computer {//верисия маркетинг
   private String name;
   private double priceUSD;
   private double weightKG;
   private double displaySizeInch;

    public Notebook(String name, double priceUSD, double weightKG, double displaySizeInch) {
        this.name = name;
        this.priceUSD = priceUSD;
        this.weightKG = weightKG;
        this.displaySizeInch = displaySizeInch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public double getDisplaySizeInch() {
        return displaySizeInch;
    }

    public void setDisplaySizeInch(double displaySizeInch) {
        this.displaySizeInch = displaySizeInch;
    }
}
