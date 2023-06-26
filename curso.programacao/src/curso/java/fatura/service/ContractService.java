package curso.java.fatura.service;

import curso.java.fatura.entity.Contract;
import curso.java.fatura.entity.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double basicCota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i ++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(basicCota, i);
            Double fee = onlinePaymentService.paymentFee(basicCota + interest);
            Double quota = basicCota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate,quota));
        }
    }
}
