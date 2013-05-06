/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosjekt;

/**
 *
 * @author camillakaasi
 */
public class Prosjekt {
    
    static Faglaererregister laerere = new Faglaererregister();
    static Studentregister studenter = new Studentregister();
    static Fagregister fag = new Fagregister();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Eksamensregister eksamener = new Eksamensregister();
        
        studenter.settInn(new Student("lol", "lol", 10000L, "lol", "lol", 1));
        studenter.settInn(new Student("lol", "lol", 10000L, "lol", "lol", 1));
        Student student = studenter.finn("s100001");
        //Student student2 = studenter.finn("s100002");
        Fag faget = new Fag("fag", "fag", "lol", "lol", "lol", 60);
        Fag faget2 = new Fag("fag", "fag2", "lol", "lol", "lol", 60);
        Fag faget3 = new Fag("fag", "fag3", "lol", "lol", "lol", 60);
        fag.settInn(faget);
        fag.settInn(faget2);
        //fag.settInn(faget3);
        //Fag faget4 = fag.finn("fag");
        //System.out.println(faget.toString());
        //Fag faget2 = fag.finn("fag2");
        student.deltakelse.naavaerende.settInn(faget3);
        //student.deltakelse.nyttFag(new Fag("fag", "fag2", "lol", "lol", "lol", 60));
        System.out.print(student.deltakelse.naavaerende.toString());
        //System.out.println(student.deltakelse.naavaerende.toString());
        //student.deltakelse.settArbeidskravBestaatt("fag");
        //student.deltakelse.settArbeidskravBestaatt("fag2");
        //student2.deltakelse.naavaerende.settInn(faget);
        //student2.deltakelse.settArbeidskravBestaatt("fag");
        //Eksamen eksamen = new Eksamen("dato");
        //fag.eksamener.settInn(eksamen);           //Oppretter ny eksamen i faget
        //System.out.println(student.deltakelse.meldOppTilEksamen("fag", eksamen));
        //System.out.println(student.deltakelse.meldOppTilEksamen("fag", eksamen2));
        //System.out.println(student.deltakelse.meldOppTilEksamen("fag", eksamen3));
        //System.out.println(student.deltakelse.meldOppTilEksamen("fag", eksamen4));
        //System.out.println(student2.deltakelse.meldOppTilEksamen("fag", eksamen));
        //System.out.println(student.deltakelse.meldAvEksamen("fag", "dato"));
        //student.deltakelse.registrerKarakter("fag", "dato", "A");
        //System.out.println(student2.deltakelse.registrerKarakter("fag", "dato", "B"));
        //System.out.println(student.deltakelse.settFagSomFullfoert("fag", "dato"));
        //System.out.println(student2.deltakelse.settFagSomFullfoert("fag"));
        //student.deltakelse.avlagteEksamener("fag", "dato");
        //student2.deltakelse.avlagteEksamener("fag");
    }
}
