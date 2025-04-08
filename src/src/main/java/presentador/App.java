package presentador;

import java.util.ArrayList;

import model.DreamRepository;
import model.DreamRepositoryFactory;
import model.Dreams;


public class App {
  private DreamRepositoryFactory dreamRepositoryFactory;
  private ArrayList<DreamRepository> dreamRepositories;



  
public App() {
    this.dreamRepositoryFactory =  new DreamRepositoryFactory();
    this.dreamRepositories = new ArrayList<>();
}




    //registra paciente y su su historia clinica para  sus sueños
    //recibe el nombre del repositorio(normalmente historial), el numero de documento y el nombre del paciente
    public void registerPatient(String nameRepo,String numDoc, String namePac) {
        
        DreamRepository dreamRepository =dreamRepositoryFactory.create(nameRepo, numDoc, namePac);
        dreamRepositories.add(dreamRepository);
    }

    public void registerDream(String numDoc, String dream) {
      
    }

    private DreamRepository getDreamRepository(String numDoc) {
        for (DreamRepository dreamRepository : this.dreamRepositories) {
            if (dreamRepository.getPaciente().getNumDoc().equals(numDoc)) {
                return dreamRepository;
            }
        }
        return null;
    }

//metodo de leonardo pa sacar un sueño de un paciente
    //recibe el numero de documento del paciente y el id del sueño
    private Dreams getDream(String numDocP, int idDream){
        DreamRepository dreamRepository = getDreamRepository(numDocP);

        for (Dreams dream : dreamRepository.getListDreams()) {
            if (dream.getIdDream() == idDream) {
                return dream;
            }
        }
        return null;
}
}
