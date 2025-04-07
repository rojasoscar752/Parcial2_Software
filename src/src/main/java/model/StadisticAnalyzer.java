package model;

public class StadisticAnalyzer extends Analyzer{

    private Dreams dream;
    private String analysis;

    public StadisticAnalyzer(Dreams dream) {
        super();
        this.dream = dream;
        getAnalysis(dream);
    }

    public void getAnalysis(Dreams dream) {
        this.analysis = "Acá iria un analisis de tipo StadisticAnalyzer, del sueño con id: " + dream.getIdDream();
    }

    public String getAnalysys() {
        return analysis;
    }

}
