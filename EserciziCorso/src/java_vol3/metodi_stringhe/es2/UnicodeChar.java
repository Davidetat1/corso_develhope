package java_vol3.metodi_stringhe.es2;

public class UnicodeChar {
    private String str;
    private int index;

    public UnicodeChar(String str, int index) {
        this.str = str;
        this.index = index;
    }

    public String findUnicodeChar() {
        StringBuilder result = new StringBuilder();
        if ( index >= 0 && index < str.length()){
            result.append("Il carattere Unicode all'indice ");
            result.append(index);
            result.append(" è ");
            result.append((int) str.charAt(index));
        } else {
            result.append("Errore: l'indice è fuori dal range della stringa.");
        }
        return result.toString();
    }
}
