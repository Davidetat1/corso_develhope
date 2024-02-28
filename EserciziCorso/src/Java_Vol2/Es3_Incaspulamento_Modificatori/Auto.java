package Java_Vol2.Es3_Incaspulamento_Modificatori;

public class Auto {
    private String marca;

    private String modello;

    private String targa;

    private double cilindrata;

    public Auto(String marca, String modello, String targa, double cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void stampaInfo(){
        System.out.println("Auto: " + getMarca());
        System.out.println("Modello: " + getModello());
        System.out.println("Targa: " + getTarga());
        System.out.println("Cilindrata: " + getCilindrata());
    }
    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
