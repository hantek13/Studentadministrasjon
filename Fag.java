
/**
 *Fil: Fag.java - klasse for fag
 * Skrevet av: Roza
 * Sist endret: 
 * Endret av: 
 * Mangler: ansvarlig lærer
 */
package prosjekt;

/**
* Klasse for fag
*/
public class Fag {
    private String navn, fagkode, beskrivelse, vurderingsform, arbeidskrav;
    private int studiepoeng;
    private boolean bestaattArbeidskrav, tillatelseTilAaTaEksamen;
    Fag neste;
    
   /**
    * Konstruktør
    * @param n fagets navn 
    * @param f fagkode
    * @param b beskrivelse av mål og innhold
    * @param v vurderingsform
    * @param a arbeidskrav for faget 
    * @param s antall studiepoeng for faget
    */
    public Fag(String n, String f, String b, String v, String a, int s) {
        navn = n; 
        fagkode = f; 
        beskrivelse = b; 
        vurderingsform = v; 
        arbeidskrav = a; 
        studiepoeng = s;
        bestaattArbeidskrav = false;
        tillatelseTilAaTaEksamen = false;
    }
    
    //default-konstruktør
    public Fag() {

    }
    
   /**
    * Henter fagets navn
    * @return fagets navn
    */
    public String getNavn() {
        return navn;
    }
    
    /**
    * Henter fagkode
    * @return fagkode
    */
    public String getFagkode() {
        return fagkode;
    }
    
    /**
    * Henter beskrivelse av mål og innhold
    * @return beksrivelse
    */
    public String getBeskrivelse() {
        return beskrivelse;
    }
    
    
    /**
    * Henter vurderingsform
    * @return vurderingsform
    */
    public String getVurderingsform() {
        return vurderingsform;
    }
    
    
    /**
    * Henter arbeidskrav det er for faget
    * @return arbeidskrav
    */
    public String getArbeidskrav() {
        return arbeidskrav;
    }
    
     /**
    * Henter antall studiepoeng for faget
    * @return studiepoeng
    */
    public int getStudiepoeng() {
        return studiepoeng;
    }
    
   /**
    * Henter arbeidskravene er bestått i faget.
    * @return bestått arbeidskrav
    */
    public boolean getBestaattArbeidskrav() {
        return bestaattArbeidskrav;
    }
    
     /**
    * Henter tillatelse til å gå opp til eksamen.
    * @return tillatelseTilAaTaEksamen;;
    */
    public boolean getTillatelseTilAaTaEksamen() {
        return tillatelseTilAaTaEksamen;
    }
    
   /**
    * Setter beskrivelse
    * @param beskrivelse
    */
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
    
    /**
    * Setter vurderingsform
    * @param vurderingsform
    */
    public void setVurderingsform(String vurderingsform) {
        this.vurderingsform = vurderingsform;
    }
    
   /**
    * Setter bestått arbeidskrav
    */
    public void setBestaattArbeidskrav() {
        bestaattArbeidskrav = true;
        tillatelseTilAaTaEksamen = true;
    }
    
   /**
    * Skriver informasjon om fag
    * $return Strengen med informasjon
    */
    public String toString() {
        return "Navn: " + navn + 
                "\nFagkode: " + fagkode + 
                "\nStudiepoeng: " + studiepoeng + 
                "\nBeskrivelse: " + beskrivelse + 
                "\nVurderingsform: " + vurderingsform + 
                "\nArbeidskrav: " + arbeidskrav + 
                "\nFaglærer: ";
    }
    
}// End of class Fag
