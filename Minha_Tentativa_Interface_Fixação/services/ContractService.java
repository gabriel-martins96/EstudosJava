package services;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void ProcessamentoContrato(Contrato contrato, Integer meses) {
		//Obter valor base da parcela
		Double valorBase = contrato.getValorTotal() / 3;
		
		//Construir o valor da parcela
		for (int i = 1; i<=meses; i++) {
			Double juros = onlinePaymentService.juros(valorBase, i); 
			Double taxa = onlinePaymentService.taxa(valorBase + juros);
			Double valorParcela = valorBase + juros + taxa;
			LocalDate dataAtt = contrato.getData().plusMonths(i);
			contrato.getParcelas().add(new Parcelas(dataAtt, valorParcela));
		}
	}
	
}
