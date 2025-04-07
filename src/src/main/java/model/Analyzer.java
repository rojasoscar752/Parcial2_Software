package model;

public class Analyzer implements IAnalyzer{


    @Override
    public SymbolicAnalyzer getSymbolicAnalyzer(Dreams dream) {
        return new SymbolicAnalyzer(dream);
    }
    @Override
    public EmotionalAnalyzer getEmotionalAnalyzer(Dreams dream) {
        return new EmotionalAnalyzer(dream);
    }
    @Override
    public StadisticAnalyzer getStatisticAnalyzer(Dreams dream) {
        return new StadisticAnalyzer(dream);
    }
    @Override
    public CognitiveAnalyzer getCognitiveAnalyzer(Dreams dream) {
        return new CognitiveAnalyzer(dream);
    }

}
