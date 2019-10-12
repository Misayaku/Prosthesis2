package camille.berthelot.prosthesis.Model;

/**
 * Created by
 **/

public class HapticModel {

    // Paramètres
    private int Force;
    private int Frequence;
    private int Motif;

    // Getters
    public int getForce() {
        return Force;
    }
    public int getFrequence() {
        return Frequence;
    }

    public int getMotif() {
        return Motif;
    }
    // Setters
    public void setForce(int f){
        Force=f;
    }
    public void setFrequence(int fr) {
        Frequence = fr;
    }

    public void setMotif(int m) {
        Motif = m;
    }

    // ToString
    public String forcetoString(){
        return ""+Force+"" ;

    }
    public String frequencetoString(){
        return ""+Frequence+"" ;

    }

    public String motiftoString(){
        return ""+Motif+"";
    }
}
