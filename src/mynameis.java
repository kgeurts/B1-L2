import java.util.Scanner;

public class mynameis {

    public static void main(String[] args) {

        System.out.println("Hoe heet je? ");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();

        System.out.println("Hoe oud ben je? ");
        Scanner scanner2 = new Scanner(System.in);
        String leeftijd = scanner.nextLine();

        System.out.println("Welke kleur ogen heb je? ");
        Scanner scanner3 = new Scanner(System.in);
        String ogen = scanner.nextLine();

        System.out.println("Welke postcode heb je? ");
        Scanner scanner4 = new Scanner(System.in);
        String postcode = scanner.nextLine();

        System.out.println("Waar woon je? ");
        Scanner scanner5 = new Scanner(System.in);
        String woonplaats = scanner.nextLine();



        System.out.println ("Hallo " + naam + " ik zie dat jij " + leeftijd + " jaar oud bent." );
        System.out.println ("Je woont in " + woonplaats + " op de postcode " + postcode + " en hebt " + ogen + "e ogen." );
                // ("Your username is " + naam + leeftijd+ ogen);




    }
}


