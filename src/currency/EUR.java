package currency;

public class EUR {
    double UsdRate = 1.08487;
    double CadRate = 1.47047;
    double JpyRate = 147.269;
    double GbpRate = 0.87137;
    double amount;

    public EUR(double amount) {
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
