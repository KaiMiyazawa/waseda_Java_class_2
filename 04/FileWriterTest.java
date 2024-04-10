import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class FileWriterTest {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            // FileWriter fw = new FileWriter("test.txt");
            FileWriter fw = new FileWriter(args[0] + ".list");
            out = new PrintWriter(fw);
        } catch (IOException e) {

        }
        out.println("Hello. ver.2");
        out.close();
    }
}