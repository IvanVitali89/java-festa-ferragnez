import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestFerragnez = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        int i;
        int j=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gentilmente può dirmi il suo nome?");
        String nome = scanner.nextLine();

        boolean find = false;

        for (i = 0; i < guestFerragnez.length; i++) {
            if (guestFerragnez[j].equals(nome)) {
                find = true;
                break;
            } else {
                j++;
            }

        }
        if (find = true) {
            System.out.println("puoi entrare");
        } else {
            System.out.println("Puoi tornare da dove sei venuto");
        }
        scanner.close();

    }

}
