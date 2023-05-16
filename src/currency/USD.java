package currency;

public class USD {
    double CadRate = 1.35;
    double EurRate = 0.92;
    double JpyRate = 135.723;
    double GbpRate = 0.80319;
    double amount;

    public USD(double amount) {
        this.amount = amount;
    }

    // Values get converter to String so it can be formatted
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

    public double ToGbp() {
        double Gbp = this.amount * GbpRate;
        String GbpStr = String.format("%.2f", Gbp);
        Gbp = Double.valueOf(GbpStr);
        return Gbp;
    }
}
