

/**
 *Fil: Eksamen.java - klasse for eksamen
 * Skrevet av: Roza
 * Sist endret: 
 * Endret av: 
 */
package prosjekt;

/**
* Klasse for eksamen
*/
public class Eksamen {
    private String dato;
    Eksamen neste;
    
   /**
    * Konstruktør
    * @param d dato for når eksamen ble utgitt
    */
    public Eksamen(String d) {
        dato = d;
    }
    
    //default-konstruktør
    public Eksamen() {
        
    }
    
   /**
    * Henter eksamens dato
    * @return dato
    */
    public String getDato() {
        return dato;
    }
    
   /**
    * Skriver informasjon om eksamen
    * $return Strengen med informasjon
    */
    public String toString() {
        return "\nDato: " + dato;
    }
    
}//End of class Eksamen
