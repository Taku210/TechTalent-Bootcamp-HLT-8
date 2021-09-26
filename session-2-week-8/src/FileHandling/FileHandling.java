package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Desktop/TechTalent Coding Bootcamp/Lorem Impsum");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());

        }
    }
}
