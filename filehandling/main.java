package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.err.println("Möchten Sie eine Datei anlegen (1) oder die Größe eines Pfades Wissen (2)? 1/2");
        String userAnswer = s.nextLine();

        if (userAnswer.equals("1")) {
            System.err.println("Work in Progress");
        }

        else if (userAnswer.equals("2")) {

            System.err.println("Geben Sie bitte einen Dateipfad an: ");
            String userPath = s.nextLine();
            File userPathFile = new File(userPath);

            listDirectorysInFolderWithSize(userPathFile);


            long result = getAllFileSize(userPathFile);
            System.err.println("Dieser Ordner hat eine Groesse von: " + result);
        }

        else {
        System.err.println("Bitte wählen Sie eine der beiden Angaben aus");
        }
        
    }

    public static long getAllFileSize(File userPathFile) {
        long summSize = 0; // ein long wird genutzt, weil file.length auch einen long hergibt
        File[] files = userPathFile.listFiles();

        if (files != null){
            for (File file : files) {
                if (file.isFile()) {
                    summSize += file.length();
                } else if (file.isDirectory()) {
                    // Rekursion für Unterverzeichnisse
                    summSize += getAllFileSize(file);
                }
            }
            
        }

        return summSize;
    }

    public static void listDirectorysInFolderWithSize (File userPathFile){

        long FileSizeAll = 0;

        File[] files = userPathFile.listFiles();

        for (File file : files) {
            System.err.println("Name der Datei/des Ordners: " + file.getName() + " Groesse der Datei: " + file.length());
            FileSizeAll += file.length();
        }

        System.err.println("Gesamtgroesse der Dateien in diesem Verzeichnis: " + FileSizeAll);

    }

}
    