package pl.pp;

import java.util.Scanner;

public class wiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        int podanyWiek = scanner.nextInt();
        System.out.println(podanyWiek*31536000 + " sekund");
    }
}
