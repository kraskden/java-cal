package cal;

import cal.calendar.*;

import org.apache.commons.cli.*;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Program program = new Program(args);
        try {
            program.parse();
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
}

class Program {
    private Options options = new Options();
    private String[] args;

    private CommandLine cmd;

    private int currMonth, currYear;

    Program(String[] args) {
        initOptions();
        this.args = args;
        LocalDate date = LocalDate.now();
        currMonth = date.getMonthValue();
        currYear = date.getYear();
    }

    void parse() throws ParseException {
        CommandLineParser parser = new DefaultParser();
        cmd = parser.parse(options, args);
        if (cmd.hasOption("h")) {
            showHelp();
        } else if (cmd.hasOption("3")) {
            System.out.println(new ThreeMonthCalendar());
        } else if (cmd.hasOption("1")) {
            System.out.println(new CurrMonthCalendar());
        } else if (cmd.hasOption("Y")) {
            System.out.println(new YearCalendar(currYear));
        } else if (cmd.hasOption("n")) {
            showIntervalCalendar();
        } else if (cmd.hasOption("y")) {
            showYearCalendar();
        }
    }

    private void initOptions() {
        options.addOption("3", false, "Display three month");
        options.addOption("1", false, "Display current month (default)");
        options.addOption("Y", false, "Display current year");

        Option monthInterval = new Option("n", true, "Display n month from today");
        monthInterval.setArgs(1);
        monthInterval.setArgName("amount");
        options.addOption(monthInterval);

        Option year = new Option("y", "year", true, "Display cal for same year");
        year.setArgs(1);
        year.setArgName("year");
        options.addOption(year);

        options.addOption("h", "help", false, "Get help");

    }

    private void showHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("cal", options);
    }

    private void showIntervalCalendar() {
        try {
            System.out.println(new IntervalCalendar(currMonth, currYear,
                    Integer.parseInt(cmd.getOptionValue("n"))));
        } catch (NumberFormatException e) {
            System.err.println("Invalid interval length");
        }
    }

    private void showYearCalendar() {
        String value = cmd.getOptionValue("y");
        try {
            System.out.println(new YearCalendar(Integer.parseInt(value)));
        } catch (NumberFormatException e) {
            System.err.println("Invalid year");
        }
    }

}
