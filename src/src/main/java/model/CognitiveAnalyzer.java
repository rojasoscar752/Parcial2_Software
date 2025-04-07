package model;

public class CognitiveAnalyzer extends Analyzer {

    private Dreams dream;
    private String analysis;

    public CognitiveAnalyzer(Dreams dream) {
        super();
        this.dream = dream;
        getAnalysis(dream);
    }

    public void getAnalysis(Dreams dream) {
        this.analysis = "Acá iria un analisis de tipo CognitiveAnalyzer, del sueño con id: " + dream.getIdDream();
    }

    public String getAnalysys() {
        return analysis;
    }

}
