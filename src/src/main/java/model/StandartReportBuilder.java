package model;

public class StandartReportBuilder implements IbuilderReport {
    private  StandartReport standarReport;//se agrego este atributo que no estaba en el uml
  
    @Override
    public void reset() {//metodo que no esta en el uml pero es necesario para el patron builder
       this.standarReport = new StandartReport();
        
    }
    @Override
    public void writeTextualAnalyzer(String textualAnalyzer) {
        this.standarReport.setTextualAnalyzer(textualAnalyzer);
    }

    @Override
    public void writeSymbolicAnalyzer(String symbolicAnalyzer) {
       this.standarReport.setSymbolicAnalyzer(symbolicAnalyzer);
    }

    @Override
    public void writeEmocionalAnalyzer(String emocionalAnalyzer) {
       this.standarReport.setEmocionalAnalyzer(emocionalAnalyzer);
    }

    @Override
    public void writeInterpretationGrafichs(String interpretationGrafichs) {
        this.standarReport.setInterpretationGrafichs(interpretationGrafichs);
    }

  
    public StandartReport Build() {//este metodo se agrego ya que no esta en el uml
       
        return this.standarReport;
    }
    @Override
    public void writeIdream(int  idream) {
       this.standarReport.setIdDream(idream);
    }
   

 
    
}
