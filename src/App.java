import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<Customer> customerList = new ArrayList<>();
      Scanner scanner = new Scanner(System.in);

      System.out.println("--- CRM Kunden-Registrierung ---");

    while (true) {
            // 1. Vorname abfragen & prüfen
            System.out.print("\nVorname: ");
            String firstName = scanner.nextLine().trim();
            if (firstName.equalsIgnoreCase("stop")) break;

            // 2. Nachname abfragen & prüfen
            System.out.print("Nachname: ");
            String lastName = scanner.nextLine().trim();
            if (lastName.equalsIgnoreCase("stop")) break;

            // 3. E-Mail abfragen & prüfen
            System.out.print("E-Mail: ");
            String eMail = scanner.nextLine().trim();
            if (eMail.equalsIgnoreCase("stop")) break;

            // --- VALIDIERUNG ---
            // Wir prüfen, ob eines der Felder leer geblieben ist
            if (firstName.isEmpty() || lastName.isEmpty() || eMail.isEmpty()) {
                System.out.println("FEHLER: Kunde unvollständig! Bitte alle Felder ausfüllen.");
                continue; // Springt zurück zum Anfang der Schleife, ohne einen Kunden zu erstellen
            }

            // Erst wenn wir hier ankommen, sind alle Daten da!
            // Jetzt wird das Objekt erstellt und die ID (TKD-001...) generiert.
            Customer newCustomer = new Customer(firstName, lastName, eMail);
            customerList.add(newCustomer);

            System.out.println("Kunde angelegt: " + firstName + " " + lastName);
        }

        System.out.println("\n--- Alle registrierten Kunden im System: ---");
        for (Customer c : customerList) {
            c.printInfo();
        }

        scanner.close();
        System.out.println("Programm beendet.");


    }
}
