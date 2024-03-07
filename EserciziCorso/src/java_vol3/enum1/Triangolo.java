package java_vol3.enum1;

public class Triangolo extends Forma{

    private double base = 0.0;
    private double altezza = 0.0;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        super.setTipoForma(TipoForma.TRIANGOLO);

    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAlteza(double alteza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza / 2 ;
    }

}
