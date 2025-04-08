package presentador;

public class Presenter {
    private IoManager io;

    public Presenter() {
        io = new IoManager();

    }

    public void menu(){
        int opt =0;
		do {
			try{
				opt=io.readMenu();
            switch (opt) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:new DreamClone().cloneDream(io.readGraphicString("Ingrese el id del paciente"),io.readGraphicInt("Ingrese el numero de sueño a clonar"));
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                io.showGraphicErrorMessage("Opcion incorrecta");
            }
            } catch (NumberFormatException e) {
                io.showGraphicErrorMessage("Debe ingresar un numero entero");
            }
        }while(opt!=7);
            
     }
}