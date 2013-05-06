package prosjekt;

/**
 *
 * Skrevet av: Roza
 * Sist endret: 
 * Endret av: 
 * Mangler: ansvarlig lærer
 */
public class Fag {
    private String navn, fagkode, beskrivelse, vurderingsform, arbeidskrav;
    private int studiepoeng;
    private boolean bestaattArbeidskrav, tillatelseTilAaTaEksamen;
    Fag neste;
    
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
    
    public Fag() {

    }
    
    public String getNavn() {
        return navn;
    }
    
    public String getFagkode() {
        return fagkode;
    }
    
    public String getBeskrivelse() {
        return beskrivelse;
    }
    
    public String getVurderingsform() {
        return vurderingsform;
    }
    
    public String getArbeidskrav() {
        return arbeidskrav;
    }
    
    public int getStudiepoeng() {
        return studiepoeng;
    }
    
    public boolean getBestaattArbeidskrav() {
        return bestaattArbeidskrav;
    }
    
    public boolean getTillatelseTilAaTaEksamen() {
        return tillatelseTilAaTaEksamen;
    }
    
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
    
    public void setVurderingsform(String vurderingsform) {
        this.vurderingsform = vurderingsform;
    }
    
    public void setBestaattArbeidskrav() {
        bestaattArbeidskrav = true;
        tillatelseTilAaTaEksamen = true;
    }
    
    @Override
    public String toString() {
        return "Navn: " + navn + 
                "\nFagkode: " + fagkode + 
                "\nStudiepoeng: " + studiepoeng + 
                "\nBeskrivelse: " + beskrivelse + 
                "\nVurderingsform: " + vurderingsform + 
                "\nArbeidskrav: " + arbeidskrav + 
                "\nFaglærer: ";
    }
    
}
