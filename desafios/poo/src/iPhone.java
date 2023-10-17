public class iPhone {
    private final ReprodutorMusical reprodutor;
    private final AparelhoTelefonico telefone;
    private final Navegador browser;

    public iPhone() {
        reprodutor = new ReprodutorMusical();
        browser = new Navegador();
        telefone = new AparelhoTelefonico();
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.reprodutor.tocar();
        iphone.reprodutor.selecionarMusica();
        iphone.reprodutor.pausar();

        System.out.println();
        iphone.browser.adicionarNovaAba("udemy.com");
        iphone.browser.exibirPagina("udemy.com");
        iphone.browser.atualizarPagina();

        System.out.println();
        iphone.telefone.ligar(7499168162L);
        iphone.telefone.atender();
        iphone.telefone.iniciarCorreioDeVoz();
    }
}
