package cal.model.container;

import cal.model.IModel;

import java.util.ArrayList;

public class VerticalContainer extends Container  {

    private int width = 0;

    @Override
    protected void add(IModel model) {
        models.add(model);
        width = Math.max(width, model.getWidth());
    }

    @Override
    public ArrayList<String> getRawData() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < models.size(); ++i) {
            result.addAll(models.get(i).getRawData());
            if (i != models.size() - 1) {
                result.add("");
            }
        }
        return result;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
