package java_vol3.enum1;

public class Rettangolo extends Forma {
    private double base = 0.0;
    private double altezza = 0.0;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        super.setTipoForma(TipoForma.RETTANOGLO);
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
