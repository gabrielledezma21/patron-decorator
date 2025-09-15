package ar.edu.unahur.obj2.cafe;

public class Cafe implements ICafe {

    private final Double costo;

    public Cafe(Double costo) {
        this.costo = costo;
    }

    @Override
    public Double costo() {
        return this.costo;
    }

}
