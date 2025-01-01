package stringmatching;

import java.io.File;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringmatching {

    public static void main(String[] args) {

        findString();
        
    }

    public static void findString(){

        /*Scanner s = new Scanner(System.in);

        System.err.println("Geben Sie bitte die gesamten Strings an an: ");
        String fullString = s.nextLine();

        System.err.println("Geben Sie bitte den Teilstring an: ");
        String partString= s.nextLine(); */

        Pattern pattern = Pattern.compile("Beispiel"); //erstellt das Muster für testTeilString

        Matcher matcher = pattern.matcher("Das BEISPIEL es ist");

        if (matcher.find()) {
            System.out.println("Gefunden! " + matcher.group());
        } else {
            System.out.println("Nciht gefunden :( ");
        }

    }
    
}
