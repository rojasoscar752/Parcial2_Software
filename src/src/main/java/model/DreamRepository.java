package model;

import java.util.ArrayList;

public class DreamRepository {
    private Paciente paciente;
    private ArrayList<Dreams> listDreams;
    private ArrayList<PersonalizedReport> listPersonalizedReport;
    private ArrayList<StandartReport> listStandartReportReport; ;


    public DreamRepository(Paciente paciente) {
        this.paciente = paciente;
        this.listDreams = new ArrayList<>();
        this.listPersonalizedReport = new ArrayList<>();
        this.listStandartReportReport = new ArrayList<>();
    }


    public void registrarInformation(Dreams dream) {
        listDreams.add(dream);
    }
    public void registrarPersonalizedReport(PersonalizedReport personalizedReport) {
        listPersonalizedReport.add(personalizedReport);
    }
    public void registrarStandartReport(StandartReport standartReport) {
        listStandartReportReport.add(standartReport);
    }
    public Dreams getDream(int idDream) {
        for (Dreams dream : listDreams) {
            if (dream.getIdDream() == idDream) {
                return dream;
            }
        }
        return null; 
    }

    public String traerInformacion() {
        return "Información del paciente: " + paciente.getNamePac() +
                ", Sueños registrados: " + listDreams.size()+
                ", Reportes personalizados: " + listPersonalizedReport.size() +
                ", Reportes estandar: " + listStandartReportReport.size();

    }

    public String mostrarInformationDreams() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sueños de ").append(paciente.getNamePac()).append(":\n");
        for (Dreams dream : listDreams) {
            sb.append("- ").append(dream).append("\n");
        }
        return sb.toString();
    }
//estos dos los genero copilot no se sabe si esten bien
    public String mostrarPersonalizedReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reportes personalizados de ").append(paciente.getNamePac()).append(":\n");
        for (PersonalizedReport personalizedReport : listPersonalizedReport) {
            sb.append("- ").append(personalizedReport).append("\n");
        }
        return sb.toString();
    }
  
    public String mostrarStandartReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reportes estandar de ").append(paciente.getNamePac()).append(":\n");
        for (StandartReport standartReport : listStandartReportReport) {
            sb.append("- ").append(standartReport).append("\n");
        }
        return sb.toString();
    }
    public Paciente getPaciente() {
        return paciente;
    }


    public ArrayList<Dreams> getListDreams() {
        return listDreams;
    }
    
    
}
