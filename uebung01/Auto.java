package uebung01;

// class = Ein Bauplan für Objekte; Objekt: Instanz einer Klasse, erzeugt mittels Konstruktor
public class Auto {
    // Attribute =  Beschreiben Zustand eines Objekts - Attribute: beschreiben Zustand eines Objekts
    String marke;
    double hubraum;
    int odometer;

    // Konstruktor(en) = Methode, die ein neues Objekt erstellt, Zugriff auf Attribute: this.name, Wird mit new aufgerufen
    // public uebung01.Auto() - Konstruktoren koennen auch leer sein bzw. Konstruktoren koennen optional Argumente erhalten
    public Auto(String marke, double hr, int odo) {
        this.marke = marke;
        this.hubraum = hr;
        this.odometer = odo;
    }
    // Methoden = Funktionen auf Attributen, die Verhalten eines Objektes beschreiben;
    public void erhoeheOdometer(int km) {
        this.odometer += km;
    }
    // anderesAuto Referenz, d.h. Aenderungen Betreffen Original (aehnlich Pointer C)
    public void beobachte(Auto anderesAuto) {
        System.out.println(this.marke + " sieht " + anderesAuto.marke);
    }
    public static void main(String[] args) {
        Auto vw_polo = new Auto("VW", 1.0, 10); // Konstruktor wird mit new aufgerufen
        Auto audi_a4 = new Auto("Audi", 2.0, 25); // uebung01.Auto = Klassennamen; uebung01.Auto hier als Datentyp
        vw_polo.erhoeheOdometer(5); // Ueberschreibt im Attribut von vw_polo.odometer den alten Wert 10 mit neuem Ergebnis 15
        System.out.println("Odometer vom " + vw_polo.marke + ": " + vw_polo.odometer);
        audi_a4.beobachte(vw_polo); // Methodenzugriff via "Objekt.xxx". Bspw.: "audi_a4.beobachte" greift auf Methode "beobachte" zu
        vw_polo.beobachte(vw_polo);
    }
}


