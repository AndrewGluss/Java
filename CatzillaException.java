public class CatzillaException {

    public static void main(String[] args) {
        Catzilla catzilla = new Catzilla();
        try {
            catzilla.overclockReactor();
            catzilla.enlargeFangs();
            catzilla.generateExtraClaws();
            catzilla.fireExceptionRockets();
            System.out.println("Catzilla is ready for action.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
