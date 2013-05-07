
/**
 *Fil: Faglaerer - Klasse for faglærer
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
package prosjekt;


/**
 * Klasse for faglærer, som er subklasse til den abstrakte klassen Person
 */
public class Faglaerer extends Person {
    private String ansattnr, kontornr;
    private static int nestenr = 100000;
    Faglaerer neste;
    
    /**
     * Konstruktør
	 * @param n navn
	 * @param e e-post-adresse
	 * @param t telefonnummer
     * @param k kontornr
     */
    public Faglaerer(String n, String e, long t, String k) {
        super(n, e, t);
        kontornr = k;
        ansattnr = "l" + (++nestenr);
    }
    
    //default-konstruktør
    public Faglaerer() {
        
    }
    
    /**
     * Henter ansattnr
	 * @return ansattnr
	 */
    public String getAnsattnr() {
        return ansattnr;
    }
    
    /**
     * Henter kontornr
	 * @return kontornr
	 */
    public String getKontornr() {
        return kontornr;
    }
    
    /**
     * Setter kontornr
	 * @param kontornr
	 */
    public void setKontornr(String kontornr) {
        this.kontornr = kontornr;
    }
    
    /**
     * Skriver informasjon om en faglærer
	 * $return Strengen med informasjon
	 */
    public String toString() {
        return super.toString() + 
                "\nAnsattnr.: " + ansattnr + 
                "\nKontornr.: " + kontornr;
    }
    
}//End of class Faglaerer
