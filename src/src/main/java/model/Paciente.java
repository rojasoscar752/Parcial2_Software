package model;

public class Paciente {
    private String numDoc;
    private String namePac;

    public Paciente(String numDoc,String namePac) {
        this.namePac = namePac;
        this.numDoc =  numDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNamePac() {
        return namePac;
    }

    public void setNamePac(String namePac) {
        this.namePac = namePac;
    }
}
