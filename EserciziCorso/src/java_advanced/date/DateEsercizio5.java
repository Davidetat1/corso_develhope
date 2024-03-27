/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
Verificare che la prima data è precedente alla seconda
Verificare che la seconda data è successiva alla prima
Verificare che le due date sono uguali ad ora
Stampa il risultato
 */

package java_advanced.date;

import java.time.OffsetDateTime;

public class DateEsercizio5 {
    public static void main(String[] args) {

        OffsetDateTime dataInput = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime dataInput2 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        boolean primaDataAntecedente = dataInput.isBefore(dataInput2);
        boolean secondaDataSuccessivaAllaPrima = dataInput2.isAfter(dataInput);
        boolean sonoUguali = dataInput.isEqual(dataInput2);

        System.out.println("La prima data è antecedente alla seconda data: " + primaDataAntecedente);
        System.out.println("La seconda data è successiva alla prima data: " + secondaDataSuccessivaAllaPrima);
        System.out.println("Le date sono ugali: " + sonoUguali);


    }
}
