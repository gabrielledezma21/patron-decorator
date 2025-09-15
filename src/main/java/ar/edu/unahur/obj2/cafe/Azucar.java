package ar.edu.unahur.obj2.cafe;

public class Azucar extends CafeDecorator {

    private final Double costo;

    public Azucar(ICafe decorado, Double costo) {
        super(decorado);
        this.costo = costo;
    }

    @Override
    public Double costo() {
        return decorado.costo() + this.costo;
    }

}
