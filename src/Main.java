// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int rubles;
        int sum = 100;
        int replenishment = 100;
        int x = 300;

        if (x > 1000) {
            rubles = sum + x + x / 100;
        } else {
            rubles = sum + x; }

        System.out.println("Зачисленно на счет: " +rubles);
    }
}