package services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double taxa(Double valorTotal) {
		return valorTotal*0.02;
	}

	@Override
	public Double juros(Double valor, Integer meses) {
		return valor*0.01*meses;
	}

}
