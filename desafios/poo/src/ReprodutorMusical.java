import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ReprodutorMusical {
    void tocar() {
        System.out.println("\uD83C\uDFB5 Tocando a playlist...");
    }

    void pausar() {
        System.out.println("⏸️ Música pausada!");
    }

    void selecionarMusica() {
        Random r = new Random();
        int selecao = r.nextInt(1, 5);
        List<String> musicas = Arrays.asList("Frank Ocean - Nights",
                "Kendrick Lamar - LOVE.FEAT.ZACARI.",
                "Frank Ocean - Pink + White",
                "Childish Gambino - Redbone",
                "Ye - Saint Pablo");
        System.out.println("Tocando agora: " + musicas.get(selecao));
    }
}
