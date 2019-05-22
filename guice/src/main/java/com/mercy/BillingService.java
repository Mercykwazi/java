package com.mercy;

public interface BillingService{

    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}


