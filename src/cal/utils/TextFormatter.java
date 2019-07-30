package cal.utils;

public class TextFormatter {
    public static String centerText(String txt, int width) {
        int pre_spaces = (width - txt.length()) / 2;
        StringBuilder builder = new StringBuilder();
        if (pre_spaces > 0) {
            builder.append(new String(new char[pre_spaces]).replace('\0', ' '));
        }
        builder.append(txt);
        builder.append(" ".repeat(width - builder.length()));
        return builder.toString();
    }
}
