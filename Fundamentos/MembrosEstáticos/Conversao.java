package MembrosEstáticos;

public class Conversao {
	static final double IOF = 0.06;
	public static double converter(double valorDolares, double dolarCotation) {
		return dolarCotation * (valorDolares + (valorDolares*IOF));
	}
}
