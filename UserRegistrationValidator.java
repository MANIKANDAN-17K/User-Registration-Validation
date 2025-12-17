import java.util.regex.*;

public class UserRegistrationValidator{
    public static void main(String[] args){
        String logs = "INFO  User logged in: manik@gmail.com ERROR Invalid password for user: raj123@yahoo.com INFO  Contact number updated: 9876543210 WARN  Low memory ERROR Connection failed for admin@company.com INFO Backup completed, contact: 9123456789 ";

                extractEmail(logs);
                extractMobileNumber(logs);
                extractErrors(logs);
    }
    static void extractEmail(String text){
        System.out.println("\n Emails Found");
        Pattern pattern = Pattern.compile(
            "[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}"
        );
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    static void extractMobileNumber(String text){
        System.out.println("\n Mobile Number Found:");
        Pattern pattern = Pattern.compile("[6-9]\\d{9}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    static void extractErrors(String text){
        System.out.println("\n Error logs");
        Pattern pattern = Pattern.compile("ERROR.*");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
