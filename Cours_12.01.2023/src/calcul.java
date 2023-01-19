public class calcul {
    private int a;
    private int b;
    private float result;

    public calcul(int a, int b ,int result) {
        this.a = a;
        this.b = b;
        this.result = 0;
    }

    public static int addition(int a, int b){
        return a+b;
    }

    public int addition2(int a, int b){
        return a+b;
    }

    public int soustraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public float division(float a, float b){
        return a/b;
    }

    public float modulo(float a, float b){
        return a%b;
    }
    
    public static void main(String[] agrs) {
        int c = addition(5, 10 );
        System.out.println("valeur de l'add1:" +c);
   
        calcul cal = new calcul(5, 10, 0);
        System.out.println("valeur de l'add2:" +cal.addition2(cal.a, cal.b)); 
        
        calcul cal2 = new calcul(10, 15, 0);
        System.out.println("\nValeur de A: " +cal2.a+ "\nValeur de B: " +cal2.b);
        System.out.println("\nValeur de cal2+: " +cal2.addition2(cal2.a, cal2.b));
        System.out.println("Valeur de cal2-: " +cal2.soustraction(cal2.a, cal2.b));
        System.out.println("Valeur de cal2*: " +cal2.multiplication(cal2.a, cal2.b));
        System.out.println("Valeur de cal2/: " +cal2.division(cal2.a, cal2.b));
        System.out.println("Valeur de cal2%: " +cal2.modulo(cal2.a, cal2.b));
    }
}