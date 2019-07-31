package cal.decorator;

import cal.model.IMonthModel;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MTitleDecorator extends TitleDecorator {

    private IMonthModel monthModel;

    public MTitleDecorator(IMonthModel model) {
        super(model);
        this.monthModel = model;
    }

    @Override
    protected String getTitle() {
        return Month.of(monthModel.getMonth()).getDisplayName(TextStyle.FULL, Locale.US).toUpperCase();
    }
}
