package java_vol3.classi_astratte;

public class Rettangolo extends Forma {

    protected float base;
    protected float altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del Rettangolo è = " + base * altezza);
    }
}
