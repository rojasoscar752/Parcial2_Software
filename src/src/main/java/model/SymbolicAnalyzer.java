package model;

public class SymbolicAnalyzer extends Analyzer{

    private Dreams dream;
    private String analysis;

    public SymbolicAnalyzer(Dreams dream) {
        super();
        this.dream = dream;
        getAnalysis(dream);
    }

    public void getAnalysis(Dreams dream) {
        this.analysis = "Acá iria un analisis de tipo SymbolicAnalysis, del sueño con id: " + dream.getIdDream();
    }

    public String getAnalysys() {
        return analysis;
    }

}
