public class Customer {
    // Statischer Zähler: Er gehört der Klasse, nicht dem einzelnen Objekt!
    private static int counter = 0;

    // 1. Attribute (Variablen - hier nutzen wir Kapselung!)
    private String id;
    private String firstname;
    private String lastname;
    private String email;

    // 2. Konstruktor (Der "Bauarbeiter", der das Objekt erstellt)
    public Customer(String firstname, String lastname, String email) {

        counter++;
        this.id = String.format("TKD-%03d", counter);
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    // 3. Methoden (Was kann die Klasse tun?)
    public void printInfo() {
        System.out.println("ID: " + id + ", Vorname: " + firstname + ", Nachname: "+ lastname + ", E-Mail: "+ email );
    }

    // Getter (Damit wir von außen auf die privaten Daten zugreifen können)
    public String getFirstname() {
        return firstname;
    }
    
}