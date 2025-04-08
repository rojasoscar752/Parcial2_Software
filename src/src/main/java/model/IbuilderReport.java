package model;

public interface IbuilderReport {
    
    void reset();//necesario para el patron builder que no metimos en el uml
    void writeIdream(int idream);
    void writeTextualAnalyzer(String textualAnalyzer);
    void writeSymbolicAnalyzer(String symbolicAnalyzer);
    void writeEmocionalAnalyzer(String emocionalAnalyzer);
    void writeInterpretationGrafichs(String interpretationGrafichs);
    //se quito el metodo build ya que no se utiliza aqui
    
}
