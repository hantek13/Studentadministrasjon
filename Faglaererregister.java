package prosjekt;

/**
 *
 * Skrevet av: Camilla
 * Sist endret: 
 * Endret av: 
 */
public class Faglaererregister {
    private Faglaerer foerste;
    
    //Setter en ny lærer bakerst i lista
    public String settInn(Faglaerer ny) {
        Faglaerer peker = foerste;
        if(ny == null) {
            return "Læreren ble ikke registrert. Prøv på nytt.";
        }
        if (foerste == null) {
            foerste = ny;
            return "Læreren ble registrert";
        }
        else { 
            while ( peker.neste != null ) 
                peker = peker.neste; 
            peker.neste = ny;
            return "Læreren ble registrert";
        }
    }
    
    //Finner faglæreren i lista gitt av ansattnr
    public Faglaerer finn(String ansattnr) {
        Faglaerer funnet = null;
        Faglaerer peker = foerste;
        while (peker != null) { 
            if (peker.getAnsattnr().equals(ansattnr)) { 
                funnet = peker; 
            }
            peker = peker.neste;
        }
        return funnet;
    }
    
    //Fjerner en lærer fra lista gitt av ansattnr
    public String fjern(String ansattnr) { 
        if ( foerste == null )
            return "Det finnes ingen lærere i registeret";
        if (foerste.getAnsattnr().equals(ansattnr)) {  
            foerste = foerste.neste;
            return "Læreren ble fjernet fra registeret";
        }
        Faglaerer peker = foerste;
        while ( peker.neste!= null) {  
            if(peker.neste.getAnsattnr().equals(ansattnr)) { 
                peker.neste = peker.neste.neste;
                return "Læreren ble fjernet fra registret";
            }
            peker = peker.neste;
        }
        return "Læreren ble ikke fjernet. Prøv på nytt.";
    }
    
    //Skriver ut faglærerregisteret
    @Override
    public String toString() {
        String laerere = "";
        Faglaerer peker = foerste; 
        if(foerste == null) {
            laerere = "Ingen lærere er registert.";
        }
        else {
            while (peker != null) { 
                laerere = laerere + peker.toString() + "\n\n" ;
                peker = peker.neste;
            }
        }
        return laerere;
    }
    
}
