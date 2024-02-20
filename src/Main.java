import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b, c;

        System.out.println("A'yı giriniz : ");
        a = inp.nextInt();

        System.out.println("B'yi giriniz : ");
        b = inp.nextInt();

        System.out.println("C'yi giriniz : ");
        c = inp.nextInt();

        System.out.println("Toplam Sonuç: " + (a+b*c-b));
    }
}