public class InvalidDataGradi extends RuntimeException {

    public InvalidDataGradi() {
        super("errore nell'inserimento dei gradi");
    }

    public InvalidDataGradi(String message) {
        super(message);
    }


}
