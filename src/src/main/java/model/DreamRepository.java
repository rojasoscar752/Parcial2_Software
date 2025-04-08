package model;

import java.util.ArrayList;

public class DreamRepository {
    private Paciente paciente;
    private ArrayList<Dreams> listDreams;

    public DreamRepository(Paciente paciente) {
        this.paciente = paciente;
        this.listDreams = new ArrayList<>();
    }


    public void registrarInformation(Dreams dream) {
        listDreams.add(dream);
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
                ", Sueños registrados: " + listDreams.size();
    }

    public String mostrarInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sueños de ").append(paciente.getNamePac()).append(":\n");
        for (Dreams dream : listDreams) {
            sb.append("- ").append(dream).append("\n");
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
