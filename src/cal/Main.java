package cal;

import cal.calendar.*;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        YearCalendar cal = new YearCalendar(2019);
        System.out.println(cal);
    }
}
