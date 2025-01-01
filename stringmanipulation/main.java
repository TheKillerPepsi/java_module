package stringmanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvPath = "C:\\Users\\pischl001\\Desktop\\Git\\learning_Java\\Beispiel_Flugdaten.csv";
        String line = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(csvPath));
            
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                String flugnummer = row[0];
                String abflugort = row[1];
                String zielort = row[2];
                String flugdatum = row[3];

                //System.out.println("Flugnummer: " + flugnummer + " Abflugort: " + abflugort + " Zielort " + zielort + " Flugdatum: " + flugdatum);

                StringBuffer fullFlightData = new StringBuffer();
                fullFlightData.append(flugnummer);
                fullFlightData.append(abflugort);
                fullFlightData.append(zielort);
                fullFlightData.append(flugdatum);
                String fullFlightDataString = fullFlightData.toString();

                System.err.println(fullFlightDataString);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
