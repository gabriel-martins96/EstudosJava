package Arredondamento;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Arredondamento {
	public static void main(String[] args) {
		//Sem arredondar
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(0.912385));
		// Imprime 0,91
		
		//Para arredondar - funcionou
		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(df.format(2.5));
		
		//Com printf - ATENÇÃO É COM VÍRGULAAA
		double x = 123.123515656156156;
		System.out.printf( "%.2f", x );
		
	}
}
