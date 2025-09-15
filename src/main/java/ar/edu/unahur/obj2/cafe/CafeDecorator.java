package ar.edu.unahur.obj2.cafe;

public abstract class CafeDecorator implements ICafe {

    protected ICafe decorado;

    public CafeDecorator(ICafe decorado) {
        this.decorado = decorado;
    }

    @Override
    public Double costo() {
        return decorado.costo() + doCosto();
    }

    public abstract Double doCosto();

    @Override
    public String nombrePosDecorado() {
        return decorado.nombrePosDecorado() + " " + doNombre();
    }

    public abstract String doNombre();

    @Override
    public String nombrePreDecorado() {
        return doNombre() + " " + decorado.nombrePreDecorado();
    }

}
