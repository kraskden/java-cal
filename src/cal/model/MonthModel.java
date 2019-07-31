package cal.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class MonthModel implements IMonthModel {

    private int month;
    private int year;

    private final static String HEAD = "MON THU WED THU FRI SAT SUN";

    public MonthModel(int month, int year) {
        setMonth(month);
        setYear(year);
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public ArrayList<String> getRawData() {
        LocalDate date = LocalDate.of(year, month, 1);
        int idxFirstDay = date.getDayOfWeek().getValue();
        ArrayList<String> cal = new ArrayList<>();
        cal.add(HEAD);
        StringBuilder builder = new StringBuilder();
        builder.append("    ".repeat(Math.max(0, idxFirstDay - 1)));
        while (date.getMonthValue() == month) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            builder.append(String.format(dayOfWeek == DayOfWeek.SUNDAY ?
                    "%3d" : "%3d ", date.getDayOfMonth()));
            if (dayOfWeek == DayOfWeek.SUNDAY) {
                cal.add(builder.toString());
                builder.setLength(0);
            }
            date = date.plusDays(1);
        }
        if (builder.length() > 0) {
            int spaces = HEAD.length() - builder.length();
            if (spaces > 0)
                builder.append(new String(new char[spaces]).replace('\0', ' '));
            cal.add(builder.toString());
        }
        return cal;
    }

    @Override
    public int getWidth() {
        return  HEAD.length();
    }

}
