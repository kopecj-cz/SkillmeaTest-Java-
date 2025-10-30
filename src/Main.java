import java.util.Random;
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
        /*
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
        */

        // Parsování = převádění mezi typy
        /*
        String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(5 + prevedeneCislo);
        */

        // Operátory
        /*
        int x = 10;
        int y = 20;
        int z = 8;

        System.out.println(x == y);  // rovná se
        System.out.println(x != y);  // nerovná se
        System.out.println(x > y);  // větší než
        System.out.println(++x);  // přičte 1 k x a vypíše jej
        // x++ prvně vypíše x a poté k němu přičte 1
        System.out.println(--y);  // odečte 1 od y a vypíše jej
        // y-- prvně vypíše y a poté od něj odečte 1

        System.out.println(x > y && z > x);  // logický AND
        System.out.println(x > y || z > x);  // logický OR
        System.out.println(!(x == 0));  // logický NOT = vrací opačný výsledek (při false vrací true)
        */

        // Podmínky - podmínka if...else
        /*
        // Tento proces rozhoduje o tom, zda je uživatel dospělý/senior/dospívající/dítě
        Scanner mujScanner = new Scanner(System.in);

        System.out.print("Zadej věk: ");
        int vek = mujScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Uživatel je dospělý");
            if(vek >= 65) {
                System.out.println("Uživatel je senior");
            }
        }
        else if(vek >= 0) {
            System.out.println("Uživatel je nezletilý");
            if(vek > 15) {
                System.out.println("Uživatel je dospívající");
            }
            else {
                System.out.println("Uživatel je dítě");
            }
        }
        else {
            System.out.println("Věk nemůže být záporný!");
        }
        */

        // Výpočet BMI
        /*
        Scanner mujScanner = new Scanner(System.in);
        float vyska;
        float vaha;
        float bmi;
        System.out.print("Zadej výšku v cm: ");
        vyska = mujScanner.nextFloat()/100;
        System.out.print("Zadej váhu v kg: ");
        vaha = mujScanner.nextFloat();

        bmi = vaha / (vyska * vyska);

        System.out.print("Vaše BMI je: ");
        System.out.print(bmi);

        if(bmi < 0) {
            System.out.print(" (nelze zadat zápornou váhu)");
        }
        else if(bmi < 18.5f) {
            System.out.print(" (podváha)");
        }
        else if(bmi <= 25f) {
            System.out.print(" (normální hmotnost)");
        }
        else if(bmi <= 30f) {
            System.out.print(" (nadváha)");
        }
        else if(bmi <= 40f) {
            System.out.print(" (obezita)");
        }
        else {
            System.out.print(" (morbidní obezita)");
        }
        */

        // Hod kostkou - hra (sudá = prohra, lichá = výhra)
        /*
        Random kostka = new Random();
        int hozeneCislo;

        hozeneCislo = kostka.nextInt(1, 7);  //rozmezí je dáno >= origin AND < bound

        System.out.print("Na kostce padlo: ");
        System.out.println(hozeneCislo);

        if(hozeneCislo % 2 == 0) {
            System.out.println("Číslo je SUDÉ - PROHRÁVÁŠ");
        }
        else {
            System.out.println("Číslo je LICHÉ - VYHRÁVÁŠ");
        }
        */

        // Podmínky - podmínka switch
        /*
        // Výběr dne
        Scanner mujScanner = new Scanner(System.in);
        int cisloDne;

        System.out.print("Zadej číslo dne: ");
        cisloDne = mujScanner.nextInt();

        switch (cisloDne) {
            case 1:
                System.out.print("Je pondělí");
                break;
            case 2:
                System.out.print("Je úterý");
                break;
            case 3:
                System.out.print("Je středa");
                break;
            case 4:
                System.out.print("Je čtvrtek");
                break;
            case 5:
                System.out.print("Je pátek");
                break;
            case 6:
                System.out.print("Je sobota");
                break;
            case 7:
                System.out.print("Je neděle");
                break;
            default:
                System.out.print("Neplatné číslo dne");
        }

        switch (cisloDne) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" - pracovní den");
                break;
            case 6:
            case 7:
                System.out.println(" - víkend");
                break;
            default:
                System.out.println(" ");
        }
        */

        /*
        VYBLOKOVÁNO PRO DODĚLÁNÍ WEBINÁŘE č. 16 - 23.10.
        */

        // Smyčky - opakování kódu
        /*
        int[] nasobky = new int[10];

        // naplnění pole násobky 10
        for (int i = 0; i < nasobky.length; i++) {
            nasobky[i] = 10 * i;
        }

        // výpis pole násobků
        for (int jedenNasobek: nasobky){
            System.out.println(jedenNasobek);
        }
        */

        // smyčka WHILE
        /*
        int ridiciPromenna = 0;

        while(ridiciPromenna != 0){
            System.out.println(ridiciPromenna);
            ridiciPromenna++;
        }

        do{
            System.out.println(ridiciPromenna);
            //ridiciPromenna++;
        }while(ridiciPromenna != 0);
        */

        // break = ukončení smyčky; continue = ukončení iterace a pokračování dále
        /*
        int ridiciPromenna = 0;

        while (true) {
            System.out.println(ridiciPromenna);

            if (ridiciPromenna > 5){
                continue;  // break / continue
            }

            ridiciPromenna++;
        }
        */

        // Hod kostkou - vylepšení o smyčku
        /*
        Scanner mujScanner = new Scanner(System.in);
        Random kostka = new Random();
        int hozeneCislo;
        boolean ridiciPromenna = true;
        String konec = "";

        System.out.println("Pro hod kostkou stiskni Enter");
        mujScanner.nextLine();

        do {
            hozeneCislo = kostka.nextInt(1, 7);  //rozmezí je dáno >= origin AND < bound

            System.out.print("Na kostce padlo: ");
            System.out.println(hozeneCislo);

            if(hozeneCislo % 2 == 0) {
                System.out.println("Číslo je SUDÉ - PROHRÁVÁŠ");
            }
            else {
                System.out.println("Číslo je LICHÉ - VYHRÁVÁŠ");
            }

            System.out.println("Pro ukončení hry zadej písmeno q");
            konec =  mujScanner.nextLine();

            if (konec.equals("q")) {
                ridiciPromenna = false;
            }

        }while(ridiciPromenna);
        */

        // Hod kostkou - vícenásobné hody (moje vlastní idea)
        /*
        Scanner mujScanner = new Scanner(System.in);
        Random kostka = new Random();
        int hozeneCislo;
        int pocetOpakovani;
        int suda;
        int licha;
        int i;
        boolean ridiciPromenna = true;
        String konec = "";

        System.out.print("Zadej, kolik hodů chceš provést: ");
        pocetOpakovani = mujScanner.nextInt();

        do {
            for (i = 0; i == pocetOpakovani; i++)
            hozeneCislo = kostka.nextInt(1, 7);  //rozmezí je dáno >= origin AND < bound

            System.out.print("Na kostce padlo: ");
            System.out.println(hozeneCislo);

            if(hozeneCislo % 2 == 0) {
                System.out.println("Číslo je SUDÉ - PROHRÁVÁŠ");
            }
            else {
                System.out.println("Číslo je LICHÉ - VYHRÁVÁŠ");
            }

            System.out.println("Pro ukončení hry zadej písmeno q");
            konec =  mujScanner.nextLine();

            if (konec.equals("q")) {
                ridiciPromenna = false;
            }

        }while(ridiciPromenna);
        */

        // Blackjack
        Random nahGen = new Random();
        Scanner mujScanner = new Scanner(System.in);

        int skoreHrace = 0;
        int skoreKrupiera = 0;
        int tazenaKarta = 0;
        String uzivatelskyVstup;












    }
}