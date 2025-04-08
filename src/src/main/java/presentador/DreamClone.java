package presentador;

import model.Dreams;
import model.ICloneDream;

public class DreamClone {
    private App app;

    public DreamClone(App app) {
        this.app = app;
    }

    public ICloneDream cloneDream(String uId, int dreamId) {
        Dreams originalDream = app.getDream(uId, dreamId); 
        return originalDream.clone();
    }
}
