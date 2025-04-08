package model;

public class Dreams implements ICloneDream<Dreams>{

    private int idDream;
    private double duracion;
    private String intensidadEmocinal;
    private String claridadVisual;
    private String patrones;
    private String narrative;

    public Dreams(int idDream, double duracion, String intensidadEmocional, String claridadVisual, String patrones,String narrative) {
        this.idDream = idDream;
        this.duracion = duracion;
        this.intensidadEmocinal = intensidadEmocional;
        this.claridadVisual = claridadVisual;
        this.patrones = patrones;
        this.narrative = narrative;
    }

    public int getIdDream() {
        return idDream;
    }
    public String getClaridadVisual() {
        return claridadVisual;
    }
    public double getDuracion() {
        return duracion;
    }
    public String getIntensidadEmocinal() {
        return intensidadEmocinal;
    }
    public String getNarrative() {
        return narrative;
    }
    public String getPatrones() {
        return patrones;
    }
    public void setIdDream(int idDream) {
        this.idDream = idDream;
    }
    public void setClaridadVisual(String claridadVisual) {
        this.claridadVisual = claridadVisual;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void setIntensidadEmocinal(String intensidadEmocinal) {
        this.intensidadEmocinal = intensidadEmocinal;
    }
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }
    public void setPatrones(String patrones) {
        this.patrones = patrones;
    }

    @Override
    public String toString() {
        return "id sueño " + idDream + ", duracion=" + duracion + ", intensidadEmocinal=" + intensidadEmocinal
                + ", claridadVisual=" + claridadVisual + ", patrones=" + patrones + ", narrative=" + narrative;
    }

    @Override
    public Dreams clone() {
        return new Dreams(this.idDream,this.duracion,this.intensidadEmocinal,this.claridadVisual,this.patrones,this.narrative);
    }
    
}
