package primeira_solucao;

import java.time.Duration;

import segunda_solucao.TaxService;

public class RentalService {
	private Double priceHour;
	private Double pricePerDay;
	private TaxService taxservice; //Ruim, porque depende exclusivamente de BrazilTaxService e se mudar preciso mudar aqui e na classe.
	
	public RentalService(Double priceHour, Double pricePerDay,  TaxService taxservice) {
		this.priceHour = priceHour;
		this.pricePerDay = pricePerDay;
		this.taxservice = taxservice;
	}

	public void processInvoice(CarRental carRental) {
		Double minutes = (double) Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		Double hours = minutes / 60.0;
		Double basicPayment;
		if (hours <= 12) {
			basicPayment = priceHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxservice.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
