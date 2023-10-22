package subsistemas.subsistema2.cep;

import edu.julio.padroes.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Jaguarari";
    }
    public String recuperarEstado(String cep) {
        return "BA";
    }
}
