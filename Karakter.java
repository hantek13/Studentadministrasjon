package prosjekt;

/**
 *
 * Skrevet av: Camilla
 * Sist endret: 
 * Endret av: 
 */
public class Karakter {
    private String karakter, fagkode, dato;
    Karakter neste;
    
    public Karakter(String k, String f, String d) {
        karakter = k;
        fagkode = f;
        dato = d;
    }
    
    public String getFagkode() {
        return fagkode;
    }
    
    public String getDato() {
        return dato;
    }
    
    public String getKarakter() {
        return karakter;
    }
    
    @Override
    public String toString() {
        return "\nKarakter: " + karakter;
    }
}
