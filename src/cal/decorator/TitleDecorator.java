package cal.decorator;

import cal.model.IModel;
import cal.utils.TextFormatter;

import java.util.ArrayList;

public abstract class TitleDecorator implements IModel {

    private IModel model;

    public TitleDecorator(IModel model) {
        this.model = model;
    }

    protected abstract String getTitle();

    @Override
    public ArrayList<String> getRawData() {
        ArrayList<String> data = model.getRawData();
        String title = getTitle();
        data.add(0, TextFormatter.centerText(title, model.getWidth()));
        return data;
    }

    @Override
    public int getWidth() {
        return model.getWidth();
    }

    public IModel getModel() {
        return model;
    }

    public void setModel(IModel model) {
        this.model = model;
    }
}
