package presentador;

import java.util.ArrayList;

import model.Dreams;
import model.ICloneDream;

public class Presenter {
    private IoManager io;
    private App app;

    public Presenter() {
        io = new IoManager();
        app = new App();
    }

    public void menu(){
        int opt =0;
		do {
			try{
				opt=io.readMenu();
            switch (opt) {
                case 1:app.registerPatient("historial", io.readGraphicString("Ingrese el documento del paciente"), io.readGraphicString("Ingrese el nombre del paciente"));
                        io.showGraphicMessage("Paciente registrado exitosamente");
                    break;
                case 2:app.registerDream(io.readGraphicString("Ingrese el documento del paciente"), this.dreamDetails());
                io.showGraphicMessage("Sueño registrado exitosamente");
                    break;
                case 3:this.approbachSelection();
                io.showGraphicMessage("Enfoque registrado exitosamente");
                    break;
                case 4:this.showInformation();
                    break;
                case 5:this.clonedDreams();
                    break;
                case 6:io.showGraphicMessage("Finalizacion");
                    break;
                default:
                io.showGraphicErrorMessage("Opcion incorrecta");
            }
            } catch (NumberFormatException e) {
                io.showGraphicErrorMessage("Debe ingresar un numero entero");
            }
        }while(opt!=6);
            
     }
     public Dreams dreamDetails(){
        int dreamId = io.readGraphicInt("Ingrese el id del sueño");
        double duration = io.readGraphicDouble("Ingrese la duración del sueño");
        String intensidadEmocional = identifyIntensity();
        String intensidadVisual = identifyIntensity();
        String patrones = io.readGraphicString("Ingrese el patron del sueño");
        String narrative = io.readGraphicString("Ingrese la descripcion de la narrativa del sueño");
        return new Dreams(dreamId, duration, intensidadEmocional, intensidadVisual, patrones, narrative);
        
     }
     public String identifyIntensity(){
        String output="";
        int opc = io.readGraphicInt("Seleccione la intensidad del sueño\n"+"1. Alta, 2. Media, 3. Baja");
        if(opc==1){
            output="Alta";
        }else if(opc==2){
            output="Media";
        }else if(opc==3){
            output="Baja";
        }
        return output;
     }
     public void approbachSelection(){
        int opc = io.readGraphicInt("Seleccione el enfoque terapeutico\n"+"1. Conductual, 2. Jungiano");
        if(opc==1){
            app.writePersonalizedReport(io.readGraphicString("Ingrese el id del paciente"), "Conductual", io.readGraphicInt("Ingrese el id del sueño"));
        }else if(opc==2){
            app.writeStandartReport(io.readGraphicString("Ingrese el id del paciente"), "jungiano", io.readGraphicInt("Ingrese el id del sueño"));
        }
     }
     public void showInformation(){
        String idPaciente = io.readGraphicString("ingrese el id del paciente a consultar");
        io.showGraphicMessage("Informacion general: \n"+app.showInformationGeneral(idPaciente)+"\n"
        +"Sueños registrados del paciente: \n"+app.showInformationDreams(idPaciente)+"\n"
        +"Analisis estandar por el terapeuta (Jungiano): \n"+app.showInformationStandartReport(idPaciente)+"\n"
        +"Analisis personalizado por el terapeuta (Conductual): \n"+app.showInformationPersonalizedReport(idPaciente)+"\n"
        +"Sueños clonados del paciente: \n"+clonedDreams()+"\n");
     }
     public Dreams dreamClone() {
        DreamClone dreamClone = new DreamClone(app); 
        Dreams clonedDream = (Dreams) dreamClone.cloneDream(
            io.readGraphicString("Ingrese el id del paciente"),
            io.readGraphicInt("Ingrese el numero de sueño a clonar")
        ).clone();
        io.showGraphicMessage("Sueño clonado");
        return clonedDream; 
    }
    public String clonedDreams(){
        ArrayList<Dreams> clonedList = new ArrayList<>();
        clonedList.add(dreamClone());
        String output="";
        for (Dreams dreams : clonedList) {
            output+=dreams+"\n";
        }
        return output;
    }
    
}