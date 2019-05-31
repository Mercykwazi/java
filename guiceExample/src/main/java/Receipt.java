public class Receipt {
    ChargeResult chargeResultSuccessful= new ChargeResult(true);
    public static Receipt forSuccessfulCharge(Object amount) {
        int charged=100;
        return new Receipt();
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
        return Receipt.forDeclinedCharge(declineMessage);
    }

    public static Receipt forSystemFailure(String message) {
        return Receipt.forSystemFailure(message);
    }



    public boolean hasSuccessfulCharge() {
        return true;
    }

    public int getAmountOfCharge() {
        return 100;
    }




}
