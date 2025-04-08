package model;

public class PersonalizedReportBuilder implements IbuilderReport {
    private  PersonalizedReport personalizedReport;//se agrego este atributo que no estaba en el uml
  
    @Override
    public void reset() {//metodo que no esta en el uml pero es necesario para el patron builder
       this.personalizedReport = new PersonalizedReport();
        
    }
   
    public void typeReport(String textualAnalyzer) {
       this.personalizedReport.setAnalyzerSpecific(textualAnalyzer);
    }

   
  
    public PersonalizedReport Build() {//este metodo se agrego ya que no esta en el uml
       
        return this.personalizedReport;
    }

    @Override
    public void writeTextualAnalyzer(String textualAnalyzer) {
        
        
    }

    @Override
    public void writeSymbolicAnalyzer(String symbolicAnalyzer) {
        
       
    }

    @Override
    public void writeEmocionalAnalyzer(String emocionalAnalyzer) {
       
      
    }

    @Override
    public void writeInterpretationGrafichs(String interpretationGrafichs) {
      
        
    }

    @Override
    public void writeIdream(int idream) {
        this.personalizedReport.setIdDream(idream);
      
    }

 
    
}
