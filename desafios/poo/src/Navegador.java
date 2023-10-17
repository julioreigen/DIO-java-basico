public class Navegador {
    void exibirPagina(String site) {
        System.out.println("Exibindo página " + site);
    }

    void adicionarNovaAba(String site) {
        System.out.println(site + " adicionado à coleção de abas.");
    }

    void atualizarPagina() {
        System.out.println("🔃 recarregando...");
    }
}
