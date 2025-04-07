package model;

public class TherapyApprouchFactory  implements ITherapeuticApproach{

    private SymbolicAnalyzer symbolic;
    private EmotionalAnalyzer emotional;
    private StadisticAnalyzer stadistics;
    private CognitiveAnalyzer cognitive;
    @Override
    public SymbolicAnalyzer getSymbolicAnalyzer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSymbolicAnalyzer'");
    }
    @Override
    public EmotionalAnalyzer getEmotionalAnalyzer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmotionalAnalyzer'");
    }
    @Override
    public StadisticAnalyzer getStatisticAnalyzer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatisticAnalyzer'");
    }
    @Override
    public CognitiveAnalyzer getCognitiveAnalyzer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCognitiveAnalyzer'");
    }

}
