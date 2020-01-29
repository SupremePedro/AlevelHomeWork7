package ua.com.alevel;

public class Notebook {//верисия производитель
    private String model;
    private double plasticConsumption;
    private double cordLength;
    int humanHoursConsumption;

    public Notebook(String model, double plasticConsumption, double cordLength, int humanHoursConsumption) {
        this.model = model;
        this.plasticConsumption = plasticConsumption;
        this.cordLength = cordLength;
        this.humanHoursConsumption = humanHoursConsumption;
    }

    public double getPlasticConsumption() {
        return plasticConsumption;
    }

    public void setPlasticConsumption(double plasticConsumption) {
        this.plasticConsumption = plasticConsumption;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public int getHumanHoursConsumption() {
        return humanHoursConsumption;
    }

    public void setHumanHoursConsumption(int humanHoursConsumption) {
        this.humanHoursConsumption = humanHoursConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
