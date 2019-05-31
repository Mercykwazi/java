import java.util.InvalidPropertiesFormatException;
public interface TransactionLog {
    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);


}
