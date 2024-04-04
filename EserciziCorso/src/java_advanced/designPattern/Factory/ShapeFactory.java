package java_advanced.designPattern.Factory;

public class ShapeFactory {

    public Shape createShape(TipoForma forma) {
        switch (forma) {
            case CERCHIO -> {
                return new Cerchio();
            }
            case QUADRATO -> {
                return new Quadrato();
            }
            case TRIANGOLO -> {
                return new Triangolo();
            }
            case RETTANGOLO -> {
                return new Rettangolo();
            }
        }
        return null;
    }
}
