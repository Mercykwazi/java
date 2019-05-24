public class FakeCreditCardProcessor implements CreditCardProcessor {
    ChargeResult chargeResult=new ChargeResult();
    public CreditCard getCardOfOnlyCharge() {
        return null;
    }
    public ChargeResult charge(CreditCard creditCard, Order order){
       return chargeResult;
    }
    public int getAmountOfOnlyCharge() {
        return 1;
    }
}
