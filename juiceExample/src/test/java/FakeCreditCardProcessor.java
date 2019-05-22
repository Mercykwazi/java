public class FakeCreditCardProcessor implements CreditCardProcessor {
    public CreditCard getCardOfOnlyCharge() {
        return null;
    }
    public ChargeResult charge(CreditCard creditCard, Order order){
       return null;
    }
    public int getAmountOfOnlyCharge() {
        return 1;
    }
}
