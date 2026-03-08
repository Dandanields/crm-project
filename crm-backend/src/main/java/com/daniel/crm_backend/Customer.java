package com.daniel.crm_backend;

public class Customer {

    private static int counter = 0;
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    
    // Standard-Konstruktor für Spring Boot
    public Customer(){

    }
    // Konstruktor für neue Kunden mit ID-Logik
    public Customer(String firstname, String lastname, String email){
        counter++;
        this.id = String.format("TKD-%03d", counter);
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //Getter (wichtig für JSON-Umwandlung)
    public String getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getEmail() { return email; }

    //Setter (wichtig für das Empfangen von Daten)
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setEmail(String email) { this.email = email; }

}
