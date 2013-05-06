/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosjekt;

/**
 *
 * Skrevet av: Camilla
 * Sist endret: 
 * Endret av:
 */
public class Karakterregister {
    private Karakter foerste;
    
    //Setter karakteren bakerst i lista
    public String settInn(Karakter ny) {
        Karakter peker = foerste;
        if(ny == null) {
            return "Karakteren ble ikke registrert. Prøv på nytt.";
        }
        else if (foerste == null) {
            foerste = ny;
            return "Karakteren ble registrert";
        }
        else { 
            while ( peker.neste != null ) 
                peker = peker.neste; 
            peker.neste = ny;
            return "Karakteren ble registrert";
        }
    }
    
    //Finner karakteren i lista gitt av fagkode og dato
    public Karakter finn(String fagkode, String dato) {
        Karakter funnet = null;
        Karakter peker = foerste;
        while (peker != null) { 
            if (peker.getFagkode().equals(fagkode) && peker.getDato().equals(dato)) { 
                funnet = peker; 
            }
            peker = peker.neste;
        }
        return funnet;
    }
    
    //Skriver ut karakterene
    @Override
    public String toString() {
        String karakterer = "";
        Karakter peker = foerste; 
        if(foerste == null) {
            karakterer = "Ingen karakterer er registert.";
        }
        else {
            while (peker != null) { 
                karakterer = karakterer + peker.toString() + "\n\n" ;
                peker = peker.neste;
            }
        }
        return karakterer;
    }
    
}
