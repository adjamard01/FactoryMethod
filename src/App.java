// import Opdracht.CreditCardPaymentCreator;
// import Opdracht.IdealPaymentCreator;
// import Opdracht.PaymentCreator;
import Voorbeeld.ConcreteCreatorA;
import Voorbeeld.ConcreteCreatorB;
import Voorbeeld.Creator;

public class App {
    public static void main(String[] args) throws Exception {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.anOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.anOperation();

        // PaymentCreator idealCreator = new IdealPaymentCreator();
        // idealCreator.processCheckout();

        // PaymentCreator creditCardCreator = new CreditCardPaymentCreator();
        // creditCardCreator.processCheckout();

        // PaymentCreator applePayCreator = new ApplePayPaymentCreator();
        // applePayCreator.processCheckout();
    }
}
