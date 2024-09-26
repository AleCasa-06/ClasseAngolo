//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Angolo a;
        Angolo b;


        try {
            a = new Angolo(20, 22, 22);
            b = new Angolo(30, 32, 21);
        } catch (InvalidDataGradi | InvalidDataPrimi | InvalidDataSecondi e ) {
            System.out.println(e.getMessage());
        }
        finally {
            a = new Angolo(20, 22, 22);
            b = new Angolo(30, 32, 21);
        }

        Angolo.Somma(a, b);

        try{
            Angolo.Sottrae(a, b);
        }
        catch (NegativeAngle e){
            System.out.println(e.getMessage());
        }
        finally{
            Angolo.Sottrae(a, b);
        }

        a.converteGradiRadianti();
        b.convertiRadGradi(20.0);




    }
}