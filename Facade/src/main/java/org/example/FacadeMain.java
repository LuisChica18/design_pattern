package org.example;

import org.example.facade.IPaymentFacade;
import org.example.facade.impl.OnlinePaymentFacadeImpl;
import org.example.facade.impl.PaymentRequest;

public class FacadeMain {

    public static void main(String[] args) {
        PaymentRequest request = new PaymentRequest();
        request.setAmmount(500);
        request.setCardExpDate("10/2015");
        request.setCardName("Marko Flack");
        request.setCardNumber("1234567890123456");
        request.setCardSecureNum("345");
        request.setCustomerId(1L);

        try {
            IPaymentFacade paymentFacade = new OnlinePaymentFacadeImpl();
            paymentFacade.pay(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
