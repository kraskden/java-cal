package cal.model.container;

import cal.model.IModel;

import java.util.ArrayList;

public abstract class Container implements IModel {

    protected ArrayList<IModel> models = new ArrayList<>();

    protected void add(IModel model) {
        models.add(model);
    }

    protected void clear() {
        models.clear();
    }

    public ArrayList<IModel> getModels() {
        return models;
    }
}
