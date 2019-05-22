public interface CreditCardProcessor {
    public ChargeResult charge(CreditCard creditCard, Order order);
}
