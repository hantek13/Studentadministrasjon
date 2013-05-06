package prosjekt;

/**
 *
 * Skrevet av: Camilla
 * Sist endret: 
 * Endret av: 
 */
public class Studentregister {
    Student foerste; 
    
    //Setter en ny student bakerst i lista
    public String settInn(Student ny) {
        Student peker = foerste;
        if(ny == null) {
            return "Studenten ble ikke registrert. Prøv på nytt.";
        }
        if (foerste == null) {
            foerste = ny;
            return "Studenten ble registrert";
        }
        else { 
            while ( peker.neste != null ) 
                peker = peker.neste; 
            peker.neste = ny;
            return "Studenten ble registrert";
        }
    }
    
    //Finner studenten i lista gitt av studentnr
    public Student finn(String studentnr) {
        Student funnet = null;
        Student peker = foerste;
        while (peker != null) { 
            if (peker.getStudentnr().equals(studentnr)) { 
                funnet = peker; 
            }
            peker = peker.neste;
        }
        return funnet;
    }
    
    //Fjerner en student fra lista gitt av studentnr
    public String fjern(String studentnr) { 
        if ( foerste == null )
            return "Det finnes ingen studenter i registeret";
        if (foerste.getStudentnr().equals(studentnr)) {  
            foerste = foerste.neste;
            return "Studenten ble fjernet fra registeret";
        }
        Student peker = foerste;
        while ( peker.neste!= null) {  
            if(peker.neste.getStudentnr().equals(studentnr)) { 
                peker.neste = peker.neste.neste;
                return "Studenten ble fjernet fra registret";
            }
            peker = peker.neste;
        }
        return "Studenten ble ikke fjernet. Prøv på nytt.";
    }
    
    //Skriver ut studentregisteret
    @Override
    public String toString() {
        String studenter = "";
        Student peker = foerste; 
        if(foerste == null) {
            studenter = "Ingen studenter er registert.";
        }
        else {
            while (peker != null) { 
                studenter = studenter + peker.toString() + "\n\n" ;
                peker = peker.neste;
            }
        }
        return studenter;
    }
    
}
