package prosjekt;

/**
 *
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 */
public class Student extends Person {
    private static int nestenr = 100000; 
    private String studentnr, adresse, studieprogram;
    private int startaar, avslutningsaar;
    Deltakelse deltakelse;
    Student neste; 
    
    public Student(String n, String e, long t, String a, String s, int aa) {
        super(n, e, t);
        adresse = a; 
        studieprogram = s; 
        startaar = aa;
        deltakelse = new Deltakelse();
        studentnr = "s" + (++nestenr);
    }
    
    public Student() {
        
    }
    
    public String getStudentnr() {
        return studentnr;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public String getStudieprogram() {
        return studieprogram;
    }
    
    public int getStartaar() {
        return startaar;
    }
    
    public int getAvslutningsaar() {
        return avslutningsaar;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void setAvslutningsaar(int avslutningsaar) {
        this.avslutningsaar = avslutningsaar;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nStudentnr.: " + studentnr +
                "\nAdresse: " + adresse + 
                "\nStudieprogram: " + studieprogram + 
                "\nStartår: " + startaar;
    }
    
}
