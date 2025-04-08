package presentador;

import java.util.ArrayList;

import model.CognitiveAnalyzer;
import model.DreamRepository;
import model.DreamRepositoryFactory;
import model.Dreams;
import model.EmotionalAnalyzer;
import model.PersonalizedReport;
import model.PersonalizedReportBuilder;
import model.StandartReport;
import model.StandartReportBuilder;
import model.SymbolicAnalyzer;
import model.TherapyApprouchFactory;

public class App {
    private DreamRepositoryFactory dreamRepositoryFactory;
    private ArrayList<DreamRepository> dreamRepositories;

    public App() {
        this.dreamRepositoryFactory = new DreamRepositoryFactory();
        this.dreamRepositories = new ArrayList<>();
    }

    // registra paciente y su su historia clinica para sus sueños
    // recibe el nombre del repositorio(normalmente historial), el numero de
    // documento y el nombre del paciente
    public void registerPatient(String nameRepo, String numDoc, String namePac) {
        DreamRepository dreamRepository = dreamRepositoryFactory.create(nameRepo, numDoc, namePac);
        dreamRepositories.add(dreamRepository);
    }

    // numDOC es el numero de documento del paciente y dream es el sueño que se va a
    // registrar
    public void registerDream(String numDoc, Dreams dream) {
        DreamRepository dreamRepository = getDreamRepository(numDoc);
        if (dreamRepository != null) {

            dreamRepository.registrarInformation(dream);
        }
    }

    // se busca por el id del pacient
    private DreamRepository getDreamRepository(String numDoc) {
        for (DreamRepository dreamRepository : this.dreamRepositories) {
            if (dreamRepository.getPaciente().getNumDoc().equals(numDoc)) {
                return dreamRepository;
            }
        }
        return null;
    }

    // aqui se escribe el reporte estandar, el cual se guarda en el dream repository
    // del paciente
    // recibe el numero de documento del paciente, el tipo de enfoque y el id del
    // sueño
    public StandartReport writeStandartReport(String numDoc, String typeApproach, int idDream) {
        TherapyApprouchFactory enfoqueTerapeutico = getTherapyApprouch(numDoc, typeApproach, idDream);
        StandartReportBuilder reportBuilder = new StandartReportBuilder();
        reportBuilder.reset();
        // aqui se trae los analisi que se hicieron en el enfoque junguiano
        reportBuilder.writeIdream(idDream);
        reportBuilder.writeSymbolicAnalyzer(
                ((SymbolicAnalyzer) enfoqueTerapeutico.getAnalyzerJungiano().get(0)).getAnalysys());
        reportBuilder.writeEmocionalAnalyzer(
                ((EmotionalAnalyzer) enfoqueTerapeutico.getAnalyzerJungiano().get(1)).getAnalysys());
            getDreamRepository(numDoc).registrarStandartReport(reportBuilder.Build());
        return reportBuilder.Build();
    }

    public PersonalizedReport writePersonalizedReport(String numDoc, String typeApproach, int idDream) {
        TherapyApprouchFactory enfoqueTerapeutico = getTherapyApprouch(numDoc, typeApproach, idDream);
        PersonalizedReportBuilder reportBuilder = new PersonalizedReportBuilder();
        reportBuilder.reset();
        // aqui se trae los analisi que se hicieron en el enfoque junguiano
        // el cual se trae el analisis cognitivo y ese seria el reporte personalizado
        reportBuilder.writeIdream(idDream);
        reportBuilder.typeReport(((CognitiveAnalyzer) enfoqueTerapeutico.getAnalyzerConductual().get(0)).getAnalysys());
        getDreamRepository(numDoc).registrarPersonalizedReport(reportBuilder.Build());;
        return reportBuilder.Build();
    }

    // este metodo me retorna el analisis correspondiente al enfoque terapeutico que
    // se le pase como parametro
    // recibe el numero de documento del paciente, el tipo de enfoque y el id del
    // sueño
    // tipo de enfoque puede ser jungiano o conductual y el cual tendra diferentes
    // analisi
    private TherapyApprouchFactory getTherapyApprouch(String numDoc, String typeApproach, int idDream) {
        Dreams dream = getDream(numDoc, idDream);
        if (dream != null) {
            TherapyApprouchFactory therapyApprouchFactory = new TherapyApprouchFactory();
            return therapyApprouchFactory.getApprouach(typeApproach, dream);
        }

        return null;
    }

    // metodo de leonardo pa sacar un sueño de un paciente
    // recibe el numero de documento del paciente y el id del sueño
    public Dreams getDream(String numDocP, int idDream) {
        DreamRepository dreamRepository = getDreamRepository(numDocP);
        if (dreamRepository != null) {
            for (Dreams dream : dreamRepository.getListDreams()) {
                if (dream.getIdDream() == idDream) {
                    return dream;
                }
            }
        }

        return null;
    }

    // metodos para mostrar informacion paciente
    // mostrar la informacion general de un pacient
    public String showInformationGeneral(String numDoc) {
        DreamRepository dreamRepository = getDreamRepository(numDoc);
        if (dreamRepository != null) {
            return dreamRepository.traerInformacion();
        }
        return "";
    }

    // mostrar la informacion de los sueños de un paciente
    public String showInformationDreams(String numDoc) {
        DreamRepository dreamRepository = getDreamRepository(numDoc);
        if (dreamRepository != null) {
            return dreamRepository.mostrarInformationDreams();
        }
        return "";
    }

    // mostrar la informacion de los reportes personalizados de un paciente
    public String showInformationPersonalizedReport(String numDoc) {
        DreamRepository dreamRepository = getDreamRepository(numDoc);
        if (dreamRepository != null) {
            return dreamRepository.mostrarPersonalizedReport();
        }
        return "";
    }

    // mostrar la informacion de los reportes estandar de un paciente
    public String showInformationStandartReport(String numDoc) {
        DreamRepository dreamRepository = getDreamRepository(numDoc);
        if (dreamRepository != null) {
            return dreamRepository.mostrarStandartReport();
        }
        return "";
    }

}
