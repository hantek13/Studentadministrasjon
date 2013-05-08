
/**
 *Fil: Karakter.java - klasse for karakter
 * Skrevet av: Camilla
 * Sist endret: 
 * Endret av: 
 */
package prosjekt;

/**
* Klasse for karakter
*/
public class Karakter {
    private String karakter, fagkode, dato;
    Karakter neste;
    
   /**
    * Konstruktør
    * @param k karakter
    * @param f fagkode
    * @param d dato for når det er satt karakter
    */
    public Karakter(String k, String f, String d) {
        karakter = k;
        fagkode = f;
        dato = d;
    }
    
   /**
    * Henter fagkode
    * @return fagkode
    */
    public String getFagkode() {
        return fagkode;
    }
    
    /**
    * Henter dato
    * @return dato
    */
    public String getDato() {
        return dato;
    }
    
   /**
    * Henter karakter
    * @return karakter
    */
    public String getKarakter() {
        return karakter;
    }
    
   /**
    * Skriver informasjon om karakteren
    * $return Strengen med informasjon
    */
    public String toString() {
        return "\nKarakter: " + karakter;
    }
}//End of class Karakter
