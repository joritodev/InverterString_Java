import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String invertida = "";

        for(int i = original.length()-1;i>=0;i--) {
            invertida += original.charAt(i);
        }

        System.out.println(original);
        System.out.println(invertida);
    }
}