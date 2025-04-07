package model;

public interface ITherapeuticApproach {
    
    public SymbolicAnalyzer getSymbolicAnalyzer();
    public EmotionalAnalyzer getEmotionalAnalyzer();
    public StadisticAnalyzer getStatisticAnalyzer();
    public CognitiveAnalyzer getCognitiveAnalyzer();
}
