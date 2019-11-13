import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Phone Extractor.
 */
public class PhoneExtractor {

    public static void main(String[] args) throws IOException {
        Pattern phoneNumberPatter =
                Pattern.compile("\\(?(\\d{2,4})\\)?(:?\\s|\\.|-|)(\\d{1,4})\\s?((?:\\d{7}|((?:\\.|-)\\d{3}(?:\\.|-)\\d{4})))");

        HashSet<String> operatorCodes = new HashSet<>();
        HashSet<String> cityCodes = new HashSet<>();
        HashSet<String> phoneNumbers = new HashSet<>();

        // I worked with jdk1.8.0_25 so, I was not able to use Files.readString() method
        String text = new String(Files.readAllBytes(Paths.get("phoneNumbers.txt")));
        Matcher matcher = phoneNumberPatter.matcher(text);
        while(matcher.find()) {
            operatorCodes.add(matcher.group(1));
            cityCodes.add(matcher.group(3));
            phoneNumbers.add(matcher.group(4).replaceAll("\\.","").replaceAll("-",""));
        }

        System.out.println("Operator Codes: " + operatorCodes);
        System.out.println("City Codes: " + cityCodes);
        System.out.println("PhoneNumbers: " + phoneNumbers);
    }
}
