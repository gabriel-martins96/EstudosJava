package exercicio_fixacao;

import java.time.LocalDate;

public class ContractService {
	private OnlinePaymentService onPaymentService;

	public ContractService(OnlinePaymentService onPaymentService) {
		this.onPaymentService = onPaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Double basicQuota = contract.getTotalValue() / months;  
		for (int i = 1; i <= months; i++) {
			  LocalDate dueDate = contract.getDate().plusMonths(i);
			  Double interest = onPaymentService.interest(basicQuota, i);
			  Double fee = onPaymentService.paymentFee(basicQuota + interest); //a porcentagem é em cima do valor com a taxa interest
			  Double quota = basicQuota + interest + fee;
			  
			  contract.getInstalments().add(new Installment(dueDate, quota));
		  }
	}
}
