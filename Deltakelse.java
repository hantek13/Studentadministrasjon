/**
 *Fil: Deltakelse.java - klasse for deltakelse
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
package prosjekt;

//klasse for deltakelse
public class Deltakelse {
    private boolean aktiv;  //Registrer om studenten er aktiv i studiet eller har sluttet
    Fagregister naavaerende, fullfoerte;
    Karakterregister karakterer;
    //tom konstruktør 
    public Deltakelse() {
        //oppretter objekter
        karakterer = new Karakterregister();  
        naavaerende = new Fagregister();
        fullfoerte = new Fagregister();
        aktiv = true; 
    }
    
    /**
     * Henter aktiv
     * @return aktiv
     */
    public boolean getAktiv() {
        return aktiv;
    }
    
    /**
     * Setter aktiv
     * @param aktiv
     */
    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    
    /**
     * Setter fag som er fullført
     * @param fagkode og dato
     */
    public String settFagSomFullfoert(String fagkode, String dato) {
        Fag fag = naavaerende.finn(fagkode);
        if (fag != null) {
            if (naavaerende.eksamener.karakterer.finn(fagkode, dato) != null) {
                fullfoerte.settInn(fag);
                naavaerende.fjern(fagkode);
                return "Faget ble registrert som fullført";
            }
            else {
                return "Det har ikke blitt registrert noen karakter i dette faget. Faget ble ikke registrert som fullført";
            }
        }
        return "Faget ble ikke registrert som fullført. Prøv på nytt";
    }
    
     /**
     * Setter arbeidskrav bestått
     * @param fagkode
     */
    public String settArbeidskravBestaatt(String fagkode) { 
        Fag fag = naavaerende.finn(fagkode);
        if (fag != null) {
            fag.setBestaattArbeidskrav();
            return "Arbeidskravene er registrert som bestått";
        }
        return "Arbeidskravene ble ikke registrert som bestått. Prøv på nytt.";
    }
    
    /**
     * registrerer eksamen på studenter som har arbeidskravene bestått
     *  og som ikke har meldt seg opp til eksamen inntil 3 ganger 
     * @param fagkode og eksamen
     */
    public String meldOppTilEksamen(String fagkode, Eksamen eksamen) {
        if (naavaerende.finn(fagkode) != null && eksamen != null) { 
            if (naavaerende.eksamener.antallEksamener() < 3 && naavaerende.finn(fagkode).getTillatelseTilAaTaEksamen()) {
                naavaerende.eksamener.settInn(eksamen);
                System.out.println(naavaerende.eksamener.antallEksamener());
            return "Studenten er nå meldt opp til eksamen i dette faget";
            }
            else {
                return "Studenten er allerede meldt opp til 3 eksamener i faget.";
            }
        }
        return "Studenten ble ikke meldt opp til eksamen. Det kan være at arbeidskravene ikke er bestått.";
    }
    
    /**
     * registrerer eksamener som er avmeldt  
     * @param fagkode og dato
     */
    public String meldAvEksamen(String fagkode, String dato) {
        Fag fag = naavaerende.finn(fagkode);
        if (fag != null) {
            //fag.eksamener.fjern(dato);
            return "Studenten er nå meldt av eksamen i dette faget";
        }
        return "Studenten ble ikke avmeldt eksamen. Prøv på nytt.";
    }
    
     /**
     * registrerer eksamener som er avlagt i faget  
     * @param fagkode og dato
     */
    public String avlagteEksamener(String fagkode, String dato) {
        Fag fag = naavaerende.finn(fagkode); 
        if (fag != null) {
            if (naavaerende.eksamener.karakterer.finn(fagkode, dato) != null) {
                System.out.println(naavaerende.eksamener.toString() + naavaerende.eksamener.karakterer.toString());
            }
            else {
                return "Det finnes ingen avlagte eksamener i dette faget.";
            }
        }
        return "Finner ikke faget.";
    }
    
     /**
     * registrerer eksamenens karakter  
     * @param fagkode, dato og karakter
     */
    public String registrerKarakter(String fagkode, String dato, String karakter) {
        Fag fag = naavaerende.finn(fagkode); 
        if (fag != null) {
            if (naavaerende.eksamener.finn(dato) != null) {
                return naavaerende.eksamener.karakterer.settInn(new Karakter(karakter, fagkode, dato));
            }
            else {
                return "";
            }
        }
        return "Karakteren ble ikke registrert. Prøv på nytt";
    }
    
    public void test() {
        System.out.println(naavaerende.toString());
    }
    
    
    
    
}// End of class Deltakelse
