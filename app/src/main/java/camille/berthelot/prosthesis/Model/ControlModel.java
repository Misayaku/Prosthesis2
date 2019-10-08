package camille.berthelot.prosthesis.Model;

/**
 * Created by
 **/

public class ControlModel {

    // Paramètres
    private int Intensite;
    private int MouvementType;


    // Getters
    public int getIntensite() {
        return Intensite;
    }
    public int getMouvementType() {
        return MouvementType;
    }

    // Setters
    public void setIntensite(int i){
        Intensite=i;
    }
    public void setMouvementType(int m) {
        MouvementType = m;
    }

    // ToString
    public String intensitetoString(){
        return ""+Intensite+"" ;

    }

    public String mouvementtoString(){
        return ""+MouvementType+"";
    }
}
