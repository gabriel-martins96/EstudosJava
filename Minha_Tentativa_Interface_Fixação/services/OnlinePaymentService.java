package services;

public interface OnlinePaymentService {
public Double taxa(Double valorTotal);
public Double juros(Double valor, Integer meses);
}
