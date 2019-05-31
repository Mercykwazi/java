public interface CreditCardProcessor {
    public ChargeResult charge(CreditCard creditCard, Object order);
}
