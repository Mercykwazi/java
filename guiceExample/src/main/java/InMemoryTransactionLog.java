public class InMemoryTransactionLog implements TransactionLog {
    public boolean wasSuccessLogged() {
        return true;
    }

    @Override
    public void logChargeResult(ChargeResult result) {

    }

    @Override
    public void logConnectException(UnreachableException e) {

    }
}
