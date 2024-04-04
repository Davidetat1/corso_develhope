/*
Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
Stampa a video il risultato della funzione draw di ogni shape creata
 */

package java_advanced.designPattern.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape forma1 = shapeFactory.createShape(TipoForma.RETTANGOLO);
        forma1.draw();

        Shape forma2 =shapeFactory.createShape(TipoForma.CERCHIO);
        forma2.draw();

        Shape forma3 = shapeFactory.createShape(TipoForma.QUADRATO);
        forma3.draw();

        Shape forma4 = shapeFactory.createShape(TipoForma.TRIANGOLO);
        forma4.draw();
    }

}
