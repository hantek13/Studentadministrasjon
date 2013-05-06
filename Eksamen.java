package prosjekt;

/**
 *
 * Skrevet av: Roza
 * Sist endret: 
 * Endret av: 
 */
public class Eksamen {
    private String dato;
    Eksamen neste;
    
    public Eksamen(String d) {
        dato = d;
    }
    
    public Eksamen() {
        
    }
    
    public String getDato() {
        return dato;
    }
    
    @Override
    public String toString() {
        return "\nDato: " + dato;
    }
    
}
