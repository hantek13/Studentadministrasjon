package prosjekt;

/**
 *
 * Skrevet av: ?
 * Sist endret: 
 * Endret av: 
 */
public class Eksamensregister {
    private Eksamen foerste;
    Karakterregister karakterer = new Karakterregister();
    
    //Setter en eksamen bakerst i lista
    public String settInn(Eksamen ny) {
        Eksamen peker = foerste;
        if(ny == null) {
            return "Eksamenen ble ikke registrert. Prøv på nytt.";
        }
        else if (foerste == null) {
            foerste = ny;
            return "Eksamenen ble registrert";
        }
        else { 
            while ( peker.neste != null ) 
                peker = peker.neste; 
            peker.neste = ny;
            return "Eksamenen ble registrert";
        }
    }
    
    //Finner eksamenen i lista gitt av dato
    public Eksamen finn(String dato) {
        Eksamen funnet = null;
        Eksamen peker = foerste;
        while (peker != null) { 
            if (peker.getDato().equals(dato)) { 
                funnet = peker; 
            }
            peker = peker.neste;
        }
        return funnet;
    }
    
    //Fjerner en eksamen fra lista gitt av dato
    public String fjern(String dato) { 
        if ( foerste == null )
            return "Det finnes ingen eksamener i registeret";
        if (foerste.getDato().equals(dato)) {  
            foerste = foerste.neste;
            return "Eksamenen ble fjernet fra registeret";
        }
        Eksamen peker = foerste;
        while ( peker.neste!= null) {  
            if(peker.neste.getDato().equals(dato)) { 
                peker.neste = peker.neste.neste;
                return "Eksamenen ble fjernet fra registret";
            }
            peker = peker.neste;
        }
        return "Eksamenen ble ikke fjernet. Prøv på nytt.";
    }
    
    public int antallEksamener() {
        int eksamener = 0;
        Eksamen peker = foerste; 
        if (foerste == null) {
            eksamener = 0;
        }
        else {
            while (peker != null) { 
                eksamener++;
                peker = peker.neste;
            }
        }
        return eksamener;
    }
    
    //Skriver ut eksamensregisteret
    @Override
    public String toString() {
        String eksamener = "";
        Eksamen peker = foerste; 
        if(foerste == null) {
            eksamener = "Ingen eksamener er registert.";
        }
        else {
            while (peker != null) { 
                eksamener = eksamener + peker.toString() + "\n\n" ;
                peker = peker.neste;
            }
        }
        return eksamener;
    }
}
