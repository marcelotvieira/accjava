import java.time.Clock;
import java.time.LocalDateTime;
import com.example.planejamentoeventos.*;

public class AceleracaoJava {

	public static void main(String[] args) {
		Clock relogio = Clock.systemDefaultZone();
		System.out.println("Instante atual da zona padrao: ");
		System.out.println(relogio.instant());
		System.out.println("*---------------------------_*");
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		PlanejamentoEventos alertaEvento = new PlanejamentoEventos();
		alertaEvento.agendarEvento("2023-05-25", "16:00:00");
		alertaEvento.checarEvento();
	}
}
