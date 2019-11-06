package Suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Gerator {

	public static String dataHoraParaArquivo() {

		Timestamp dtahora = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(dtahora);
 
	}

}
  