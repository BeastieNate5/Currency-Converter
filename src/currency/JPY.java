package currency;

public class JPY {
    double UsdRate = 0.00737;
    double CadRate = 0.00998;
    double EurRate = 0.00679;
    double GbpRate = 0.00592;
    double amount;

    public JPY(double amount) {
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

    public double ToGbp() {
        double Gbp = this.amount * GbpRate;
        String GbpStr = String.format("%.2f", Gbp);
        Gbp = Double.valueOf(GbpStr);
        return Gbp;
    }
}
