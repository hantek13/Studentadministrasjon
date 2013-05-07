package prosjekt;

/**
 *fil: Student.java - klasse for student
 * Skrevet av: Hanna
 * Sist endret: 
 * Endret av: 
 * 
 */
public class Student extends Person {
    private static int nestenr = 100000; 
    private String studentnr, adresse, studieprogram;
    private int startaar, avslutningsaar;
    Deltakelse deltakelse;
    Student neste; 
    
    /**
     * Konstruktør
	 * @param n navn 
	 * @param e e-post-adresse
	 * @param t telefonnummer
	 * @param a adresse
	 * @param s studieprogram
	 * @param aa startår for studiet
	 */
    public Student(String n, String e, long t, String a, String s, int aa) {
        super(n, e, t);
        adresse = a; 
        studieprogram = s; 
        startaar = aa;
        deltakelse = new Deltakelse();
        studentnr = "s" + (++nestenr);
    }
    //default-konstruktør
    public Student() {
        
    }
    
    /**
     * Henter studentnr
	 * @return studentnr
	 */
    public String getStudentnr() {
        return studentnr;
    }
    
    /**
     * Henter adresse
     * @return adresse
	 */
    public String getAdresse() {
        return adresse;
    }
   
   /**
     * Henter studieprogram
     * @return studieprogram
	 */
    public String getStudieprogram() {
        return studieprogram;
    }
    
    /**
     * Henter startår
     * @return startaar
     */
    public int getStartaar() {
        return startaar;
    }
    
    /**
     * Henter avslutningsår
     * @return avslutningsaar
     */
    public int getAvslutningsaar() {
        return avslutningsaar;
    }
    
   /**
     * Setter adresse
	 * @param adresse
	 */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    /**
     * Setter avslutningsår
	 * @param avslutningsaar
	 */
    public void setAvslutningsaar(int avslutningsaar) {
        this.avslutningsaar = avslutningsaar;
    }
    
    /**
     * Skriver informasjon om student
	 * @return tekststreng med informasjon
	 */
    public String toString() {
        return super.toString() + 
                "\nStudentnr.: " + studentnr +
                "\nAdresse: " + adresse + 
                "\nStudieprogram: " + studieprogram + 
                "\nStartår: " + startaar;
    }
    
}//End of class Student
