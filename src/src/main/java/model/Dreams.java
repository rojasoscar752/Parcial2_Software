package model;

public class Dreams implements ICloneDream{

    private double duracion;
    private String intensidadEmocinal;
    private String claridadVisual;
    private String patrones;

    public Dreams(double duracion, String intensidadEmocional, String claridadVisual, String patrones) {
        this.duracion = duracion;
        this.intensidadEmocinal = intensidadEmocional;
        this.claridadVisual = claridadVisual;
        this.patrones = patrones;
    }
    @Override
    public Dreams cloneDream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cloneDream'");
    }
    @Override
    public Dreams resetDream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetDream'");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
