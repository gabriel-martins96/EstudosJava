import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatação {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Como fazer um LocalDate imprimir em um formato customizado
		LocalDate d04 = LocalDate.parse("2022-07-20"); // Aplicar a máscara que se deseja
		DateTimeFormatter mascara1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // -> ISO_DATE_TIME
		System.out.println("d04: " + d04.format(mascara1));
		System.out.println(mascara1.format(d04)); // Outra forma de fazer
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Na mesma linha

		// Como fazer como LocalDateTime
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("d05 = " + d05.format(mascara1)); // Aqui não mostrará a hora
		DateTimeFormatter mascara2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("d05 = " + d05.format(mascara2));// Vai imprimir com hora
		// System.out.println("d05 = " + d05.format(fmt4));

		// Trabalhando com TimeZone
		// Não tem o método format, é diferente para customizar: usar withZone(). Aqui
		// ele irá fazer o cálculo com base no zoneID do usuário. Devolve custumizado
		// com a hora local do usuário
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Instancionou
		DateTimeFormatter mascara3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // ->
																														// ISO_INSTANT
		System.out.println("Data Zone Time formatada: " + mascara3.format(d06));

	}
}
