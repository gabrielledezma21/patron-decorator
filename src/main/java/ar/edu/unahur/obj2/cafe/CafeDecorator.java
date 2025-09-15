package ar.edu.unahur.obj2.cafe;

public abstract class CafeDecorator implements ICafe {

    protected ICafe decorado;

    public CafeDecorator(ICafe decorado) {
        this.decorado = decorado;
    }

}
