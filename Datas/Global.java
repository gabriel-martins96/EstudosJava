import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Global {

	public static void main(String[] args) {
		// ZoneId.getAvailableZoneIds() -> retorna os nomes dos locais
		// Converter Global para LocalDate
		Instant data1 = Instant.parse("2023-01-04T01:52:26Z"); // PRECISA DOS SEGUNDOS
		LocalDate data1local = LocalDate.ofInstant(data1, ZoneId.systemDefault());
		System.out.println(data1local);
		// LocalDateTime
		LocalDateTime data1localtime = LocalDateTime.ofInstant(data1, ZoneId.systemDefault());
		System.out.println(data1localtime);

		// Para outros países
		LocalDate data2local = LocalDate.ofInstant(data1, ZoneId.of("Portugal"));
		System.out.println(data2local);

	}

}
