package model;

public class PersonalizedReport {
    private String analyzerSpecific;
    private int idDream;

    public PersonalizedReport() {
    }

    public void setAnalyzerSpecific(String analyzerSpecific) {
        this.analyzerSpecific = analyzerSpecific;
    }

    public void setIdDream(int idDream) {
        this.idDream = idDream;
    }

    @Override
    public String toString() {
        return "Analisis especifico: " + analyzerSpecific + ", realizado al sueño #: " + idDream;
    }
}
