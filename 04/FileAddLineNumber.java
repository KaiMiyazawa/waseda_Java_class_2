import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAddLineNumber {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.exit(0);
    }
    FileReader fr = null;
    PrintWriter out = null;
    try {
      fr = new FileReader(args[0]);
      FileWriter fw = new FileWriter(args[0] + ".list");
      // FileWriter fw = new FileWriter("test.txt");
      out = new PrintWriter(fw);
    } catch (IOException e) {
      System.out.println("ファイルの入出力にエラーがあります。");
    }

    int lineNumber = 1;
    Scanner sin = new Scanner(fr);

    while (sin.hasNext()) {
      String line = sin.nextLine();
      out.println(lineNumber + ":" + line);
      lineNumber++;
    }
    out.close();
  }
}
