package cal.model.container;

import cal.model.IModel;

import java.util.ArrayList;

public class TableContainer extends Container {

    private int colCount;

    public TableContainer(int colCount) {
        this.colCount = colCount;
    }

    @Override
    public ArrayList<String> getRawData() {
        VerticalContainer table = new VerticalContainer();
        int colIdx = 0;
        HorizontalContainer row = new HorizontalContainer();
        for (IModel model : models) {
            row.add(model);
            if (++colIdx == colCount) {
                colIdx = 0;
                table.add(row);
                row = new HorizontalContainer();
            }
        }
        return table.getRawData();
    }

    @Override
    public int getWidth() {
        int size = Math.min(colCount, models.size());
        if (size == 0)
            return 0;
        int width = (size - 1) * HorizontalContainer.DELIM.length();
        for (int i = 0; i < size; ++i)
            width += models.get(i).getWidth();
        return width;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }
}
