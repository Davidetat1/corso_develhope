package java_vol3.enum1;

public class Forma {

    private TipoForma tipoForma;

    public TipoForma getTipoForma() {
        return tipoForma;
    }

    public void setTipoForma(TipoForma tipoForma) {
        this.tipoForma = tipoForma;
    }


    public double calcolaArea(){
        System.out.println("Calcolo area");
        return 0.0;
    }
}
