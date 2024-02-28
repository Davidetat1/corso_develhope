package Java_Vol2.Getter_Setter_Es2;
public class Auto {

    private String marca;

    private String modello;

    private String targa;

    private String cilindrata;

    public Auto (String marca, String modello, String targa, String cilindrata){
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getmarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public String getTarga(){
        return targa;
    }
    public void setTarga(String targa){
        this.targa = targa;
    }
    public String getCilindrata(){
        return cilindrata;
   }
   public void setCilindrata(String cilindrata){
        this.cilindrata = cilindrata;
   }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                '}';
    }
}
