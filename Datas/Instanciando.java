import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciando {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
				
				//Do momento
				LocalDate d01 = LocalDate.now();
				LocalDateTime d02 = LocalDateTime.now();
				//Data global
				Instant d03 = Instant.now();
				
				System.out.println("d01 (Local Date) = " + d01.toString()); //chama implicito o toString
				System.out.println("d02 (Local Date Time)  = " + d02.toString());
				System.out.println("d03 (Instante) = " + d03.toString());
				
				//Converter texto ISO 8601
				LocalDate d04 = LocalDate.parse("2022-07-20");
				System.out.println("d04 = " + d04.toString());
				LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
				System.out.println("d05 = " + d05.toString());
				Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
				//no lugar do z coloco o timezone pretendido
				System.out.println("d06 = " + d06.toString());
				Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
				// londres - 3 = Brasil, logo, 01:30 em Londres são 04:30
				System.out.println("d07 = " + d07.toString());
				
				
				// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
				DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
				System.out.println("d08 = " + d08.toString());
				LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
				System.out.println("d09 = " + d09.toString());

				LocalDate d10 = LocalDate.of(2022, 07, 20);
				System.out.println("d10 = " + d10.toString());
				LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
				System.out.println("d11 = " + d11.toString());
				
				
				
	}
}
