import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Phone Validator
 */
public class PhoneValidator {

    public static void main(String[] args) {
        Pattern phoneNumberPatter =
                Pattern.compile("^\\(?\\d{2,4}\\)?(:?\\s|\\.|-|)\\d{1,4}\\s?(?:\\d{7}|((?:\\.|-)\\d{3}(?:\\.|-)\\d{4}))");
        while (true) {
            String phoneNumber = System.console().readLine("Enter the phone number you want to validate: ");
            Matcher matcher = phoneNumberPatter.matcher(phoneNumber);
            System.out.println("Your phone number \"" + phoneNumber + "\" is "
                    + (matcher.matches() ? "valid." : "not valid."));
        }
    }
}