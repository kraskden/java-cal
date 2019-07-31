package cal.decorator;

import cal.model.IModel;
import cal.model.IYearModel;

public class YTitleDecorator extends TitleDecorator {

    private IYearModel model;

    public YTitleDecorator(IYearModel model) {
        super(model);
        this.model = model;
    }

    @Override
    protected String getTitle() {
        return String.valueOf(model.getYear());
    }
}
