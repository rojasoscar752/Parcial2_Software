package model;

import java.util.ArrayList;

public class TherapyApprouchFactory  implements ITherapeuticApproach{
    private ArrayList <Analyzer> analyzerJungiano;
    private ArrayList <Analyzer> analyzerConductual;

    @Override
    public TherapyApprouchFactory getApprouach(String typeApproach, Dreams dream) {
        Analyzer analyzerSpecific = new Analyzer();
        if (typeApproach.equalsIgnoreCase("jungiano")) {
            analyzerJungiano.add(analyzerSpecific.getSymbolicAnalyzer(dream));
            analyzerJungiano.add(analyzerSpecific.getEmotionalAnalyzer(dream));
        }else{
            analyzerConductual.add(analyzerSpecific.getStatisticAnalyzer(dream));
            analyzerConductual.add(analyzerSpecific.getCognitiveAnalyzer(dream));
        }
        return this;
    }

    public ArrayList<Analyzer> getAnalyzerConductual() {
        return analyzerConductual;
    }

    public ArrayList<Analyzer> getAnalyzerJungiano() {
        return analyzerJungiano;
    }

}
