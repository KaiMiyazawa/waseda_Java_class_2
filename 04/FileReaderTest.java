import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("FileReaderTest.java");
        }
        catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しません");
            System.exit(0); //プログラムを終了させる命令
        }
        Scanner sin = new Scanner(fr);
        while (sin.hasNext()) {
            String line = sin.nextLine();
            System.out.println(line);
        }
        sin.close();
    }
}