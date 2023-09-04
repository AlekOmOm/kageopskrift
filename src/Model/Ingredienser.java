package Model;

public class Ingredienser {
    private String type;
    private double mængde;
    private String unit;
    private final int originaltAntal = 4;
    private double Kcal;

    private double vægtPrEnhed;

    public Ingredienser(String type, double mængde, String unit, double Kcal) {
        this.type = type;
        this.mængde = mængde;
        this.unit = unit;
        this.Kcal = Kcal;
    }

    public String getType() {
        return this.type;
    }

    public double getKcal() {
        return Kcal;
    }

    public void setKcal(double kcal) {
        Kcal = kcal;
    }

    public double getMængde() {
        return this.mængde;
    }

    public String getUnit() {
        return this.unit;
    }

    public int getOriginaltAntal() {
        return this.originaltAntal;
    }

    public void setMængde(double mængde) {
        this.mængde = mængde;
    }


    @Override
    public String toString() {
        return "Model.Ingredienser{" +
                "type='" + type + '\'' +
                ", mængde=" + mængde +
                ", unit='" + unit + '\'' +
                ", Kcal=" + Kcal +
                '}';
    }
}
