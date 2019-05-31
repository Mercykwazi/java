public class FakeCreditCardProcessor implements CreditCardProcessor {
    ChargeResult chargeResult=new ChargeResult(true);
    CreditCard creditCard;
    public FakeCreditCardProcessor(CreditCard credit){
        this.creditCard=credit;
    }
    public CreditCard getCardOfOnlyCharge() {

        return this.creditCard ;
    }
    public ChargeResult charge(CreditCard creditCard, Object order){
       return chargeResult;
    }
    public int getAmountOfOnlyCharge() {
        return 100;
    }
}
