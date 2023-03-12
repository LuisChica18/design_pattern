package org.example.adapter.creditapi.impl;

import org.example.adapter.creditapi.banky.YBankCreditApprove;
import org.example.adapter.creditapi.banky.YBankCreditApproveResult;
import org.example.adapter.creditapi.banky.YBankCreditSender;
import org.example.adapter.creditapi.banky.YBankCreditSenderListener;

import java.util.Objects;

public class YBankCreditAdapter implements IBankAdapter, YBankCreditSenderListener {

    private YBankCreditApproveResult yresponse;
    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        YBankCreditApprove yrequest = new YBankCreditApprove();
        yrequest.setCredit((float) request.getAmount());
        yrequest.setName(request.getCustomer());

        YBankCreditSender sender = new YBankCreditSender();
        sender.sendCreditForValidate(yrequest, this);

        do {
            try {
                Thread.sleep(10000);
                System.out.println("yBank request on hold....");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (yresponse == null);

        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(Objects.equals(yresponse.getApproved(), "Y"));
        return response;
    }

    @Override
    public void notifyCreditResult(YBankCreditApproveResult result) {
        this.yresponse = result;
    }
}
