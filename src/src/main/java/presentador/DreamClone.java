package presentador;

import model.Dreams;
import model.ICloneDream;

public class DreamClone implements ICloneDream {
    public DreamClone(Dreams dream){  
    }
    public DreamClone() {
        
    }
    @Override
    public ICloneDream cloneDream(String uId, int dreamId) {
        return new DreamClone(new App().getDream(uId, dreamId));
    }

}
