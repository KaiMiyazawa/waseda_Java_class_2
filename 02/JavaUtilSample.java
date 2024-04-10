    /*
    java.util.Random
    java.util.Scanner
    の使い方のサンプル
    */
import java.util.Random;
import java.util.Scanner;
class JavaUtilSample {
    public static void main(String[] args) {
        // java.util.Random r = 
        //     new java.util.Random();
        Random  r = new Random();
        Scanner s = new Scanner(System.in);
        // System.out.println(r.nextInt());
        // System.out.println(s.nextLine());
        System.out.println(s.nextInt()*1000);
        // System.out.println(r.nextDouble());
    }
}