public class Receipt {
    public static Receipt forSuccessfulCharge(Receipt receipt) {
        return receipt;
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
        return null;
    }

    public static Receipt forSystemFailure(String message) {
        return null;
    }



    public boolean hasSuccessfulCharge() {
        return true;
    }

    public int getAmountOfCharge() {
        return 1;
    }
}
