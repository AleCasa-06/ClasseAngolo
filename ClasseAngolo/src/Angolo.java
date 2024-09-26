

public class Angolo extends ElementoGeometrico {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(int gradi, int primi, int secondi) {
        super("Angolo", "Gradi, primi, secondi");
        if(gradi < 0 || gradi > 360){
            throw new InvalidDataGradi();
        }
        if(primi < 0 || primi > 59){
            throw new InvalidDataPrimi();
        }
        if(secondi < 0 || secondi > 59){
            throw new InvalidDataSecondi();
        }
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public void converteGradiRadianti(){
        double rad = ((double) this.gradi) * ((float) Math.PI / 180);
        System.out.println("Gradi: " + this.gradi + " Equivalgono a: " + rad + "radianti");
    }

    public void convertiRadGradi(double rad){
        double g = (rad * 180)/Math.PI;
        System.out.println("Rad: " + rad + " Equivalgono a: " + g + "gradi");
    }

    @Override
    public String toString() {
        return "Angolo{" +
                "gradi=" + gradi +
                ", primi=" + primi +
                ", secondi=" + secondi +
                '}';
    }

    public static void Somma(Angolo a, Angolo b){
        int sumG = a.gradi + b.gradi;
        int sumP = a.primi + b.primi;
        int sumS = a.secondi + b.secondi;
        Angolo sum = new Angolo(sumG, sumP, sumS);

        System.out.println("Angolo somma: " + sum.toString());
    }
    public static void Sottrae(Angolo a, Angolo b){
        int difG = a.gradi + b.gradi;
        int difP = a.primi + b.primi;
        int difS = a.secondi + b.secondi;
        if(difG < 0 || difP < 0 || difS < 0){
            throw new NegativeAngle();
        }
        Angolo diff = new Angolo(difG, difP, difS);

        System.out.println("Angolo somma: " + diff.toString());
    }






}
