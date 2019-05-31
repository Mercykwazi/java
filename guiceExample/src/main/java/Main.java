//import com.google.inject.Guice;
//import com.google.inject.Inject;

import com.google.inject.Guice;

public class Main {
        public static void main(String[] args) {
            CreditCardProcessor processor = new PaypalCreditCardProcessor();
            TransactionLog transactionLog = new DatabaseTransactionLog();
            BillingService billingService
                    = new RealBillingService(processor, transactionLog);

        }
    }
