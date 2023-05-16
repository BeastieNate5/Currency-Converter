package currency;

public class GBP {
    double UsdRate = 1.24467;
    double CadRate = 1.68707;
    double EurRate = 1.14704;
    double JpyRate = 168.934;
    double amount;

    public GBP(double amount) {
        this.amount = amount;
    }

    // Values get converter to String so it can be formatted
    public double ToUsd() {
        double Usd = this.amount * UsdRate;
        String UsdStr = String.format("%.2f", Usd);
        Usd = Double.valueOf(UsdStr);
        return Usd;
    }

    public double ToCad() {
        double Cad = this.amount * CadRate;
        String CadStr = String.format("%.2f", Cad);
        Cad = Double.valueOf(CadStr);
        return Cad;
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
}
