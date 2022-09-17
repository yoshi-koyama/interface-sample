public class PaypalProcessor implements PaymentProcessor {
  @Override
  public String makePayment(int amountToPay) {
    return "Paypalで" + amountToPay + "ドル支払いました。";
  }
}
