import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ExampleFile2 {
    public static void main(String[] args) throws IOException {
        String filename;
        Scanner in = new Scanner(System.in);
        System.out.print("Filename: ");
        filename = in.next();
        in.close();
        File arquivo = new File(filename.concat(".txt"));
        if (arquivo.createNewFile()) {
            System.out.println("A wild file appears: " +
                    arquivo.getName());
        } else {
            System.out.println("The file exists.");
        }
    }
}

