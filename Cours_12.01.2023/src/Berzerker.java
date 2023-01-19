public class Berzerker extends Perso {

    public Berzerker(){
    
    }

    public Berzerker(int vie, int att, int def, int vitesse, int precision, String name, boolean enrager){
        super(vie, att, def, vitesse, precision, name);
        enrager = false;
    }

    public void enrage(Perso J1, int ATT, int PRE, int DEF){

        System.out.println(J1.getName() + " Enrage !");


        ATT = getAtt();
        setAtt(ATT*3);
    
        PRE = getPrecision();
        setPrecision(PRE/2);

        DEF = getDef();
        setDef(DEF*2);

    }

}
