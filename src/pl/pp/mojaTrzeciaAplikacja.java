package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę dni (liczba ujemna kończy program): ");

            int dni = scanner.nextInt();

            if (dni < 0) {
                System.out.println("Program zakończony.");
                break;
            }

            int liczbaTygodni = dni / 7;
            int Reszta = dni % 7;

            System.out.println(dni + " dni to " + liczbaTygodni + " tygodnie i " + Reszta + " dni.");
        }

        while (true) {
            System.out.print("Podaj temperaturę w stopniach Fahrenheit'a (liczba ujemna kończy program): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit < 0) {
                System.out.println("Program zakończony.");
                break;
            }

            double celsjusz = (fahrenheit - 32.0) / 1.8;
            double kelwin = celsjusz + 273.16;

            System.out.printf("Temperatura w F: %.2f °F\n", fahrenheit);
            System.out.printf("Temperatura w C: %.2f °C\n", celsjusz);
            System.out.printf("Temperatura w K: %.2f K\n", kelwin);

            scanner.close();
        }
    }
}