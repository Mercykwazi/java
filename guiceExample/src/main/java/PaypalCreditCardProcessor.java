public class PaypalCreditCardProcessor implements CreditCardProcessor {
    private CreditCard creditCard;
    private Order order;
  public ChargeResult charge(CreditCard creditCard, Order order){
      this.order=order;
      this.creditCard=creditCard;
      return null;
  }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Order getOrder() {
        return order;
    }
}
