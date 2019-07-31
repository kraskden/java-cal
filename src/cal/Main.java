package cal;

import cal.calendars.*;
import cal.models.IModel;

public class Main {
    public static void main(String[] args) {
        IModel cal = new ThreeMonthCalendar();
        System.out.println(cal);
    }
}
