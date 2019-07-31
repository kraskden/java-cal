package cal.model.container;

import cal.model.IModel;

import java.util.ArrayList;

public class HorizontalContainer extends Container {

    protected static final String DELIM = "   ";

    @Override
    public ArrayList<String> getRawData() {
        ArrayList<ArrayList<String>> raw = new ArrayList<ArrayList<String>>();
        int maxHeight = 0;
        for (IModel model : models) {
            ArrayList<String> data = model.getRawData();
            raw.add(data);
            maxHeight = Math.max(maxHeight, data.size());
        }
        for (ArrayList<String> arr : raw) {
            for (int i = arr.size(); i < maxHeight; ++i) {
                arr.add(" ".repeat(arr.get(0).length()));
            }
        }
        ArrayList<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < maxHeight; ++row) {
            builder.setLength(0);
            for (int cal = 0; cal < raw.size(); ++cal) {
                builder.append(raw.get(cal).get(row));
                if (cal != raw.size() - 1) {
                    builder.append(DELIM);
                }
            }
            result.add(builder.toString());
        }
        return result;
    }

    @Override
    public int getWidth() {
        if (models.size() == 0)
            return 0;
        int width = (models.size() - 1) * DELIM.length();
        for (IModel model : models) {
            width += model.getWidth();
        }
        return width;
    }
}
