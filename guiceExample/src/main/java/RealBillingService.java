public class RealBillingService implements BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    public RealBillingService(CreditCardProcessor processor,
                              TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        ChargeResult result = processor.charge(creditCard,order.getAmount());
        transactionLog.logChargeResult(result);
        System.out.println("what is result: "+result);
         return result.wasSuccessful()
                ? Receipt.forSuccessfulCharge(order.getAmount())
                : Receipt.forDeclinedCharge(result.getDeclineMessage());
    }
}