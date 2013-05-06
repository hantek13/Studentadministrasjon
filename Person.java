package prosjekt;

/**
 *
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
public abstract class Person {
    private String navn, epost; 
    private long tlf; 
    
    public Person(String n, String e, long t) {
        navn = n; 
        epost = e; 
        tlf = t;
    }
    
    public Person() {
        
    }
    
    public String getNavn() {
        return navn;
    }
    
    public String getEpost() {
        return epost;
    }
    
    public long getTlf() {
        return tlf;
    }
    
    public void setEpost(String epost) {
        this.epost = epost;
    }
    
    public void setTlf(long tlf) {
        this.tlf = tlf;
    }
    
    @Override
    public String toString() {
        return "Navn: " + navn + 
                "\nTelefonnr.: " + tlf + 
                "\nE-post: " + epost;
    }
}
