package model;

public interface IAnalyzer {
    //public String analyzeDream(Dreams dream, int type);
    public SymbolicAnalyzer getSymbolicAnalyzer(Dreams dream);
    public EmotionalAnalyzer getEmotionalAnalyzer(Dreams dream);
    public StadisticAnalyzer getStatisticAnalyzer(Dreams dream);
    public CognitiveAnalyzer getCognitiveAnalyzer(Dreams dream);
}
