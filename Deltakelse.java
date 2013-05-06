/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosjekt;

/**
 *
 * Skrevet av: Hanna
 * Sist endret: 06.05.2013
 * Endret av: 
 */
public class Deltakelse {
    private boolean aktiv;              //Registrer om studenten er aktiv i studiet eller har sluttet
    Fagregister naavaerende, fullfoerte;
    Karakterregister karakterer;
    
    public Deltakelse() {
        karakterer = new Karakterregister();
        naavaerende = new Fagregister();
        fullfoerte = new Fagregister();
        aktiv = true;
    }
    
    //test2
    public boolean getAktiv() {
        return aktiv;
    }
    
    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    
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
    
    public String settArbeidskravBestaatt(String fagkode) { 
        Fag fag = naavaerende.finn(fagkode);
        if (fag != null) {
            fag.setBestaattArbeidskrav();
            return "Arbeidskravene er registrert som bestått";
        }
        return "Arbeidskravene ble ikke registrert som bestått. Prøv på nytt.";
    }
    
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
    
    public String meldAvEksamen(String fagkode, String dato) {
        Fag fag = naavaerende.finn(fagkode);
        if (fag != null) {
            //fag.eksamener.fjern(dato);
            return "Studenten er nå meldt av eksamen i dette faget";
        }
        return "Studenten ble ikke avmeldt eksamen. Prøv på nytt.";
    }
    
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
    
    
    
    
}
