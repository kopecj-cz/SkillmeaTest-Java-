import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Příkaz pro vypsání do konzole
        /*
        System.out.println("Fly Eagles Fly");
        */

        /*
        // Základy
        String pozdrav = "Ahoj světe";
        String jmeno = "přeje Jakub";

        System.out.println(pozdrav + " " + jmeno);
        System.out.println(pozdrav);
        */

        // Kalkulačka
        /*
        int prvniCislo = 10;
        int druheCislo = 5;

        System.out.print("Součet: ");
        System.out.println(prvniCislo + druheCislo);
        System.out.print("Rozdíl: ");
        System.out.println(prvniCislo - druheCislo);
        System.out.print("Součin: ");
        System.out.println(prvniCislo * druheCislo);
        System.out.print("Podíl: ");
        System.out.println(prvniCislo / druheCislo);
        */

        /*
        float prvniDesCislo = 0.1f;
        float druheDesCislo = 0.2f;

        System.out.print("Součet: ");
        System.out.println(prvniDesCislo + druheDesCislo);
        System.out.print("Rozdíl: ");
        System.out.println(prvniDesCislo - druheDesCislo);
        System.out.print("Součin: ");
        System.out.println(prvniDesCislo * druheDesCislo);
        System.out.print("Podíl: ");
        System.out.println(prvniDesCislo / druheDesCislo);

        final float LUDOLFOVO_CISLO = 3.141592653f;  // příklad konstanty = proměnná, která nejde poté již přepsat
        */

        // Čtení dat zadaných uživatelem
        /*
        System.out.println("Ahoj, zadej jméno:");
        Scanner mujScanner = new Scanner(System.in);
        String jmeno = mujScanner.nextLine();
        System.out.println("Přeji pěkný den " + jmeno);
        */

        // Interaktivní kalkulačka
        /*
        Scanner mujScanner = new Scanner(System.in);
        System.out.print("Zadej první celé číslo: ");
        int prvniCislo = mujScanner.nextInt();
        System.out.print("Zadej druhé celé číslo: ");
        int druheCislo = mujScanner.nextInt();

        System.out.print("Součet: ");
        System.out.println(prvniCislo + druheCislo);
        System.out.print("Rozdíl: ");
        System.out.println(prvniCislo - druheCislo);
        System.out.print("Součin: ");
        System.out.println(prvniCislo * druheCislo);
        System.out.print("Podíl: ");
        System.out.println(prvniCislo / druheCislo);
        System.out.print("Modulo: ");
        System.out.println(prvniCislo % druheCislo); // % = tzv. "modulo" = zbytek po celočíselném dělení
        */

        // String metody
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej libovolný text:");
        String mujText = mujScanner.nextLine();

        System.out.print("Text je prázdný: ");
        System.out.println(mujText.isEmpty());

        System.out.print("Délka zadaného textu: ");
        System.out.println(mujText.length());

        System.out.println("Převod na velká písmena:");
        System.out.println(mujText.toUpperCase());

        System.out.print("Obsahuje písmeno e: ");
        System.out.println(mujText.contains("e"));

        System.out.print("První pozice písmene e: ");
        int index = mujText.indexOf("e");
        System.out.println(index+1); // index se začíná počítat od 0


    }
}