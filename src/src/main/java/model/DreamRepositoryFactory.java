package model;

public class DreamRepositoryFactory implements IDreamRepository {




    @Override
    public DreamRepository create(String nameRepo, String numDoc,String namePac) {
        return new  DreamRepository(createPaciente(numDoc, namePac));
    }

    public Paciente createPaciente(String numDoc, String namePac){
        return new Paciente(numDoc,namePac);
    }
}
