package model;

public class EmotionalAnalyzer extends Analyzer {

    private Dreams dream;
    private String analysis;

    public EmotionalAnalyzer(Dreams dream) {
        super();
        this.dream = dream;
        getAnalysis(dream);
    }

    public void getAnalysis(Dreams dream) {
        this.analysis = "Acá iria un analisis de tipo EmotionalAnalyzer, del sueño con id: " + dream.getIdDream();
    }

    public String getAnalysys() {
        return analysis;
    }


}
