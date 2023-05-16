package currency;

public class CAD {
    double UsdRate = 0.73751;
    double EurRate = 0.67964;
    double JpyRate = 100.097;
    double GbpRate = 0.59237;
    double amount;

    public CAD(double amount) {
        this.amount = amount;
    }

    // Values get converter to String so it can be formatted
    public double ToUsd() {
        double Usd = this.amount * UsdRate;
        String UsdStr = String.format("%.2f", Usd);
        Usd = Double.valueOf(UsdStr);
        return Usd;
    }

    public double ToEur() {
        double Eur = this.amount * EurRate;
        String EurStr = String.format("%.2f", Eur);
        Eur = Double.valueOf(EurStr);
        return Eur;
    }

    public double ToJpy() {
        double Jpy = this.amount * JpyRate;
        String JpyStr = String.format("%.2f", Jpy);
        Jpy = Double.valueOf(JpyStr);
        return Jpy;
    }

    public double ToGbp() {
        double Gbp = this.amount * GbpRate;
        String GbpStr = String.format("%.2f", Gbp);
        Gbp = Double.valueOf(GbpStr);
        return Gbp;
    }
}
