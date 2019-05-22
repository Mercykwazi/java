public class CreditCardProcessorFactory {

    private static CreditCardProcessor instance;


    public static void setInstance(CreditCardProcessor processor) {
        instance = processor;
    }
    public static void SquareCreditCardProcessor(){

    }

    public static CreditCardProcessor getInstance() {

        if (instance == null) {
            return null;
        }

        return instance;
    }
}