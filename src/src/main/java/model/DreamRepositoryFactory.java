package model;

public class DreamRepositoryFactory implements IDreamRepository {

    @Override
    public void create(String nameRepo, String numDoc,String namePac) {
        new DreamRepository(createPaciente(numDoc, namePac));
    }

    public Paciente createPaciente(String numDoc, String namePac){
        return new Paciente(numDoc,namePac);
    }
}
