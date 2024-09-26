public class InvalidDataPrimi extends RuntimeException {

    public InvalidDataPrimi() {
        super("errore nell'inserimento dei primi");
    }


    public InvalidDataPrimi(String message) {
        super(message);
    }
}
