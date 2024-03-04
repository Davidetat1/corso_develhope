/*
A partire dal programma creato precedentemente in cui si
richiedeva il calcolo dell'area, aggiungere una ulteriore classe
chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
*/

package java_vol3.ereditarieta.es2;

public class Triangolo extends Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
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

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        System.out.println("l'area del triangolo è base per altezza diviso 2");
        return (base * altezza) / 2 ;
    }
}
