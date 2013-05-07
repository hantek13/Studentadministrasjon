
/**
 *Fil: Person.java - Superklasse for alle personer
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
package prosjekt;

/**
 * Personklasse som er superklasse til studenter og lærere
 *
 */
public abstract class Person {
    private String navn, epost; 
    private long tlf; 
    
    /**
     * Konstruktør
	 * @param n navn
	 * @param e e-post-adresse
	 * @param t telefonnummer 
	 */
    public Person(String n, String e, long t) {
        navn = n; 
        epost = e; 
        tlf = t;
    }
    
    //default-konstruktør
    public Person() {
        
    }
    
    /**
     * Henter navn
	 * @return navn
	 */
    public String getNavn() {
        return navn;
    }
    
    /**
     * Henter e-post
	 * @return epost
	 */
    public String getEpost() {
        return epost;
    }
    
    /**
     * Henter telefonnummer 
	 * @return telefonnummer 
	 */
    public long getTlf() {
        return tlf;
    }
    
    /**
     * Setter epost
     * @param epost 
	 */
    public void setEpost(String epost) {
        this.epost = epost;
    }
    
    /**
     * Setter telefonnummer
     * @param telefonnummer
     */
    public void setTlf(long tlf) {
        this.tlf = tlf;
    }
    
    /**
     * Skriver ut informasjon om en person
	 * @return tekststreng med informasjon
	 */
    public String toString() {
        return "Navn: " + navn + 
                "\nTelefonnr.: " + tlf + 
                "\nE-post: " + epost;
    }
}//End of class Person
