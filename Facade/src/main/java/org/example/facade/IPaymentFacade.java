package org.example.facade;

import org.example.exception.GeneralPaymentError;
import org.example.facade.impl.PaymentRequest;
import org.example.facade.impl.PaymentResponse;

public interface IPaymentFacade {

    public PaymentResponse pay(PaymentRequest paymentRequest)throws GeneralPaymentError;
}
