package prosjekt;

/**
 *
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
public class Faglaerer extends Person {
    private String ansattnr, kontornr;
    private static int nestenr = 100000;
    Faglaerer neste;
    
    public Faglaerer(String n, String e, long t, String k) {
        super(n, e, t);
        kontornr = k;
        ansattnr = "l" + (++nestenr);
    }
    
    public Faglaerer() {
        
    }
    
    public String getAnsattnr() {
        return ansattnr;
    }
    
    public String getKontornr() {
        return kontornr;
    }
    
    public void setKontornr(String kontornr) {
        this.kontornr = kontornr;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nAnsattnr.: " + ansattnr + 
                "\nKontornr.: " + kontornr;
    }
    
}
