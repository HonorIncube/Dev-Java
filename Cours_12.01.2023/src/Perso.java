public class Perso {
    private int vie;
    private int att;
    private int def;
    private String name;
    private int precision;
    private int vitesse;


    public Perso(){

    }

    public Perso(int vie, int att, int def, int vitesse, int precision, String name){
        this.vie = vie;
        this.att = att;
        this.def = def;
        this.name = name;
        this.precision = precision;
        this.vitesse = vitesse;
    }

    // Ligne des Get Set
    public int getVie() {
        return vie;
    }
    public void setVie(int vie) {
        this.vie = vie;
    }
    public int getAtt() {
        return att;
    }
    public void setAtt(int att) {
        this.att = att;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVitesse() {
        return vitesse;
    }
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
    public int getPrecision() {
        return precision;
    }
    public void setPrecision(int precision) {
        this.precision = precision;
    }
    //Ligne des Get Set terminer


    public void attVs(Perso J1, Perso J2) {
        while(J2.vie > 0){
            System.out.println("\n"+J1.name+ " attaque " +J2.name+ " !");
            J2.setVie(J2.vie - (J1.att-J2.def));
            J2.testMort(J2);
        }
        
    }

    public boolean testMort(Perso J1){
        boolean mort = false;

        if(J1.vie <= 0){
            System.out.println(J1.name+ " est mort");
            mort = true;
        } else{
            System.out.println("Les points de vie de " +J1.name+ " sont à : " +J1.vie+ "pv");
        }

        return mort;
    }




    public static void main(String[] args) {
        Perso P1 = new Perso(1,1,1,1,1, "Maxime");
        Berzerker P2 = new Berzerker(60, 7, 1, 20, 80, "Mathis", false);
        Perso P3 = new Perso (80, 15, 5, 10,90, "Néo");
        Perso P4 = new Perso (100, 6, 5, 5, 95, "Ugo");

        System.out.println("Voici les stats de tout les personnages :");
        System.out.println(P1.name +": " +P1.vie+ "pv, " +P1.att+ "att, " +P1.def+ "def, " +P1.vitesse+ "vit, " +P1.precision+ "pre");
        System.out.println(P2.getVie()+ ": " +P2.getVie()+ "pv, " +P2.getAtt()+ "att, " +P2.getDef()+ "def, " +P2.getVitesse()+ "vit, " +P2.getPrecision()+ "pre");
        System.out.println(P3.name+ ": " +P3.vie+ "pv, " +P3.att+ "att, " +P3.def+ "def, " +P3.vitesse+ "vit, " +P3.precision+ "pre");
        System.out.println(P4.name+ ": " +P4.vie+ "pv, " +P4.att+ "att, " +P4.def+ "def, " +P4.vitesse+ "vit, " +P4.precision+ "pre");
    
        P2.attVs(P3, P2);
    }
}
