package ar.edu.unahur.obj2.cafe;

public class Leche extends CafeDecorator {

    private final Double costo;

    public Leche(ICafe decorado, Double costo) {
        super(decorado);
        this.costo = costo;
    }

    @Override
    public Double doCosto() {
        return this.costo;
    }

}
