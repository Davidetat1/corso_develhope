package java_advanced.designPattern.singleton;

public class User {
    private String nome;
    private int eta;

    private static User instance;

    public static User getInstance(){
        if (instance == null){
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampaInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome=' " + nome + '\'' +
                ", eta= " + eta +
                '}';
    }
}
