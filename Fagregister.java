package prosjekt;

/**
 *
 * Skrevet av: Roza
 * Sist endret: 
 * Endret av: 
 * Mangler: sistepeker
 */
public class Fagregister {
    private Fag foerste;
    Eksamensregister eksamener = new Eksamensregister();        //Prøve å sette denne til private
    
    //Setter et nytt fag bakerst i lista
    public String settInn(Fag ny) {
        Fag peker = foerste;
        if(ny == null) {
            return "Faget ble ikke registrert. Prøv på nytt.";
        }
        else if (foerste == null) {
            foerste = ny;
            return "Faget ble registrert";
        }
        else { 
            while ( peker.neste != null ) 
                peker = peker.neste; 
            peker.neste = ny;
            return "Faget ble registrert";
        }
    }
    
    //Finner faget i lista gitt av fagkode
    public Fag finn(String fagkode) {
        System.out.println("i metoden");
        Fag funnet = null;
        Fag peker = foerste;
        while (peker != null) { 
            System.out.println("i while");
            if (peker.getFagkode().equals(fagkode)) { 
                System.out.println("i if");
                funnet = peker; 
            }
            peker = peker.neste;
        }
        return funnet;
    }
    
    //Fjerner ett fag fra lista gitt av fagkode
    public String fjern(String fagkode) { 
        if ( foerste == null )
            return "Det finnes ingen fag i registeret";
        if (foerste.getFagkode().equals(fagkode)) {  
            foerste = foerste.neste;
            return "Faget ble fjernet fra registeret";
        }
        Fag peker = foerste;
        while ( peker.neste!= null) {  
            if(peker.neste.getFagkode().equals(fagkode)) { 
                peker.neste = peker.neste.neste;
                return "Faget ble fjernet fra registret";
            }
            peker = peker.neste;
        }
        return "Faget ble ikke fjernet. Prøv på nytt.";
    }
    
    //Skriver ut fagregisteret
    @Override
    public String toString() {
        String fag = "";
        Fag peker = foerste; 
        if(foerste == null) {
            fag = "Ingen fag er registert.";
        }
        else {
            while (peker != null) { 
                fag = fag + peker.toString() + "\n\n" ;
                peker = peker.neste;
            }
        }
        return fag;
    }
}
