package model;

import java.util.ArrayList;

public class DreamRepository {
    private Paciente paciente;
    private ArrayList<String> listDreams;

    public DreamRepository(Paciente paciente) {
        this.paciente = paciente;
        this.listDreams = new ArrayList<>();
    }

    public void registrarInformation(String dream) {
        listDreams.add(dream);
    }

    public String traerInformacion() {
        return "Información del paciente: " + paciente.getNamePac() +
                ", Sueños registrados: " + listDreams.size();
    }

    public String mostrarInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sueños de ").append(paciente.getNamePac()).append(":\n");
        for (String dream : listDreams) {
            sb.append("- ").append(dream).append("\n");
        }
        return sb.toString();
    }
}
