package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {
    public static void main(String[] args) {
    Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    Matcher matcher = pattern.matcher("Nghia2ker2@gmail.com");
    System.out.println("Input String matches regex - "+matcher.matches());
    }
}
