package ar.edu.unahur.obj2.cafe;

public class Azucar extends CafeDecorator {

    private final Double costo;

    public Azucar(ICafe decorado, Double costo) {
        super(decorado);
        this.costo = costo;
    }

    @Override
    public Double doCosto() {
        return this.costo;
    }

    @Override
    public String doNombre() {
        return "Azúcar";
    }

}
