import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * IPValidator Validates in an IPV4 address is valid or not
 */
public class IPValidator {
    
    public static void main(String[] args) {
        Pattern ipAddressValidator =
                Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$");
        while (true) {
            String ipAddress = System.console().readLine("Enter the Ip Address you want to validate: ");
            Matcher matcher = ipAddressValidator.matcher(ipAddress);
            System.out.println("Your IP Address \"" + ipAddress + "\" is "
                    + (matcher.matches() ? "valid." : "not valid."));
        }
    }
    
}