import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        1.
        readingListWithFileReader();
//        2.
//        readFileUsingBufferReader();
//        3.
//        readFileWithScanner();
//        4.
//        readFileAsString();
//        5.
//        readFilesWithListOfLines();
//        6.
//        readFileUsingDelimiter();
    }

    private static void readFileUsingDelimiter() throws FileNotFoundException {
        File file =
                new File("./src/List.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\Z");

        System.out.println(scanner.next());
    }

    private static void readFilesWithListOfLines() throws IOException {
        List<String> lines = Collections.emptyList();

        lines = Files.readAllLines(
                Paths.get("./src/List.txt"),
                StandardCharsets.UTF_8);

        for (String line : lines) System.out.println(line);
    }

    private static void readFileAsString() throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("./src/List.txt")));
        System.out.println(data);
    }

    private static void readFileWithScanner() throws FileNotFoundException {
        File file =
                new File("./src/List.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
    }

    private static void readFileUsingBufferReader() throws IOException {
        File file = new File("./src/List.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String st;
        while ((st = bufferedReader.readLine()) != null)
            System.out.println(st);
    }

    private static void readingListWithFileReader() throws IOException {
        FileReader fileReader = new FileReader("./src/List.txt");
        int charNumber;
        while ((charNumber = fileReader.read()) != -1) {
            System.out.print(((char) charNumber));
        }
        fileReader.close();
    }


}
